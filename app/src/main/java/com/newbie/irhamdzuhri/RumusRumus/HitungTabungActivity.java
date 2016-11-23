package com.newbie.irhamdzuhri.RumusRumus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.newbie.irhamdzuhri.RumusRumus.BangunRuang.Bola;
import com.newbie.irhamdzuhri.RumusRumus.BangunRuang.Tabung;

public class HitungTabungActivity extends AppCompatActivity {
    EditText edtJariJari, edtTinggi;
    TextView txtHasil;
    Double jari, tinggi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_tabung);

        initial();

    }

    private void initial() {
        edtJariJari = (EditText) findViewById(R.id.edt_jari_tabung);
        edtTinggi = (EditText) findViewById(R.id.edt_tinggi_tabung);
        txtHasil = (TextView) findViewById(R.id.txt_hasil_tabung);

        getSupportActionBar().setTitle("Tabung / Silinder");
    }

    public void hitung_luas(View view) {
        try {
            jari = Double.parseDouble(edtJariJari.getText().toString());
            tinggi = Double.parseDouble(edtTinggi.getText().toString());
            Tabung tabung = new Tabung(jari,tinggi);
            txtHasil.setText(String.valueOf("Hasil :\nLuas = " + tabung.hitung_luas()));


            //panjang = Double.parseDouble(edtPanjang.getText().toString());
            //lebar = Double.parseDouble(edtLebar.getText().toString());
            //luas = panjang * lebar;
            //txtLuas.setText(String.valueOf("Luas = " + luas));

        } catch (Exception e) {
            //jika salah satu kolom tidak diisi
            Toast toast = Toast.makeText(this, "Masukan Semua Nomor Yang Akan Dihitung", Toast.LENGTH_SHORT);
            TextView t = (TextView) toast.getView().findViewById(android.R.id.message);
            if (t != null) t.setGravity(Gravity.CENTER);
            toast.show();

        }
    }

    public void hitung_volume(View view) {
        try {
            jari = Double.parseDouble(edtJariJari.getText().toString());
            tinggi = Double.parseDouble(edtTinggi.getText().toString());
            Tabung tabung = new Tabung(jari,tinggi);
            txtHasil.setText(String.valueOf("Hasil :\nVolume = " + tabung.hitung_volume()));


            //panjang = Double.parseDouble(edtPanjang.getText().toString());
            //lebar = Double.parseDouble(edtLebar.getText().toString());
            //luas = panjang * lebar;
            //txtLuas.setText(String.valueOf("Luas = " + luas));

        } catch (Exception e) {
            //jika salah satu kolom tidak diisi
            Toast toast = Toast.makeText(this, "Masukan Semua Nomor Yang Akan Dihitung", Toast.LENGTH_SHORT);
            TextView t = (TextView) toast.getView().findViewById(android.R.id.message);
            if (t != null) t.setGravity(Gravity.CENTER);
            toast.show();

        }
    }
}
