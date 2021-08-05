package com.example.internshipproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Phone_Services extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7;
    TextView t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_services);
        b1=(Button)findViewById(R.id.button32);
        b2=(Button)findViewById(R.id.button34);
        b3=(Button)findViewById(R.id.button35);
        b4=(Button)findViewById(R.id.button36);
        b5=(Button)findViewById(R.id.button37);
        b6=(Button)findViewById(R.id.button38);
        b7=(Button)findViewById(R.id.button39);
        t1=(TextView)findViewById(R.id.textView20);

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Phone_Services.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j= new Intent(Phone_Services.this,Third.class);
                startActivity(j);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k= new Intent(Phone_Services.this, Bluetooth_Button.class);
                startActivity(k);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l=new Intent(Phone_Services.this,Torch_Button.class);
                startActivity(l);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(Phone_Services.this,Wifi_Button.class);
                startActivity(m);
                finish();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n=new Intent(Phone_Services.this,Camera_Button.class);
                startActivity(n);
                finish();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o=new Intent(Phone_Services.this,Video_Recoder.class);
                startActivity(o);
                finish();
            }
        });


    }
}