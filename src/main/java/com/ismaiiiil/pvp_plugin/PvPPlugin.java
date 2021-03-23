package com.ismaiiiil.pvp_plugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class PvPPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(this, this);

    }

    @EventHandler
    public void onTest(PlayerJoinEvent e){
        e.getPlayer().sendMessage("This is a test (player join) ");
    }



    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
