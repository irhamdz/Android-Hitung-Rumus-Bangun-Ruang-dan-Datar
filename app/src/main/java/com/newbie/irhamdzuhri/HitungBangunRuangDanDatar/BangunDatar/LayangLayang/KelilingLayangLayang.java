package com.newbie.irhamdzuhri.HitungBangunRuangDanDatar.BangunDatar.LayangLayang;

/**
 * Created by Irham Dzuhri on 25/11/2016.
 */

public class KelilingLayangLayang {
    double sisi_satu;
    double sisi_dua;

    public KelilingLayangLayang(double s1, double s2) {
        sisi_satu = s1;
        sisi_dua = s2;
    }

    public double hitung_keliling(){
        return 2*(sisi_satu+sisi_dua);
    }
}
