package com.newbie.irhamdzuhri.HitungBangunRuangDanDatar.BangunDatar;

/**
 * Created by Irham Dzuhri on 19/11/2016.
 */

public class PersegiPanjang {
    public double panjang;
    public double lebar;

    public PersegiPanjang(double pj, double lb) {
        panjang = pj;
        lebar = lb;

    }

    public double hitung_luas() {
        return panjang * lebar;
    }

    public double hitung_keliling() {
        return (2 * (panjang + lebar));
    }
}
