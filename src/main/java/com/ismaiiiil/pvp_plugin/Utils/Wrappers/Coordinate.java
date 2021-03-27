package com.ismaiiiil.pvp_plugin.Utils.Wrappers;

import org.bukkit.Location;

import java.io.Serializable;

public class Coordinate implements Serializable {
    public double x;
    public double y;
    public double z;

    public Coordinate(Location location) {
        x = location.getX();
        y = location.getY();
        z = location.getZ();
    }

}
