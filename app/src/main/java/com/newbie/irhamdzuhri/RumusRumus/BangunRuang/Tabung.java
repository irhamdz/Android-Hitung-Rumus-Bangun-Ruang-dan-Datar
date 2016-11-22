package com.newbie.irhamdzuhri.RumusRumus.BangunRuang;

import com.newbie.irhamdzuhri.RumusRumus.BangunDatar.Lingkaran;

/**
 * Created by Irham Dzuhri on 22/11/2016.
 */

public class Tabung extends Lingkaran {
    double tinggi;

    public Tabung(double r, double t) {
        super(r);
        this.tinggi = t;
    }

    public double hitung_volume() {
        return Math.PI * Math.pow(jari_jari, 2) * tinggi;
    }

    public double hitung_luas() {
        return (2 * Math.PI * jari_jari * jari_jari) + Math.PI * (jari_jari * 2) * tinggi;
    }
}
