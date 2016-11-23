package com.newbie.irhamdzuhri.HitungBangunRuangDanDatar.BangunDatar;

/**
 * Created by Irham Dzuhri on 21/11/2016.
 */

public class Lingkaran {
    public double jari_jari;

    public Lingkaran(double r) {
        jari_jari = r;
    }

    public double hitung_luas() {
        return Math.PI * Math.pow(jari_jari, 2);
    }

    public double hitung_keliling() {
        return (Math.PI * (2 * jari_jari));
    }
}
