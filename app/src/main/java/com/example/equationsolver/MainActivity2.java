package com.example.equationsolver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class MainActivity2 extends AppCompatActivity {

    Button btna;
    Button btnb;
    Button btnc;
    Button btnd;
    Button btne;
    Button btnf;
    Button btng;
    Button btnh;
    Button btni;
    Button btnj;
    Button btnk;
    Button btnl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.blue)));

        btna = findViewById(R.id.btn1);

        btna.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(getBaseContext(),MainActivity3.class);
                startActivity(intent);

            }
        });
        btnb = findViewById(R.id.btn2);

        btnb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(getBaseContext(),MainActivity4.class);
                startActivity(intent);

            }
        });
        btnc = findViewById(R.id.btn3);

        btnc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(getBaseContext(),MainActivity5.class);
                startActivity(intent);

            }
        });
        btnd = findViewById(R.id.btn4);

        btnd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(getBaseContext(),MainActivity6.class);
                startActivity(intent);

            }
        });
        btne = findViewById(R.id.btn5);

        btne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(getBaseContext(),MainActivity7.class);
                startActivity(intent);

            }
        });
        btnf = findViewById(R.id.btn6);

        btnf.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(getBaseContext(),MainActivity8.class);
                startActivity(intent);

            }
        });
        btng = findViewById(R.id.btn7);

        btng.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(getBaseContext(),MainActivity9.class);
                startActivity(intent);

            }
        });
        btnh = findViewById(R.id.btn8);

        btnh.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(getBaseContext(),MainActivity10.class);
                startActivity(intent);

            }
        });
        btni = findViewById(R.id.btn9);

        btni.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(getBaseContext(),MainActivity11.class);
                startActivity(intent);

            }
        });
        btnj = findViewById(R.id.btn10);

        btnj.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(getBaseContext(),MainActivity12.class);
                startActivity(intent);

            }
        });
        btnk = findViewById(R.id.btn11);

        btnk.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(getBaseContext(),MainActivity13.class);
                startActivity(intent);

            }
        });
        btnl = findViewById(R.id.btn12);

        btnl.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(getBaseContext(),MainActivity14.class);
                startActivity(intent);

            }
        });


    }
}