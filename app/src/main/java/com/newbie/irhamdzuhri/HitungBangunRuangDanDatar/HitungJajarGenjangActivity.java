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

import com.newbie.irhamdzuhri.HitungBangunRuangDanDatar.BangunDatar.JajarGenjang.KelilingJajarGenjang;
import com.newbie.irhamdzuhri.HitungBangunRuangDanDatar.BangunDatar.JajarGenjang.LuasJajarGenjang;
import com.newbie.irhamdzuhri.HitungBangunRuangDanDatar.BangunDatar.Trapesium.KelilingTrapesium;
import com.newbie.irhamdzuhri.HitungBangunRuangDanDatar.BangunDatar.Trapesium.LuasTrapesium;

public class HitungJajarGenjangActivity extends AppCompatActivity {

    EditText edtText1, edtText2, edtText3, edtText4;
    TextView txtHasil, txtView1, txtView2, txtView3, txtView4;
    Button btnHitung;
    Double alas,tinggi, sisiAB, sisiBC, sisiCD, sisiDA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_jajar_genjang);

        initial();
    }

    private void initial() {
        edtText1 = (EditText) findViewById(R.id.edt_text_view_1);
        edtText2 = (EditText) findViewById(R.id.edt_text_view_2);
        edtText3 = (EditText) findViewById(R.id.edt_text_view_3);
        edtText4 = (EditText) findViewById(R.id.edt_text_view_4);
        txtView1 = (TextView) findViewById(R.id.text_view_1);
        txtView2 = (TextView) findViewById(R.id.text_view_2);
        txtView3 = (TextView) findViewById(R.id.text_view_3);
        txtView4 = (TextView) findViewById(R.id.text_view_4);
        txtHasil = (TextView) findViewById(R.id.txt_hasil);
        btnHitung = (Button) findViewById(R.id.btn_hitung);


        edtText1.setVisibility(View.INVISIBLE);
        edtText2.setVisibility(View.INVISIBLE);
        edtText3.setVisibility(View.INVISIBLE);
        edtText4.setVisibility(View.INVISIBLE);

        btnHitung.setVisibility(View.INVISIBLE);
        txtHasil.setVisibility(View.INVISIBLE);

        getSupportActionBar().setTitle("Jajar Genjang");
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_hitung_luas:
                if (checked) {
                    txtView1.setText(getString(R.string.alas));
                    txtView2.setText(getString(R.string.tinggi));
                    edtText1.setText("");
                    edtText2.setText("");
                    btnHitung.setText(getString(R.string.hitung_luas));

                    edtText1.setVisibility(View.VISIBLE);
                    edtText2.setVisibility(View.VISIBLE);
                    edtText3.setVisibility(View.INVISIBLE);
                    edtText4.setVisibility(View.INVISIBLE);

                    txtView1.setVisibility(View.VISIBLE);
                    txtView2.setVisibility(View.VISIBLE);
                    txtView3.setVisibility(View.INVISIBLE);
                    txtView4.setVisibility(View.INVISIBLE);

                    btnHitung.setVisibility(View.VISIBLE);
                    txtHasil.setVisibility(View.VISIBLE);
                    txtHasil.setText(getString(R.string.hasil));
                    break;
                }
            case R.id.radio_hitung_keliling:
                if (checked) {
                    txtView1.setText(getString(R.string.sisiAB));
                    txtView2.setText(getString(R.string.sisiBC));
                    txtView3.setText(getString(R.string.sisiCD));
                    txtView4.setText(getString(R.string.sisiDA));
                    edtText1.setText("");
                    edtText2.setText("");
                    edtText3.setText("");
                    edtText4.setText("");
                    btnHitung.setText(getString(R.string.hitung_keliling));

                    edtText1.setVisibility(View.VISIBLE);
                    edtText2.setVisibility(View.VISIBLE);
                    edtText3.setVisibility(View.VISIBLE);
                    edtText4.setVisibility(View.VISIBLE);

                    txtView1.setVisibility(View.VISIBLE);
                    txtView2.setVisibility(View.VISIBLE);
                    txtView3.setVisibility(View.VISIBLE);
                    txtView4.setVisibility(View.VISIBLE);

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
               alas = Double.parseDouble(edtText1.getText().toString());
                tinggi = Double.parseDouble(edtText2.getText().toString());
                LuasJajarGenjang luasJajarGenjang = new LuasJajarGenjang(alas,tinggi);
                txtHasil.setText(String.valueOf("Hasil :\nLuas = " + luasJajarGenjang.hitung_luas()));


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
                sisiAB = Double.parseDouble(edtText1.getText().toString());
                sisiBC = Double.parseDouble(edtText2.getText().toString());
                sisiCD = Double.parseDouble(edtText3.getText().toString());
                sisiDA = Double.parseDouble(edtText4.getText().toString());
                KelilingJajarGenjang kelilingJajarGenjang = new KelilingJajarGenjang(sisiAB, sisiBC, sisiCD,sisiDA);
                txtHasil.setText(String.valueOf("Hasil :\nKeliling = " + kelilingJajarGenjang.hitung_keliling()));


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
