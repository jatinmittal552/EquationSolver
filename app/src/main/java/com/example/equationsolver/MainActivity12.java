package com.example.equationsolver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
    }
    public void half_life(View v) {
        EditText e1 = (EditText) findViewById(R.id.c206);
        EditText e2 = (EditText) findViewById(R.id.c209);
        EditText e3 = (EditText) findViewById(R.id.c212);
        TextView t1 = (TextView) findViewById(R.id.c215);
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();
        String s3 = e3.getText().toString();
        float n1 = Float.parseFloat(s1);
        float n2 = Float.parseFloat(s2);
        float n3 = Float.parseFloat(s3);
        double r = n1 * (Math.pow(0.5,n2/n3));
        t1.setText(Double.toString(r));
    }
}