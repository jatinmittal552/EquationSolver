package com.example.equationsolver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void lorentz(View v) {
        int c = 300000000;
        EditText e1 = (EditText) findViewById(R.id.value_v);
        TextView t1 = (TextView) findViewById(R.id.result);
        String s1 = e1.getText().toString();
        float n1 = Float.parseFloat(s1);
        double r = 1/Math.pow(((Math.pow(c,2))-(Math.pow(n1,2)))/(Math.pow(c,2)),1/2);
        t1.setText(Double.toString(r));
    }

}