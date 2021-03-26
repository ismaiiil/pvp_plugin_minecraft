package com.ismaiiiil.pvp_plugin.Commands.SubCommands;

import com.ismaiiiil.pvp_plugin.Commands.SubCommand;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class StartFightCommand extends SubCommand{
    @Override
    public String getName() {
        return "fight";
    }

    @Override
    public String getDescription() {
        return "Start a fight between 2 players in a specific arena";
    }

    @Override
    public String getSyntax() {
        return "/pvp fight <player1> <player2> <arena>";
    }

    @Override
    public boolean perform(Player player, String[] args) {
        if (args.length == 3){
            Player player1 = Bukkit.getPlayer(args[0]);
            Player player2 = Bukkit.getPlayer(args[1]);
            player.sendMessage("Fight between" + args[0] + args[1] + "in arena" + args[2]);
            return true;
        }else{
            player.sendMessage("invalid syntax for command, Please use in the following way:");
            return false;
        }
    }
}
