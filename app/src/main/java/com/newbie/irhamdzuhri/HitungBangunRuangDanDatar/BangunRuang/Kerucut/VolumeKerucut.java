package com.newbie.irhamdzuhri.HitungBangunRuangDanDatar.BangunRuang.Kerucut;

import com.newbie.irhamdzuhri.HitungBangunRuangDanDatar.BangunRuang.Tabung;

/**
 * Created by Irham Dzuhri on 22/11/2016.
 */

public class VolumeKerucut extends Tabung {
    public VolumeKerucut(double r, double t) {
        super(r, t);
    }

    public double hitung_volume() {
        return (1.0 / 3 * super.hitung_volume());
    }
}
