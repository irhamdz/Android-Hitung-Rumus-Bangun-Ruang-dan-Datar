package com.newbie.irhamdzuhri.HitungBangunRuangDanDatar.BangunDatar.Trapesium;

/**
 * Created by Irham Dzuhri on 25/11/2016.
 */

public class LuasTrapesium {
    double AB;
    double CD;
    double tinggi;

    public LuasTrapesium(double ab, double cd, double t) {
        AB = ab;
        CD = cd;
        tinggi = t;
    }

    public double hitung_luas() {
        return ((AB + CD) * tinggi) / 2;
    }
}
