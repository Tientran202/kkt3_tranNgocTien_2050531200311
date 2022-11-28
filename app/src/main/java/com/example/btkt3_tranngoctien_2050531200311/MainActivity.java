package com.example.btkt3_tranngoctien_2050531200311;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout llC,llT,llN,llCH,llLOG;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //anh xa
        llC=findViewById(R.id.cPT);
        llT=findViewById(R.id.tPT);
        llN=findViewById(R.id.nPT);
        llCH=findViewById(R.id.chPT);
        llLOG=findViewById(R.id.logPT);

        //su kien  cong
        llC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Cong.class);
                startActivity(i);
            }
        });

        //su kien tru
        llT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Tru.class);
                startActivity(i);
            }
        });

        //su kien nhan
        llN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Nhan.class);
                startActivity(i);
            }
        });

        //su kien chia
        llCH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Chia.class);
                startActivity(i);
            }
        });

        //su kien log
        llLOG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Log.class);
                startActivity(i);
            }
        });


    }
}