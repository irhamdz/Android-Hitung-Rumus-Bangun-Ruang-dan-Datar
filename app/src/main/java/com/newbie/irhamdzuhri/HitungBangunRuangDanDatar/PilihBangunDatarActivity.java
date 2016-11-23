package com.newbie.irhamdzuhri.HitungBangunRuangDanDatar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

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
}
