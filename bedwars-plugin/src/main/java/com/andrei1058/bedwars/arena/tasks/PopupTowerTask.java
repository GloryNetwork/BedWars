package com.andrei1058.bedwars.arena.tasks;

import com.andrei1058.bedwars.BedWars;
import com.andrei1058.bedwars.api.arena.IArena;
import com.andrei1058.bedwars.api.arena.team.TeamColor;
import com.andrei1058.bedwars.api.region.Region;
import com.andrei1058.bedwars.arena.Arena;
import com.andrei1058.bedwars.arena.Misc;
import com.andrei1058.bedwars.arena.popup.obj.PopupTower;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.List;

public class PopupTowerTask extends BukkitRunnable {

    private IArena arena;
    private PopupTower tower;
    private int[] i = {0};

    public PopupTowerTask(IArena arena, PopupTower tower) {
        this.arena = arena;
        this.tower = tower;
    }

    @Override
    public void run() {

        Location origin = tower.getOrigin();
        List<String> locations = tower.getLocations();

        if (Bukkit.getServer().getClass().getPackage().getName().contains("v1_8")) {
            origin.getWorld().playSound(origin, Sound.valueOf("CHICKEN_EGG_POP"), 1.0F, 0.5F);
        } else {
            origin.getWorld().playSound(origin, Sound.valueOf("ENTITY_CHICKEN_EGG"), 1.0F, 0.5F);
        }
        if (locations.size() + 1 == i[0] + 1) {
            cancel();
            return;
        }

        String c1 = locations.get(i[0]);
        if (c1.contains("ladder")) {
            int ldata = Integer.parseInt(c1.split("ladder")[1]);
            placeBlock(arena, tower.getChest(), c1, tower.getPlayer(), true, ldata);
        } else {
            placeBlock(arena, tower.getChest(), c1, tower.getPlayer(), false, 0);
        }
        if (locations.size() + 1 == i[0] + 2) {
            cancel();
            return;
        }
        String c2 = locations.get(i[0] + 1);
        if (c2.contains("ladder")) {
            int ldata = Integer.parseInt(c2.split("ladder")[1]);
            placeBlock(arena, tower.getChest(), c2, tower.getPlayer(), true, ldata);
        } else {
            placeBlock(arena, tower.getChest(), c2, tower.getPlayer(), false, 0);
        }
        i[0] = i[0] + 2;
    }

    private void placeBlock(IArena arena, Block block, String xyz, Player player, boolean ladder, int ladderdata) {

        TeamColor color = arena.getTeam(player).getColor();

        int x = Integer.parseInt(xyz.split(", ")[0]);
        int y = Integer.parseInt(xyz.split(", ")[1]);
        int z = Integer.parseInt(xyz.split(", ")[2]);

        if (block.getRelative(x, y, z).getType().equals(Material.AIR)) {
            if(Misc.isBuildProtected(block.getRelative(x, y, z).getLocation(), arena)) {
                return;
            }
            if (!ladder) {
                if (BedWars.getAPI().getVersionSupport().getVersion() >= 7) {
                    block.getRelative(x, y, z).setType(color.woolMaterial());
                    arena.addPlacedBlock(block.getRelative(x, y, z));
                } else {
                    block.getRelative(x, y, z).setType(Material.WOOL);
                    BedWars.getAPI().getVersionSupport().setBlockTeamColor(block.getRelative(x, y, z), color);
                    arena.addPlacedBlock(block.getRelative(x, y, z));
                }
            } else {
                block.getRelative(x, y, z).setType(Material.LADDER);
                block.getRelative(x, y, z).setData((byte)ladderdata);
                arena.addPlacedBlock(block.getRelative(x, y, z));
            }
        }
    }
}
