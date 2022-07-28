package com.example.equationsolver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
    }
    public void relavistic_energy(View v) {
        int c = 300000000;
        EditText e1 = (EditText) findViewById(R.id.c407);
        EditText e2 = (EditText) findViewById(R.id.c410);
        TextView t1 = (TextView) findViewById(R.id.c416);
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();
        float n1 = Float.parseFloat(s1);
        float n2 = Float.parseFloat(s2);
        double r = (n1*c*c/(Math.pow(((Math.pow(c,2))-(Math.pow(n1,2)))/(Math.pow(c,2)),1/2)))-(n1*c*c);
        t1.setText(Double.toString(r));
    }
}