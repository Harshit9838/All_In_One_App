package com.example.internshipproject;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Bluetooth_Button extends AppCompatActivity {
    Button b1, b2, b3, b4;
    BluetoothAdapter ba;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth);
        b1 = (Button)findViewById(R.id.button40);
        b2 = (Button)findViewById(R.id.button41);
        b3 = (Button)findViewById(R.id.button42);
        b4 = (Button)findViewById(R.id.button43);
        t1 = (TextView)findViewById(R.id.textView21);
        ba = BluetoothAdapter.getDefaultAdapter();
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Bluetooth_Button.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(Bluetooth_Button.this, Phone_Services.class);
                startActivity(j);
                finish();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ba.enable();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ba.disable();
            }
        });
    }
}
