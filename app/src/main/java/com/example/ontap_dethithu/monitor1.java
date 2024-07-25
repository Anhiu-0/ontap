package com.example.ontap_dethithu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class monitor1 extends AppCompatActivity {

    EditText user,pass;
    Button signin,exit;
    private void anhxa(){
        user = findViewById(R.id.etuser);
        pass = findViewById(R.id.etpass);
        signin = findViewById(R.id.btnsignin);
        exit = findViewById(R.id.btnexit);
    }
    private void dangnhap(){
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String checkusername = user.getText().toString();
                String checkpassword = pass.getText().toString();
                if(checkusername.isEmpty() || checkpassword.isEmpty()){
                    Toast.makeText(monitor1.this,"vui long dien day du thong tin",Toast.LENGTH_SHORT).show();
                } else if (checkusername.equals("cnttk13hn") && checkpassword.equals("cnttk13")) {
                    Toast.makeText(monitor1.this,"dang nhap thanh cong",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(monitor1.this, monitor2.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(monitor1.this,"dien lai thong tin",Toast.LENGTH_SHORT).show();
                    user.setText("");
                    pass.setText("");
                }
            }
        });

    }
    private void thoat(){
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_monitor1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
      anhxa();
      dangnhap();
      thoat();

    }
}