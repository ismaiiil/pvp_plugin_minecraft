package com.ismaiiiil.pvp_plugin;


import com.ismaiiiil.pvp_plugin.Commands.CommandManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;


public final class PvPPlugin extends JavaPlugin implements Listener {
    Player player;

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(this, this);
        getCommand("pvp").setExecutor(new CommandManager());
    }

    @EventHandler
    public void onTest(PlayerJoinEvent e){

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
