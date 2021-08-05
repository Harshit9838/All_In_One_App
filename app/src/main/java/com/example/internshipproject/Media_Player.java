package com.example.internshipproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Media_Player extends AppCompatActivity {
    Button b1,b2,b3,b4;
    MediaPlayer m1;
    TextView t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_player);
        b1 = (Button)findViewById(R.id.button8);
        b2 = (Button)findViewById(R.id.button9);
        b3 = (Button)findViewById(R.id.button10);
        b4 = (Button)findViewById(R.id.button11);
        t1 = (TextView)findViewById(R.id.textView15);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(Media_Player.this,Third.class);
                startActivity(k);
                finish();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent(Media_Player.this,MainActivity.class);
                startActivity(l);
                finish();
            }
        });
        m1=MediaPlayer.create(this,R.raw.h);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m1.start();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m1.pause();
            }
        });
    }
}