package com.andrei1058.bedwars.arena.popup;

import com.andrei1058.bedwars.BedWars;
import com.andrei1058.bedwars.api.arena.team.TeamColor;
import com.andrei1058.bedwars.arena.popup.obj.PopupTower;
import com.andrei1058.bedwars.arena.tasks.PopupTowerTask;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;

public class PopupListener implements Listener {

    @EventHandler(priority = EventPriority.HIGH)
    public void onPlace(BlockPlaceEvent e) {
        Player player = e.getPlayer();
        if (e.getBlockPlaced().getType() == Material.CHEST &&
                BedWars.getAPI().getArenaUtil().isPlaying(player) &&
                !e.isCancelled()) {
            e.setCancelled(true);
            Location loc = e.getBlockPlaced().getLocation();
            Block chest = e.getBlockPlaced();
            double rotation = ((player.getLocation().getYaw() - 90.0F) % 360.0F);

            PopupTower tower = null;
            if (rotation < 0.0D)
                rotation += 360.0D;
            if (45.0D <= rotation && rotation < 135.0D) {
                tower = new PopupTower("south", loc, chest, player);
            } else if (225.0D <= rotation && rotation < 315.0D) {
                tower = new PopupTower("north", loc, chest, player);
            } else if (135.0D <= rotation && rotation < 225.0D) {
                tower = new PopupTower("west", loc, chest, player);
            } else if (0.0D <= rotation && rotation < 45.0D) {
                tower = new PopupTower("east", loc, chest, player);
            } else if (315.0D <= rotation && rotation < 360.0D) {
                tower = new PopupTower("east", loc, chest, player);
            }

            if(tower == null) return;
            ItemStack itemInHand = player.getInventory().getItemInHand();
            if (itemInHand.getAmount() > 1) {
                itemInHand.setAmount(itemInHand.getAmount() - 1);
            } else {
                player.getInventory().setItemInHand(null);
            }
            new PopupTowerTask(BedWars.getAPI().getArenaUtil().getArenaByPlayer(player), tower).runTaskTimer(BedWars.plugin, 0L, 1L);
        }
    }
}
