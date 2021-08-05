package com.example.internshipproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Third extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;
    TextView t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        b1 = (Button)findViewById(R.id.button5);
        b2 = (Button)findViewById(R.id.button6);
        b3 = (Button)findViewById(R.id.button7);
        b4 = (Button)findViewById(R.id.button33);
        b5 = (Button)findViewById(R.id.button48);
        t1 = (TextView)findViewById(R.id.textView12);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Third.this,Media_Player.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(Third.this,Calculator.class);
                startActivity(j);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(Third.this,MainActivity.class);
                startActivity(k);
                finish();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l=new Intent(Third.this, Phone_Services.class);
                startActivity(l);
                finish();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(Third.this,Internet_Features.class);
                startActivity(m);
                finish();

            }
        });

    }
}