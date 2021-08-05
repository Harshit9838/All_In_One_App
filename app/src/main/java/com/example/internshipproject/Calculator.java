package com.example.internshipproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        b1 = (Button)findViewById(R.id.button12);
        b2 = (Button)findViewById(R.id.button13);
        b3 = (Button)findViewById(R.id.button14);
        b4 = (Button)findViewById(R.id.button15);
        b5 = (Button)findViewById(R.id.button87);
        t1 = (TextView)findViewById(R.id.textView16);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Calculator.this,Basic_Operations.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(Calculator.this,Decimal_Solution.class);
                startActivity(j);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(Calculator.this,Text_To_Speech.class);
                startActivity(k);
                finish();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l=new Intent(Calculator.this,MainActivity.class);
                startActivity(l);
                finish();

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(Calculator.this,Third.class);
                startActivity(m);
                finish();
            }
        });
    }
}