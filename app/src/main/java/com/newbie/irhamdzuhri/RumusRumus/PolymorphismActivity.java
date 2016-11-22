package com.newbie.irhamdzuhri.RumusRumus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PolymorphismActivity extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_polymorphism);

        t1 = (TextView) findViewById(R.id.text_view1);
        t2 = (TextView) findViewById(R.id.text_view2);
        t3 = (TextView) findViewById(R.id.text_view3);
        t4 = (TextView) findViewById(R.id.text_view4);
        t5 = (TextView) findViewById(R.id.text_view5);


        Polymorphism contoh = new Polymorphism();
        t1.setText(String.valueOf(contoh.display()));

        t2.setText(String.valueOf(contoh.display(11)));

        t3.setText(String.valueOf(contoh.display((float)15.26)));

        t4.setText(String.valueOf(contoh.display(11, 20)));

        t5.setText(contoh.display("Overloading"));
    }
}
