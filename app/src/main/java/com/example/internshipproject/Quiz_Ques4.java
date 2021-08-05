package com.example.internshipproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Quiz_Ques4 extends AppCompatActivity {
    Button b1,b2;
    TextView t1;
    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_ques4);
        b1 = (Button)findViewById(R.id.button78);
        b2 = (Button)findViewById(R.id.button79);
        e1 = (EditText)findViewById(R.id.editTextTextPersonName17);
        t1 = (TextView)findViewById(R.id.textView9);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(Quiz_Ques4.this,MainActivity.class);
                startActivity(s);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String d = e1.getText().toString();
                if (d.length() != 0) {
                    Intent h = new Intent(Quiz_Ques4.this, Quiz_Ques5.class);
                    startActivity(h);
                    finish();
                } else {
                    Toast.makeText(Quiz_Ques4.this, "Please fill the answer", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}