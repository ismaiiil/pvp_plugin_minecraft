package com.ismaiiiil.pvp_plugin.Commands;

import com.ismaiiiil.pvp_plugin.Commands.SubCommands.FightSubCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class PvPCommandManager implements CommandExecutor {
    private ArrayList<SubCommand> subCommands;

    public PvPCommandManager(ArrayList<SubCommand> subCommands ){
        this.subCommands = subCommands;

    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length > 0){
            for (SubCommand subCommand:getSubCommands()) {
                if (args[0].equalsIgnoreCase(subCommand.getName())) {
                    subCommand.perform(sender, args);
                    return true;
                }
            }

        }else{
            return false;
        }
        return false;
    }

    public ArrayList<SubCommand> getSubCommands(){
        return subCommands;
    }



}
