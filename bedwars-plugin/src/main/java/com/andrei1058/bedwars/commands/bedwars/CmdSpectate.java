package com.andrei1058.bedwars.commands.bedwars;

import com.andrei1058.bedwars.api.arena.GameState;
import com.andrei1058.bedwars.api.arena.IArena;
import com.andrei1058.bedwars.api.command.ParentCommand;
import com.andrei1058.bedwars.api.command.SubCommand;
import com.andrei1058.bedwars.api.language.Language;
import com.andrei1058.bedwars.api.language.Messages;
import com.andrei1058.bedwars.arena.Arena;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;
import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.List;

import static com.andrei1058.bedwars.api.language.Language.getMsg;
import static com.andrei1058.bedwars.configuration.Permissions.hasPermission;

public class CmdSpectate extends BukkitCommand implements ParentCommand {

    public CmdSpectate(String name) {
        super(name);
        setAliases(Arrays.asList("spec"));
        setPermission("bw.spec");
    }

    @Override
    public boolean hasSubCommand(String name) {
        return false;
    }

    @Override
    public void addSubCommand(SubCommand subCommand) {
    }

    @Override
    public void sendSubCommands(Player p) {

    }

    @Override
    public List<SubCommand> getSubCommands() {
        return null;
    }

    @Override
    public boolean execute(CommandSender sender, String s, String[] args) {
        if (!(sender instanceof Player)) return true;
        Player p2 = (Player) sender;
        if (args.length != 1) {
            sender.sendMessage(Language.getMsg(p2, Messages.COMMAND_TP_USAGE));
            return true;
        }

        if (!hasPermission(p2)) {
            p2.sendMessage(getMsg(p2, Messages.COMMAND_FORCESTART_NO_PERM));
            return true;
        }

        Player p = Bukkit.getPlayer(args[0]);
        if (p == null) {
            sender.sendMessage(Language.getMsg(p2, Messages.COMMAND_TP_PLAYER_NOT_FOUND));
            return true;
        }
        IArena a = Arena.getArenaByPlayer(p);
        IArena a2 = Arena.getArenaByPlayer(p2);
        if (a == null) {
            sender.sendMessage(Language.getMsg(p2, Messages.COMMAND_TP_NOT_IN_ARENA));
            return true;
        }

        if (a.getStatus() == GameState.playing) {
            if (a2 != null) {
                if (a2.isPlayer(p2)) a2.removePlayer(p2, false);
                if (a2.isSpectator(p2)) {
                    if (a2.getArenaName().equals(a.getArenaName())) {
                        p2.teleport(p);
                        return true;
                    } else a2.removeSpectator(p2, false);
                }
            }
            a.addSpectator(p2, false, p.getLocation());
        } else {
            sender.sendMessage(Language.getMsg(((Player) sender), Messages.COMMAND_TP_NOT_STARTED));
        }

        return true;
    }
}
