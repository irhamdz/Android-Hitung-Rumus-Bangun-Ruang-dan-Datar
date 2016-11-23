package com.newbie.irhamdzuhri.RumusRumus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PilihBangunRuangActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_bangun_ruang);
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
}
