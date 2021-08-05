package com.example.internshipproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Internet_Features extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internet_features);
        b1 = (Button)findViewById(R.id.button59);
        b2 = (Button)findViewById(R.id.button60);
        b3 = (Button)findViewById(R.id.button61);
        b4 = (Button)findViewById(R.id.button62);
        b5 = (Button)findViewById(R.id.button63);
        b6 = (Button)findViewById(R.id.button64);
        b7 = (Button)findViewById(R.id.button65);
        t1 = (TextView)findViewById(R.id.textView26);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Internet_Features.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(Internet_Features.this,Third.class);
                startActivity(j);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(Internet_Features.this,Browser_App.class);
                startActivity(k);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l=new Intent(Internet_Features.this,Realtime_Database.class);
                startActivity(l);
                finish();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(Internet_Features.this,Quiz_Game.class);
                startActivity(m);
                finish();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Internet_Features.this,Otp_First.class);
                startActivity(a);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b=new Intent(Internet_Features.this,Gmail_Button.class);
                startActivity(b);
                finish();
            }
        });
    }
}