package com.newbie.irhamdzuhri.RumusRumus.BangunRuang;

/**
 * Created by Irham Dzuhri on 22/11/2016.
 */

public class LuasKerucut extends Tabung {

    double garis_lukis;

    public LuasKerucut(double r, double t, double s) {
        super(r, t);
        this.garis_lukis = s;
    }

    public double hitung_luas() {
        return (Math.PI * Math.pow(jari_jari, 2)) + (Math.PI * jari_jari * garis_lukis);
    }
}
