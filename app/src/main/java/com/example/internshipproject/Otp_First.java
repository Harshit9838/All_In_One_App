package com.example.internshipproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.hbb20.CountryCodePicker;

public class Otp_First extends AppCompatActivity {
    CountryCodePicker ccp;
    EditText e1;
    Button b1,b2,b3;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_first);
        b1 = (Button)findViewById(R.id.button90);
        b2 = (Button)findViewById(R.id.button91);
        b3 = (Button)findViewById(R.id.button92);
        e1 = (EditText)findViewById(R.id.editTextPhone);
        t1 = (TextView)findViewById(R.id.textView29);
        ccp = (CountryCodePicker)findViewById(R.id.ccp1);
        ccp.registerCarrierNumberEditText(e1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Otp_First.this,Otp_Second.class);
                i.putExtra("mobile",ccp.getFullNumberWithPlus().trim());
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j= new Intent(Otp_First.this,Internet_Features.class);
                startActivity(j);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(Otp_First.this,MainActivity.class);
                startActivity(k);
                finish();
            }
        });
    }
}