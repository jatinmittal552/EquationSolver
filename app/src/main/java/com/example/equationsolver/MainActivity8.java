package com.example.equationsolver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
    }
    public void photon_moment(View v) {
        int c = 300000000;
        EditText e1 = (EditText) findViewById(R.id.c508);
        TextView t1 = (TextView) findViewById(R.id.c514);
        String s1 = e1.getText().toString();
        float n1 = Float.parseFloat(s1);
        double r =n1/c;
        t1.setText(Double.toString(r));
    }
}