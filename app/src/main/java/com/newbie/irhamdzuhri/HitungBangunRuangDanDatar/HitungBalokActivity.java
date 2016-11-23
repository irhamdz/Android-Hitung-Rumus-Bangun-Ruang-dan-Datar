package com.newbie.irhamdzuhri.HitungBangunRuangDanDatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.newbie.irhamdzuhri.HitungBangunRuangDanDatar.BangunRuang.Balok;

public class HitungBalokActivity extends AppCompatActivity {

    EditText edtPanjang,edtLebar,edtTinggi;
    TextView txtHasil;
    Double panjang,lebar,tinggi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_balok);

        initial();

    }

    private void initial() {
        edtPanjang = (EditText) findViewById(R.id.edt_panjang);
        edtLebar = (EditText) findViewById(R.id.edt_lebar);
        edtTinggi = (EditText) findViewById(R.id.edt_tinggi);
        txtHasil = (TextView) findViewById(R.id.txt_hasil);

        getSupportActionBar().setTitle("Balok");
    }

    public void hitung_luas(View view) {
        try {
            panjang = Double.parseDouble(edtPanjang.getText().toString());
            lebar = Double.parseDouble(edtLebar.getText().toString());
            tinggi = Double.parseDouble(edtTinggi.getText().toString());
            Balok balok = new Balok(panjang, lebar,tinggi);
            txtHasil.setText(String.valueOf("Hasil :\nLuas = " + balok.hitung_luas()));


            //panjang = Double.parseDouble(edtPanjang.getText().toString());
            //lebar = Double.parseDouble(edtLebar.getText().toString());
            //luas = panjang * lebar;
            //txtLuas.setText(String.valueOf("Luas = " + luas));

        } catch (Exception e) {
            //jika salah satu kolom tidak diisi
            Toast toast = Toast.makeText(this, ""+getString(R.string.masukan_nomor), Toast.LENGTH_SHORT);
            TextView t = (TextView) toast.getView().findViewById(android.R.id.message);
            if (t != null) t.setGravity(Gravity.CENTER);
            toast.show();

        }
    }

    public void hitung_keliling(View view) {
        try {
            panjang = Double.parseDouble(edtPanjang.getText().toString());
            lebar = Double.parseDouble(edtLebar.getText().toString());
            tinggi = Double.parseDouble(edtTinggi.getText().toString());
            Balok balok = new Balok(panjang, lebar,tinggi);
            txtHasil.setText(String.valueOf("Hasil :\nKeliling = " + balok.hitung_keliling()));


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
            panjang = Double.parseDouble(edtPanjang.getText().toString());
            lebar = Double.parseDouble(edtLebar.getText().toString());
            tinggi = Double.parseDouble(edtTinggi.getText().toString());
            Balok balok = new Balok(panjang, lebar,tinggi);
            txtHasil.setText(String.valueOf("Hasil :\nVolume = " + balok.hitung_volume()));


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
