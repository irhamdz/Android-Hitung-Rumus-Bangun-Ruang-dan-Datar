package com.newbie.irhamdzuhri.HitungBangunRuangDanDatar.BangunRuang;

import com.newbie.irhamdzuhri.HitungBangunRuangDanDatar.BangunDatar.Lingkaran;

/**
 * Created by Irham Dzuhri on 21/11/2016.
 */

public class Bola extends Lingkaran {

    public Bola(double r) {
        super(r);
    }

    public double hitung_luas() {
        return (4 * super.hitung_luas());
    }

    public double hitung_volume() {
        return (4.0 / 3 * Math.PI * (jari_jari*jari_jari*jari_jari));
    }
}
