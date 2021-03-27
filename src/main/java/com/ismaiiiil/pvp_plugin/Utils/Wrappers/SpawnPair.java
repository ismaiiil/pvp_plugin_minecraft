package com.ismaiiiil.pvp_plugin.Utils.Wrappers;

import java.io.Serializable;

public class SpawnPair implements Serializable {
    public Coordinate spawn2;
    public Coordinate spawn1;

    public SpawnPair(Coordinate spawn2, Coordinate spawn1) {
        this.spawn2 = spawn2;
        this.spawn1 = spawn1;
    }
}
