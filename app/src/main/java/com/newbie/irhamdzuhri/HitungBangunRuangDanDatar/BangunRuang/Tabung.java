package com.newbie.irhamdzuhri.HitungBangunRuangDanDatar.BangunRuang;

import com.newbie.irhamdzuhri.HitungBangunRuangDanDatar.BangunDatar.Lingkaran;

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
        return super.hitung_luas() * tinggi;
    }

    public double hitung_luas() {
        return (2 * super.hitung_luas()) + super.hitung_keliling() * tinggi;
    }
}
