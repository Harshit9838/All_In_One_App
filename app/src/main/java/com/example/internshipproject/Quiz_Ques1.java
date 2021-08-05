package com.example.internshipproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Quiz_Ques1 extends AppCompatActivity {
    Button b1,b2;
    EditText e1;
    TextView t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_ques1);
        b1 = (Button)findViewById(R.id.button72);
        b2 = (Button)findViewById(R.id.button73);
        e1 = (EditText)findViewById(R.id.editTextTextPersonName14);
        t1 = (TextView)findViewById(R.id.textView6);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(Quiz_Ques1.this,MainActivity.class);
                startActivity(s);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String d = e1.getText().toString();
                if (d.length() != 0) {
                    Intent h = new Intent(Quiz_Ques1.this, Quiz_Ques2.class);
                    startActivity(h);
                    finish();
                } else {
                    Toast.makeText(Quiz_Ques1.this, "Please Fill The Answer", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}

