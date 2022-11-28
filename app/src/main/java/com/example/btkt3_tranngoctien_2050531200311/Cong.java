package com.example.btkt3_tranngoctien_2050531200311;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Cong extends AppCompatActivity {

    EditText edtsoA, edtsoB;
    TextView tvKQ;
    Button btTinh;

    int a, b, kq;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cong);

        //anh xa
        edtsoA = findViewById(R.id.soaC);
        edtsoB = findViewById(R.id.sobC);
        btTinh = findViewById(R.id.btketquaC);
        tvKQ = findViewById(R.id.tvketquaC);


        //su kien bt cong
        btTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String x,y;
                x=edtsoA.getText().toString();
                y=edtsoB.getText().toString();
                if(x.isEmpty()||y.isEmpty()){
                    Toast.makeText(Cong.this, "Nhập đầy đủ 2 số", Toast.LENGTH_SHORT).show();
                }
                else   {
                    //gan gia tri
                    a = Integer.parseInt(edtsoA.getText().toString());
                    b = Integer.parseInt(edtsoB.getText().toString());
                    kq = a + b;
                    tvKQ.setText(String.valueOf(kq));
                    Toast.makeText(Cong.this, a + " + " + b + " = " + kq, Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
}
