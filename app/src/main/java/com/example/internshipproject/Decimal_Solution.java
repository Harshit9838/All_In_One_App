package com.example.internshipproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Decimal_Solution extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6;
    TextView t1,t2;
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decimal_solution);
        b1 = (Button)findViewById(R.id.button21);
        b2 = (Button)findViewById(R.id.button22);
        b3 = (Button)findViewById(R.id.button23);
        b4 = (Button)findViewById(R.id.button24);
        b5 = (Button)findViewById(R.id.button25);
        b6 = (Button)findViewById(R.id.button89);
        e1 = (EditText)findViewById(R.id.editTextTextPersonName8);
        e2 = (EditText)findViewById(R.id.editTextTextPersonName9);
        t1 = (TextView)findViewById(R.id.textView4);
        t2 = (TextView)findViewById(R.id.textView18);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                Float i1 = Float.parseFloat(s1);
                Float i2 = Float.parseFloat(s2);
                Float i3 = i1 + i2 ;
                String s3 = Float.toString(i3);
                t1.setText(s3);
                Toast.makeText(Decimal_Solution.this, "Addition"+i3, Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                Float i1 = Float.parseFloat(s1);
                Float i2 = Float.parseFloat(s2);
                Float i3 = i1 - i2 ;
                String s3 = Float.toString(i3);
                t1.setText(s3);
                Toast.makeText(Decimal_Solution.this, "Differece"+i3, Toast.LENGTH_SHORT).show();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                Float i1 = Float.parseFloat(s1);
                Float i2 = Float.parseFloat(s2);
                Float i3 = i1 * i2 ;
                String s3 = Float.toString(i3);
                t1.setText(s3);
                Toast.makeText(Decimal_Solution.this, "Product"+i3, Toast.LENGTH_SHORT).show();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                Float i1 = Float.parseFloat(s1);
                Float i2 = Float.parseFloat(s2);
                Float i3 = i1 - i2 ;
                String s3 = Float.toString(i3);
                t1.setText(s3);
                Toast.makeText(Decimal_Solution.this, "Divide"+i3, Toast.LENGTH_SHORT).show();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Decimal_Solution.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Decimal_Solution.this,Calculator.class);
                startActivity(a);
                finish();
            }
        });
    }
}