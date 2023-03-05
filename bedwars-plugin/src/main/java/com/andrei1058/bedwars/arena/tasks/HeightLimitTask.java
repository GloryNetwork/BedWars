package com.andrei1058.bedwars.arena.tasks;

import com.andrei1058.bedwars.BedWars;
import com.andrei1058.bedwars.api.arena.GameState;
import com.andrei1058.bedwars.api.arena.IArena;
import com.andrei1058.bedwars.api.configuration.ConfigPath;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import static com.andrei1058.bedwars.api.language.Language.getMsg;

public class HeightLimitTask extends BukkitRunnable {

    private IArena arena;
    private int maxHeight;

    public HeightLimitTask(IArena arena) {
        this.arena = arena;
        this.maxHeight = arena.getConfig().getInt(ConfigPath.ARENA_CONFIGURATION_MAX_BUILD_Y);
    }

    @Override
    public void run() {
        if(arena.getStatus() != GameState.playing) {
            this.cancel();
            return;
        }
        if (arena.getPlayers().size() < 1) {
            return;
        }
        for(Player player : arena.getPlayers()) {
            if(player.getLocation().getY() > maxHeight) {
                return;
            }
            int distance = (int) (maxHeight - player.getLocation().getY());

            String message = BedWars.config.getString(ConfigPath.HEIGHT_LIMIT_INDICATOR)
                    .replaceAll("%distance%", String.valueOf(distance));

            BedWars.nms.playAction(player, ChatColor.translateAlternateColorCodes('&', message));
        }
    }
}
