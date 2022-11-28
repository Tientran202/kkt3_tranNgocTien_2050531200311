package com.example.btkt3_tranngoctien_2050531200311;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Nhan extends AppCompatActivity {
    EditText edtsoA, edtsoB;
    TextView tvKQ;
    Button btTinh;

    float a, b, kq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhan);


        //anh xa
        edtsoA = findViewById(R.id.soaN);
        edtsoB = findViewById(R.id.sobN);
        btTinh = findViewById(R.id.btketquaN);
        tvKQ = findViewById(R.id.tvketquaN);


        //su kien bt cong
        btTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //gan gia tri
                a = Integer.parseInt(edtsoA.getText().toString());
                b = Integer.parseInt(edtsoB.getText().toString());
                kq = a * b;
                tvKQ.setText(String.valueOf(kq));
                Toast.makeText(Nhan.this, a + " * " + b + " = " + kq, Toast.LENGTH_SHORT).show();
            }

        });
    }
}