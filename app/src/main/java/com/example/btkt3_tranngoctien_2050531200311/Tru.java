package com.example.btkt3_tranngoctien_2050531200311;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Tru extends AppCompatActivity {
    EditText edtsoA, edtsoB;
    TextView tvKQ;
    Button btTinh;

    float a, b, kq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tru);

        //anh xa
        edtsoA = findViewById(R.id.soaT);
        edtsoB = findViewById(R.id.sobT);
        btTinh = findViewById(R.id.btketquaT);
        tvKQ = findViewById(R.id.tvketquaT);


        //su kien bt cong
        btTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //gan gia tri
                a = Integer.parseInt(edtsoA.getText().toString());
                b = Integer.parseInt(edtsoB.getText().toString());
                kq = a - b;
                tvKQ.setText(String.valueOf(kq));
                Toast.makeText(Tru.this, a + " - " + b + " = " + kq, Toast.LENGTH_SHORT).show();
            }

        });
    }
}