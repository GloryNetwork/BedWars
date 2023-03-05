package com.andrei1058.bedwars.arena.popup.obj;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import java.util.List;

public class PopupTower {

    private List<String> locations;
    private Location origin;
    private Block chest;
    private Player player;

    public PopupTower(String direction, Location origin, Block chest, Player player) {
        switch (direction) {
            case "north":
                this.locations = PopupUtil.getNorthLocations();
                break;
            case "south":
                this.locations = PopupUtil.getSouthLocations();
                break;
            case "east":
                this.locations = PopupUtil.getEastLocations();
                break;
            default:
                this.locations = PopupUtil.getWestLocations();
                break;
        }
        this.origin = origin;
        this.chest = chest;
        this.player = player;
    }

    public List<String> getLocations() {
        return locations;
    }

    public Location getOrigin() {
        return origin;
    }

    public Block getChest() {
        return chest;
    }

    public Player getPlayer() {
        return player;
    }
}
