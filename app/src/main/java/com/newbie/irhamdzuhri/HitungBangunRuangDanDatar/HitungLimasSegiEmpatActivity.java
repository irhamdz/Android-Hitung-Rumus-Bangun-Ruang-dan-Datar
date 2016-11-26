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

import com.newbie.irhamdzuhri.HitungBangunRuangDanDatar.BangunDatar.Segitiga.KelilingSegitiga;
import com.newbie.irhamdzuhri.HitungBangunRuangDanDatar.BangunDatar.Segitiga.LuasSegitiga;
import com.newbie.irhamdzuhri.HitungBangunRuangDanDatar.BangunRuang.LimasSegiEmpat.LuasAlasLimasSegiEmpat;
import com.newbie.irhamdzuhri.HitungBangunRuangDanDatar.BangunRuang.LimasSegiEmpat.LuasLimasSegiEmpat;
import com.newbie.irhamdzuhri.HitungBangunRuangDanDatar.BangunRuang.LimasSegiEmpat.LuasSisiTegakLimasSegiEmpat;
import com.newbie.irhamdzuhri.HitungBangunRuangDanDatar.BangunRuang.LimasSegiEmpat.VolumeLimasSegiEmpat;

public class HitungLimasSegiEmpatActivity extends AppCompatActivity {

    EditText edtText1, edtText2;
    TextView txtHasil, txtView1, txtView2;
    Button btnHitung;
    Double panjang, lebar, alas, tinggi, luas_alas,luas_sisi_tegak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_limas_segi_empat);

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

        getSupportActionBar().setTitle("Limas Segi Empat");
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_hitung_luas_alas:
                if (checked) {
                    txtView1.setText(getString(R.string.panjang) +" (p)");
                    txtView2.setText(getString(R.string.lebar)+" (l)");
                    edtText1.setText("");
                    edtText2.setText("");
                    btnHitung.setText(getString(R.string.hitung_luas_alas));

                    edtText1.setVisibility(View.VISIBLE);
                    edtText2.setVisibility(View.VISIBLE);

                    txtView1.setVisibility(View.VISIBLE);
                    txtView2.setVisibility(View.VISIBLE);

                    btnHitung.setVisibility(View.VISIBLE);
                    txtHasil.setVisibility(View.VISIBLE);
                    txtHasil.setText(getString(R.string.hasil));
                    break;
                }
            case R.id.radio_hitung_luas_sisi_tegak:
                if (checked) {
                    txtView1.setText(getString(R.string.alas));
                    txtView2.setText(getString(R.string.tinggi));
                    edtText1.setText("");
                    edtText2.setText("");
                    btnHitung.setText(getString(R.string.hitung_luas_sisi_tegak));

                    edtText1.setVisibility(View.VISIBLE);
                    edtText2.setVisibility(View.VISIBLE);

                    txtView1.setVisibility(View.VISIBLE);
                    txtView2.setVisibility(View.VISIBLE);

                    btnHitung.setVisibility(View.VISIBLE);
                    txtHasil.setVisibility(View.VISIBLE);
                    txtHasil.setText(getString(R.string.hasil));
                    break;
                }
            case R.id.radio_hitung_luas_limas:
                if (checked) {
                    txtView1.setText(getString(R.string.luas_alas));
                    txtView2.setText(getString(R.string.luas_sisi_tegak));
                    edtText1.setText("");
                    edtText2.setText("");
                    btnHitung.setText(getString(R.string.hitung_luas_limas));

                    edtText1.setVisibility(View.VISIBLE);
                    edtText2.setVisibility(View.VISIBLE);

                    txtView1.setVisibility(View.VISIBLE);
                    txtView2.setVisibility(View.VISIBLE);

                    btnHitung.setVisibility(View.VISIBLE);
                    txtHasil.setVisibility(View.VISIBLE);
                    txtHasil.setText(getString(R.string.hasil));
                    break;
                }
            case R.id.radio_hitung_volume:
                if (checked) {
                    txtView1.setText(getString(R.string.luas_alas));
                    txtView2.setText(getString(R.string.tinggi));
                    edtText1.setText("");
                    edtText2.setText("");
                    btnHitung.setText(getString(R.string.hitung_volume));

                    edtText1.setVisibility(View.VISIBLE);
                    edtText2.setVisibility(View.VISIBLE);

                    txtView1.setVisibility(View.VISIBLE);
                    txtView2.setVisibility(View.VISIBLE);

                    btnHitung.setVisibility(View.VISIBLE);
                    txtHasil.setVisibility(View.VISIBLE);
                    txtHasil.setText(getString(R.string.hasil));
                    break;
                }
        }
    }


    public void hitung(View view) {

        String buttonText = btnHitung.getText().toString();
        if (buttonText == getString(R.string.hitung_luas_alas)) {
            try {
                panjang = Double.parseDouble(edtText1.getText().toString());
                lebar = Double.parseDouble(edtText2.getText().toString());
                LuasAlasLimasSegiEmpat luasAlasLimasSegiEmpat = new LuasAlasLimasSegiEmpat (panjang,lebar);
                txtHasil.setText(String.valueOf("Hasil :\nLuas Alas = " + luasAlasLimasSegiEmpat.hitung_luas_alas()));


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
        } else if (buttonText == getString(R.string.hitung_luas_sisi_tegak)){
            try {
                alas = Double.parseDouble(edtText1.getText().toString());
                tinggi = Double.parseDouble(edtText2.getText().toString());
                LuasSisiTegakLimasSegiEmpat luasSisiTegakLimasSegiEmpat = new LuasSisiTegakLimasSegiEmpat(alas,tinggi);
                txtHasil.setText(String.valueOf("Hasil :\nLuas Sisi tegak = " + luasSisiTegakLimasSegiEmpat.hitung_luas_sisi_tegak()));


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
        }else if (buttonText == getString(R.string.hitung_luas_limas)){
            try {
                luas_alas = Double.parseDouble(edtText1.getText().toString());
                luas_sisi_tegak= Double.parseDouble(edtText2.getText().toString());
                LuasLimasSegiEmpat luasLimasSegiEmpat = new LuasLimasSegiEmpat (luas_alas,luas_sisi_tegak);
                txtHasil.setText(String.valueOf("Hasil :\nLuas Limas = " + luasLimasSegiEmpat.hitung_luas()));


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
        }else{
            try {
                luas_alas = Double.parseDouble(edtText1.getText().toString());
                tinggi= Double.parseDouble(edtText2.getText().toString());
                VolumeLimasSegiEmpat volumeLimasSegiEmpat = new VolumeLimasSegiEmpat (luas_alas,tinggi);
                txtHasil.setText(String.valueOf("Hasil :\nVolume Limas = " + volumeLimasSegiEmpat.hitung_volume()));


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
