package com.ismaiiiil.pvp_plugin.Utils.Wrappers;

import com.ismaiiiil.pvp_plugin.Utils.Wrappers.SpawnPair;

import java.io.Serializable;
import java.util.HashMap;

public class MyConfig implements Serializable {
    public String welcomeMessasge = "faggit";

    public HashMap<String, SpawnPair> arenaLobby = new HashMap<>();
    public HashMap<String, SpawnPair> arenaSpawn = new HashMap<>();

    public MyConfig() {
    }



}