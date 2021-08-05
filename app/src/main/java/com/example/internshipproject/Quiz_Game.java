package com.example.internshipproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Quiz_Game extends AppCompatActivity {
    Button b1,b2,b3;
    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_game);
        b1 = (Button)findViewById(R.id.button69);
        b2 = (Button)findViewById(R.id.button70);
        b3 = (Button)findViewById(R.id.button71);
        e1 =(EditText)findViewById(R.id.editTextTextPersonName13);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                if (s1.length() != 0) {
                    Intent q = new Intent(Quiz_Game.this, Quiz_Ques1.class);
                    startActivity(q);
                    finish();
                } else
                    {
                    Toast.makeText(Quiz_Game.this, "please fill the name", Toast.LENGTH_SHORT).show();
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent g = new Intent(Quiz_Game.this,Internet_Features.class);
                startActivity(g);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h=new Intent(Quiz_Game.this,MainActivity.class);
                startActivity(h);
                finish();
            }
        });
    }
}