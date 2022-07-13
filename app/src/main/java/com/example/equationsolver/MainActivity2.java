package com.example.equationsolver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button btna;
    Button btnb;
    Button btnc;
    Button btnd;
    Button btne;
    Button btnf;
    Button btng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

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

    }
}