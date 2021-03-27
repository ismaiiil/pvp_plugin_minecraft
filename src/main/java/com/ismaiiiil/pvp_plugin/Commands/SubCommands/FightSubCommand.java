package com.ismaiiiil.pvp_plugin.Commands.SubCommands;

import com.ismaiiiil.pvp_plugin.Commands.SubCommand;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FightSubCommand extends SubCommand{
    @Override
    public String getName() {
        return "fight";
    }

    @Override
    public String getDescription() {
        return "Starts a fight between 2 players in a specific arena";
    }

    @Override
    public String getSyntax() {
        return "/pvp fight <player1> <player2> <arena>";
    }

    @Override
    public void perform(CommandSender sender, String[] args) {

        if (args.length == 4){
            Player player1 = Bukkit.getPlayer(args[0]);
            sender.sendMessage("Fight between " + args[1] +" and " + args[2] + " in arena " + args[3]);
        }else{
            sender.sendMessage("Usage:" + getSyntax());
            sender.sendMessage("Description:" + getDescription());
        }
    }
}
