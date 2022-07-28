package com.example.equationsolver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public void dilation(View v) {
        int c = 300000000;
        EditText e1 = (EditText) findViewById(R.id.c7);
        EditText e2 = (EditText) findViewById(R.id.c102);
        TextView t1 = (TextView) findViewById(R.id.c13);
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();
        float n1 = Float.parseFloat(s1);
        float n2 = Float.parseFloat(s2);
        double r = n1/(Math.pow(((Math.pow(c,2))-(Math.pow(n2,2)))/(Math.pow(c,2)),1/2));
        t1.setText(Double.toString(r));
    }
}