package com.example.ontap_dethithu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class monitor2 extends AppCompatActivity {

    RadioButton nam,nu;
    CheckBox java,c_,android;
    Button choose,exit2,next2;
    private void anhxa(){
        nam = findViewById(R.id.rb1);
        nu = findViewById(R.id.rb2);
        java = findViewById(R.id.cb1);
        c_ = findViewById(R.id.cb2);
        android = findViewById(R.id.cb3);
        choose = findViewById(R.id.btnchoose);
        exit2 = findViewById(R.id.btnexit2);
        next2 = findViewById(R.id.btnnext2);

    }
    private void hienthi(){
        choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String monhoc = "";
                String gioitinh = "";
                if(nam.isChecked()){
                    gioitinh += "nam";
                } else if (nu.isChecked()) {
                    gioitinh += "nu";
                }
                ///

                if (java.isChecked()){
                    monhoc += "java";
                } else if (c_.isChecked()) {
                    monhoc += "C#";
                } else if (android.isChecked()) {
                    monhoc +="android";
                }
                String thongtin = "Mon hoc: "+monhoc+"\nGioi tinh: "+gioitinh;
                AlertDialog.Builder builder = new AlertDialog.Builder(monitor2.this);
                builder.setTitle("thong tin").setMessage(thongtin).setPositiveButton("ok",null).show();
            }
        });

    }
    private void thoat2(){
        exit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(monitor2.this, monitor1.class);
                startActivity(intent);
                finish();
            }
        });
    }
    private void chuyen(){
        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(monitor2.this, monitor3.class);
                startActivity(intent);
                Toast.makeText(monitor2.this,"dang chuyen ",Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_monitor2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        anhxa();
        hienthi();
        thoat2();
        chuyen();
    }
}