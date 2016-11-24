package com.newbie.irhamdzuhri.HitungBangunRuangDanDatar.BangunDatar.Segitiga;

/**
 * Created by Irham Dzuhri on 24/11/2016.
 */

public class KelilingSegitiga {
    double sisiA;
    double sisiB;
    double sisiC;


    public KelilingSegitiga(double sA, double sB, double sC) {
        sisiA = sA;
        sisiB = sB;
        sisiC = sC;
    }

    public double hitung_keliling() {
        return sisiA + sisiB + sisiC;
    }
}
