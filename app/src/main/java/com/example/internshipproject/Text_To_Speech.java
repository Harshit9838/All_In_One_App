package com.example.internshipproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class Text_To_Speech extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6;
    EditText e1,e2;
    TextView t1,t2;
    TextToSpeech ts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_to_speech);
        b1 = (Button)findViewById(R.id.button26);
        b2 = (Button)findViewById(R.id.button27);
        b3 = (Button)findViewById(R.id.button28);
        b4 = (Button)findViewById(R.id.button29);
        b5 = (Button)findViewById(R.id.button30);
        e1 = (EditText)findViewById(R.id.editTextTextPersonName10);
        e2 = (EditText)findViewById(R.id.editTextTextPersonName11);
        t1 = (TextView)findViewById(R.id.textView5);
        t2 = (TextView)findViewById(R.id.textView19);
        b6 = (Button)findViewById(R.id.button31);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Text_To_Speech.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(Text_To_Speech.this,Calculator.class);
                startActivity(j);
                finish();
            }
        });
        ts= new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                ts.setLanguage(Locale.ENGLISH);
                ts.setSpeechRate(0.5f);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                ts.speak(s1, TextToSpeech.QUEUE_FLUSH, null);
                String s2 = e2.getText().toString();
                ts.speak(s2, TextToSpeech.QUEUE_FLUSH, null);
                Integer i1 = Integer.parseInt(s1);
                Integer i2 = Integer.parseInt(s2);
                Integer i3 = i1 + i2;
                String s3 = Integer.toString(i3);
                t1.setText(s3);
                ts.speak(s3, TextToSpeech.QUEUE_FLUSH, null);
                Toast.makeText(Text_To_Speech.this, "Sum"+i3, Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                ts.speak(s1, TextToSpeech.QUEUE_FLUSH, null);
                String s2 = e2.getText().toString();
                ts.speak(s2, TextToSpeech.QUEUE_FLUSH, null);
                Integer i1 = Integer.parseInt(s1);
                Integer i2 = Integer.parseInt(s2);
                Integer i3 = i1 - i2;
                String s3 = Integer.toString(i3);
                t1.setText(s3);
                ts.speak(s3, TextToSpeech.QUEUE_FLUSH, null);
                Toast.makeText(Text_To_Speech.this, "Difference"+i3, Toast.LENGTH_SHORT).show();

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                ts.speak(s1, TextToSpeech.QUEUE_FLUSH, null);
                String s2 = e2.getText().toString();
                ts.speak(s2, TextToSpeech.QUEUE_FLUSH, null);
                Integer i1 = Integer.parseInt(s1);
                Integer i2 = Integer.parseInt(s2);
                Integer i3 = i1 * i2;
                String s3 = Integer.toString(i3);
                t1.setText(s3);
                ts.speak(s3, TextToSpeech.QUEUE_FLUSH, null);
                Toast.makeText(Text_To_Speech.this, "Product"+i3, Toast.LENGTH_SHORT).show();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                ts.speak(s1, TextToSpeech.QUEUE_FLUSH, null);
                String s2 = e2.getText().toString();
                ts.speak(s2, TextToSpeech.QUEUE_FLUSH, null);
                Integer i1 = Integer.parseInt(s1);
                Integer i2 = Integer.parseInt(s2);
                Integer i3 = i1 / i2;
                String s3 = Integer.toString(i3);
                t1.setText(s3);
                ts.speak(s3, TextToSpeech.QUEUE_FLUSH, null);
                Toast.makeText(Text_To_Speech.this, "Divide"+i3, Toast.LENGTH_SHORT).show();
            }
        });

    }
}