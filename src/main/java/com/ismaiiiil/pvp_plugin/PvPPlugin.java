package com.ismaiiiil.pvp_plugin;


import com.ismaiiiil.pvp_plugin.Commands.PvPCommandManager;
import com.ismaiiiil.pvp_plugin.Commands.SubCommand;
import com.ismaiiiil.pvp_plugin.Commands.SubCommands.FightSubCommand;
import com.ismaiiiil.pvp_plugin.Utils.ConfigLoader;
import com.ismaiiiil.pvp_plugin.Utils.Wrappers.Coordinate;
import com.ismaiiiil.pvp_plugin.Utils.Wrappers.MyConfig;
import com.ismaiiiil.pvp_plugin.Utils.Wrappers.SpawnPair;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public final class PvPPlugin extends JavaPlugin implements Listener {

    public MyConfig myConfig;
    public File configFile;
    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(this, this);

        getCommand("pvp").setExecutor(new PvPCommandManager(initPvpSubcommands()));

        saveDefaultConfig();

        configFile = new File(this.getDataFolder().getPath() + File.separator + "myconfig.json");
        myConfig = ConfigLoader.loadConfig(MyConfig.class, configFile);



    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        //myConfig.arenaSpawn.put("arena1", new SpawnPair(new Coordinate(e.getPlayer().getLocation()), new Coordinate(e.getPlayer().getLocation())));
        //ConfigLoader.saveConfig(myConfig, configFile);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private ArrayList<SubCommand> initPvpSubcommands(){
        ArrayList<SubCommand> pvpSubcommands = new ArrayList<>();
        pvpSubcommands.add(new FightSubCommand());
        return pvpSubcommands;
    }


}


