package com.newbie.irhamdzuhri.HitungBangunRuangDanDatar.BangunDatar.Trapesium;

/**
 * Created by Irham Dzuhri on 25/11/2016.
 */

public class KelilingTrapesium {
    double AB, BC, CD, DA;

    public KelilingTrapesium(double ab, double bc, double cd, double da) {
        AB = ab;
        BC = bc;
        CD = cd;
        DA = da;
    }

    public double hitung_keliling() {
        return AB + BC + CD + DA;
    }
}
