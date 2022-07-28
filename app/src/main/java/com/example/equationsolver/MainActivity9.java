package com.example.equationsolver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
    }
    public void momentum(View v) {
        int c = 300000000;
        EditText e1 = (EditText) findViewById(R.id.c206);
        EditText e2 = (EditText) findViewById(R.id.c209);
        TextView t1 = (TextView) findViewById(R.id.c215);
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();
        float n1 = Float.parseFloat(s1);
        float n2 = Float.parseFloat(s2);
        double r1 = n1*c;
        double r2 = n2*c*c;
        double r = (Math.pow(r1, 2)) + (Math.pow(r2, 2));
        double r3 = Math.pow(r,0.5);
        t1.setText(Double.toString(r3));
    }
}