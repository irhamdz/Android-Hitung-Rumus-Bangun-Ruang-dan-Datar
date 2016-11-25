package com.newbie.irhamdzuhri.HitungBangunRuangDanDatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.newbie.irhamdzuhri.HitungBangunRuangDanDatar.BangunDatar.BelahKetupat.KelilingBelahKetupat;
import com.newbie.irhamdzuhri.HitungBangunRuangDanDatar.BangunDatar.BelahKetupat.LuasBelahKetupat;
import com.newbie.irhamdzuhri.HitungBangunRuangDanDatar.BangunDatar.LayangLayang.KelilingLayangLayang;
import com.newbie.irhamdzuhri.HitungBangunRuangDanDatar.BangunDatar.LayangLayang.LuasLayangLayang;

public class HitungBelahKetupatActivity extends AppCompatActivity {

    EditText edtText1, edtText2;
    TextView txtHasil, txtView1, txtView2;
    Button btnHitung;
    Double d1, d2, s1, s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_belah_ketupat);

        initial();
    }

    private void initial() {
        edtText1 = (EditText) findViewById(R.id.edt_text_view_1);
        edtText2 = (EditText) findViewById(R.id.edt_text_view_2);
        txtView1 = (TextView) findViewById(R.id.text_view_1);
        txtView2 = (TextView) findViewById(R.id.text_view_2);
        txtHasil = (TextView) findViewById(R.id.txt_hasil);
        btnHitung = (Button) findViewById(R.id.btn_hitung);


        edtText1.setVisibility(View.INVISIBLE);
        edtText2.setVisibility(View.INVISIBLE);

        btnHitung.setVisibility(View.INVISIBLE);
        txtHasil.setVisibility(View.INVISIBLE);

        getSupportActionBar().setTitle("Belah Ketupat");
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_hitung_luas:
                if (checked) {
                    txtView1.setText(getString(R.string.diagonal_horizontal) + " (d1)");
                    txtView2.setText(getString(R.string.diagonal_vertical) + " (d2)");
                    edtText1.setText("");
                    edtText2.setText("");
                    btnHitung.setText(getString(R.string.hitung_luas));

                    edtText1.setVisibility(View.VISIBLE);
                    edtText2.setVisibility(View.VISIBLE);

                    txtView1.setVisibility(View.VISIBLE);
                    txtView2.setVisibility(View.VISIBLE);

                    btnHitung.setVisibility(View.VISIBLE);
                    txtHasil.setVisibility(View.VISIBLE);
                    txtHasil.setText(getString(R.string.hasil));
                    break;
                }
            case R.id.radio_hitung_keliling:
                if (checked) {
                    txtView1.setText(getString(R.string.sisi));
                    edtText1.setText("");
                    btnHitung.setText(getString(R.string.hitung_keliling));

                    edtText1.setVisibility(View.VISIBLE);
                    edtText2.setVisibility(View.INVISIBLE);

                    txtView1.setVisibility(View.VISIBLE);
                    txtView2.setVisibility(View.INVISIBLE);

                    btnHitung.setVisibility(View.VISIBLE);
                    txtHasil.setVisibility(View.VISIBLE);
                    txtHasil.setText(getString(R.string.hasil));
                    break;
                }
        }
    }


    public void hitung(View view) {

        String buttonText = btnHitung.getText().toString();
        if (buttonText == getString(R.string.hitung_luas)) {
            try {
                d1 = Double.parseDouble(edtText1.getText().toString());
                d2 = Double.parseDouble(edtText2.getText().toString());
                LuasBelahKetupat luasBelahKetupat = new LuasBelahKetupat(d1, d2);
                txtHasil.setText(String.valueOf("Hasil :\nLuas = " + luasBelahKetupat.hitung_luas()));


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
        } else {
            try {
                s1 = Double.parseDouble(edtText1.getText().toString());
                KelilingBelahKetupat kelilingBelahKetupat = new KelilingBelahKetupat(s1);
                txtHasil.setText(String.valueOf("Hasil :\nKeliling = " + kelilingBelahKetupat.hitung_keliling()));


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
}
