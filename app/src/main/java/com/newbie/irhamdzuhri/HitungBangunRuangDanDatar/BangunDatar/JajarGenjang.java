package com.newbie.irhamdzuhri.HitungBangunRuangDanDatar.BangunDatar;

/**
 * Created by Irham Dzuhri on 23/11/2016.
 */

public class JajarGenjang {
    double alas;
    double tinggi;
    double sisi_miring;

    public JajarGenjang(double s, double a, double t) {
        sisi_miring = s;
        alas = a;
        tinggi = t;
    }

    public double hitung_luas() {
        return (alas * tinggi);
    }

    public double hitung_keliling() {
        return (2 * alas + 2 * sisi_miring);
    }

}
