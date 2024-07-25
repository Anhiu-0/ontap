package com.example.ontap_dethithu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class monitor3 extends AppCompatActivity {

    TextView tao,cam,le,hong,dao;
    Button next3;
    private void anhxa(){
        tao = findViewById(R.id.qua1);
        cam = findViewById(R.id.qua2);
        le = findViewById(R.id.qua3);
        hong = findViewById(R.id.qua4);
        dao = findViewById(R.id.qua5);
        next3 = findViewById(R.id.btnnext3);
    }
    private void chuyen(){
        next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(monitor3.this, monitor4.class);
                startActivity(intent);
                Toast.makeText(monitor3.this,"dang chuyen ",Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void qtao(){
        tao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(monitor3.this,"qua tao",Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void qcam(){
        cam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(monitor3.this,"qua cam",Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void qle(){
        le.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(monitor3.this,"qua le",Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void qhong(){
        hong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(monitor3.this,"qua hong",Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void qdao(){
        dao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(monitor3.this,"qua dao",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_monitor3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        anhxa();
        qtao();
        qcam();
        qle();
        qhong();
        qdao();
        chuyen();
    }
}