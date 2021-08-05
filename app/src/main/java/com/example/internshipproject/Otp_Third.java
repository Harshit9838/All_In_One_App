package com.example.internshipproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Otp_Third extends AppCompatActivity {
    Button b1,b2;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_third);
        b1=(Button)findViewById(R.id.button96);
        b2=(Button)findViewById(R.id.button97);
        t1=(TextView)findViewById(R.id.textView14);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a= new Intent(Otp_Third.this,Otp_First.class);
                startActivity(a);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b= new Intent(Otp_Third.this,Third.class);
                startActivity(b);
                finish();
            }
        });
    }
}