package com.ismaiiiil.pvp_plugin.Commands;

import com.ismaiiiil.pvp_plugin.Commands.SubCommands.StartFightCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class CommandManager implements CommandExecutor {
    private ArrayList<SubCommand> subCommands = new ArrayList<>();

    public CommandManager(){
        subCommands.add(new StartFightCommand());

    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player p = (Player) sender;

            if(args.length > 0){
                for (SubCommand subCommand:getSubCommands()) {
                    if (args[0].equalsIgnoreCase(subCommand.getName()));
                        return subCommand.perform(p, args);
                }

            }else{
                p.sendMessage("invalid syntax for command");
                return false;
            }
        }
        return true;
    }

    public ArrayList<SubCommand> getSubCommands(){
        return subCommands;
    }



}
