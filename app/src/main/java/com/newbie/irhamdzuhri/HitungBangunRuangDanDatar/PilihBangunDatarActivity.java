package com.newbie.irhamdzuhri.HitungBangunRuangDanDatar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PilihBangunDatarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_bangun_datar);
    }

    public void persegiPanjang(View view) {
        Intent intent = new Intent(PilihBangunDatarActivity.this, HitungPersegiPanjangActivity.class);
        startActivity(intent);
    }

    public void lingkaran(View view) {
        Intent intent = new Intent(PilihBangunDatarActivity.this, HitungLingkaranActivity.class);
        startActivity(intent);
    }

    public void persegi(View view) {
        Intent intent = new Intent(PilihBangunDatarActivity.this, HitungPersegiActivity.class);
        startActivity(intent);
    }

    public void segitiga(View view) {
        Intent intent = new Intent(PilihBangunDatarActivity.this, HitungSegitigaActivity.class);
        startActivity(intent);
    }

    public void trapesium(View view) {
        Intent intent = new Intent(PilihBangunDatarActivity.this, HitungTrapesiumActivity.class);
        startActivity(intent);
    }

    public void layangLayang(View view) {
        Intent intent = new Intent(PilihBangunDatarActivity.this, HitungLayangLayangActivity.class);
        startActivity(intent);
    }

    public void belahKetupat(View view) {
        Intent intent = new Intent(PilihBangunDatarActivity.this, HitungBelahKetupatActivity.class);
        startActivity(intent);
    }

    public void jajarGenjang(View view) {
        Intent intent = new Intent(PilihBangunDatarActivity.this, HitungJajarGenjangActivity.class);
        startActivity(intent);
    }
}
