package com.example.internshipproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Wifi_Button extends AppCompatActivity {
    Button b1,b2,b3,b4;
    WifiManager wm;
    TextView t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi_button);
        b1 = (Button)findViewById(R.id.button49);
        b2 = (Button)findViewById(R.id.button50);
        b3 = (Button)findViewById(R.id.button51);
        b4 = (Button)findViewById(R.id.button52);
        t1 = (TextView)findViewById(R.id.textView25);
        wm = (WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Wifi_Button.this, Phone_Services.class);
                startActivity(i);
                finish();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(Wifi_Button.this,MainActivity.class);
                startActivity(j);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                wm.setWifiEnabled(true);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                wm.setWifiEnabled(false);
            }
        });
    }
}