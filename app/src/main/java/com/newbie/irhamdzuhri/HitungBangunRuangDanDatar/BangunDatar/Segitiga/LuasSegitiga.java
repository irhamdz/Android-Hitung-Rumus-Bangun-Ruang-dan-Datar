package com.newbie.irhamdzuhri.HitungBangunRuangDanDatar.BangunDatar.Segitiga;

/**
 * Created by Irham Dzuhri on 24/11/2016.
 */

public class LuasSegitiga {
    public double alas;
    public double tinggi;

    public LuasSegitiga(double a,double t) {
        alas = a;
        tinggi = t;
    }

    public double hitung_luas() {
        return (alas * tinggi) / 2;
    }
}
