package com.example.internshipproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Basic_Operations extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6;
    EditText e1,e2;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_operations);
        b1 = (Button)findViewById(R.id.button16);
        b2 = (Button)findViewById(R.id.button17);
        b3 = (Button)findViewById(R.id.button18);
        b4 = (Button)findViewById(R.id.button19);
        b5 = (Button)findViewById(R.id.button20);
        b6 =(Button)findViewById(R.id.button88);
        e1 = (EditText)findViewById(R.id.editTextTextPersonName6);
        e2 = (EditText)findViewById(R.id.editTextTextPersonName7);
        t1 = (TextView)findViewById(R.id.textView3);
        t2 = (TextView)findViewById(R.id.textView17);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                Integer i1 = Integer.parseInt(s1);
                Integer i2 = Integer.parseInt(s2);
                Integer i3 = i1 + i2 ;
                String s3 = Integer.toString(i3);
                t1.setText(s3);
                Toast.makeText(Basic_Operations.this, "Addition"+i3, Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                Integer i1 = Integer.parseInt(s1);
                Integer i2 = Integer.parseInt(s2);
                Integer i3 = i1 - i2 ;
                String s3 = Integer.toString(i3);
                t1.setText(s3);
                Toast.makeText(Basic_Operations.this, "Difference"+i3, Toast.LENGTH_SHORT).show();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                Integer i1 = Integer.parseInt(s1);
                Integer i2 = Integer.parseInt(s2);
                Integer i3 = i1 * i2 ;
                String s3 = Integer.toString(i3);
                t1.setText(s3);
                Toast.makeText(Basic_Operations.this, "Product"+i3, Toast.LENGTH_SHORT).show();

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                Integer i1 = Integer.parseInt(s1);
                Integer i2 = Integer.parseInt(s2);
                Integer i3 = i1 / i2 ;
                String s3 = Integer.toString(i3);
                t1.setText(s3);
                Toast.makeText(Basic_Operations.this, "Divide"+i3, Toast.LENGTH_SHORT).show();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Basic_Operations.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(Basic_Operations.this,Calculator.class);
                startActivity(a);
                finish();
            }
        });
    }
}