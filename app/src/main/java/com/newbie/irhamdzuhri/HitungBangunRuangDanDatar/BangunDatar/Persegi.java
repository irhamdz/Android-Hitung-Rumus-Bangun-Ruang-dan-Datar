package com.newbie.irhamdzuhri.HitungBangunRuangDanDatar.BangunDatar;

/**
 * Created by Irham Dzuhri on 23/11/2016.
 */

public class Persegi {
    double sisi;

    public Persegi(double s) {
        sisi = s;
    }

    public double hitung_luas() {
        return (Math.pow(sisi, 2));
    }

    public double hitung_keliling() {
        return (4 * sisi);
    }
}
