package com.newbie.irhamdzuhri.HitungBangunRuangDanDatar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PilihBangunRuangActivity extends AppCompatActivity {

    Button btnHide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_bangun_ruang);

        btnHide = (Button) findViewById(R.id.btn_hide);
        btnHide.setVisibility(View.INVISIBLE);
    }

    public void tabung(View view) {
        Intent intent = new Intent(PilihBangunRuangActivity.this, HitungTabungActivity.class);
        startActivity(intent);
    }

    public void kerucut(View view) {
        Intent intent = new Intent(PilihBangunRuangActivity.this, HitungKerucutActivity.class);
        startActivity(intent);
    }

    public void balok(View view) {
        Intent intent = new Intent(PilihBangunRuangActivity.this, HitungBalokActivity.class);
        startActivity(intent);
    }

    public void Bola(View view) {
        Intent intent = new Intent(PilihBangunRuangActivity.this, HitungBolaActivity.class);
        startActivity(intent);
    }

    public void kubus(View view) {
        Intent intent = new Intent(PilihBangunRuangActivity.this, HitungKubusActivity.class);
        startActivity(intent);
    }

    public void limasSegiEmpat(View view) {
        Intent intent = new Intent(PilihBangunRuangActivity.this, HitungLimasSegiEmpatActivity.class);
        startActivity(intent);
    }
}
