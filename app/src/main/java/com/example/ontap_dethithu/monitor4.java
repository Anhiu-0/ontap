package com.example.ontap_dethithu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class monitor4 extends AppCompatActivity {

    ListView lv ;
    Button hienthi4;
    ArrayList<congnhan> cnlist = new ArrayList<>();
    congnhanadater adapter;

    private void anhxa(){
        lv = findViewById(R.id.lv1);
        hienthi4 = findViewById(R.id.btnhienthi4);
    }
    private String loadjson() {
        String json =null;
        try {
            InputStream inputStream = getAssets().open("congnhan.json");
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            json = new String(buffer, StandardCharsets.UTF_8);
            laydulieu(json);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return json;
    }
    private void laydulieu(String json) {

        try {
            JSONObject jsonObject = new JSONObject(json);
            JSONArray canboArray = jsonObject.getJSONArray("dscongnhan");
            for (int i = 0; i < canboArray.length(); i++) {

                JSONObject dscongnhan = canboArray.getJSONObject(i);

                String ht = dscongnhan.getString("hoten");
                String lg = dscongnhan.getString("luong");

                cnlist.add(new congnhan("hotencn: "+ht,"luongcn: "+ lg));

            }

            adapter = new congnhanadater(this,cnlist);
            lv.setAdapter(adapter);

        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

    }
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_monitor4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        anhxa();
        hienthi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadjson();
            }
        });
    }
}