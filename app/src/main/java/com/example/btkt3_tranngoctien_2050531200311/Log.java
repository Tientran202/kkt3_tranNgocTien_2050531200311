package com.example.btkt3_tranngoctien_2050531200311;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Log extends AppCompatActivity {
    EditText edtsoA, edtsoB;
    TextView tvKQ;
    Button btTinh;

    float a, b, kq;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);


        //anh xa
        edtsoA = findViewById(R.id.soaL);
        btTinh = findViewById(R.id.btketquaL);
        tvKQ = findViewById(R.id.tvketquaL);


        //su kien bt cong
        btTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //gan gia tri
                a = Integer.parseInt(edtsoA.getText().toString());
                tvKQ.setText(String.valueOf(kq));
                Toast.makeText(Log.this, a + " : " + b + " = " + kq, Toast.LENGTH_SHORT).show();
            }

        });
    }
}