package com.newbie.irhamdzuhri.RumusRumus.BangunDatar;

/**
 * Created by Irham Dzuhri on 21/11/2016.
 */

public class Segitiga {
    public double sisi;
    public double alas;
    public double tinggi;

    public Segitiga(double s, double a, double t) {
        sisi = s;
        alas = a;
        tinggi = t;
    }

    public double hitung_luas() {
        return (alas * tinggi) / 2;
    }

    public double hitung_keliling() {
        return sisi + sisi + sisi;
    }
}
