package com.newbie.irhamdzuhri.RumusRumus.BangunRuang;

import com.newbie.irhamdzuhri.RumusRumus.BangunDatar.PersegiPanjang;

/**
 * Created by Irham Dzuhri on 19/11/2016.
 */

public class Balok extends PersegiPanjang {
    double tinggi;

    public Balok(double pj, double lb, double t) {
        super(pj, lb);
        tinggi = t;
    }

    public double hitung_luas() {
        return (2 * (super.hitung_luas() + super.panjang * tinggi + super.lebar * tinggi));
    }

    public double hitung_volume() {
        return (super.hitung_luas() * tinggi);
    }

    public double hitung_keliling() {
        return (4 * (super.panjang + super.lebar + tinggi));
    }
}
