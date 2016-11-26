package com.newbie.irhamdzuhri.HitungBangunRuangDanDatar.BangunDatar.JajarGenjang;

/**
 * Created by Irham Dzuhri on 23/11/2016.
 */

public class LuasJajarGenjang {
    double alas;
    double tinggi;

    public LuasJajarGenjang(double a, double t) {
        alas = a;
        tinggi = t;
    }

    public double hitung_luas() {
        return (alas * tinggi);
    }

}
