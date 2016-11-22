package com.newbie.irhamdzuhri.RumusRumus.BangunRuang;

import com.newbie.irhamdzuhri.RumusRumus.BangunDatar.Lingkaran;

/**
 * Created by Irham Dzuhri on 21/11/2016.
 */

public class Bola extends Lingkaran {

    public Bola(double r) {
        super(r);
    }

    public double hitung_luas() {
        return (4 * Math.PI * Math.pow(jari_jari, 2));
    }

    public double hitung_volume() {
        return (4.0 / 3 * Math.PI * Math.pow(jari_jari,3));
    }
}
