package com.example.internshipproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Second extends AppCompatActivity {
    Button b1,b2;
    EditText e1,e2,e3;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        b1=(Button)findViewById(R.id.button3);
        b2=(Button)findViewById(R.id.button4);
        t1=(TextView)findViewById(R.id.textView);
        e1=(EditText)findViewById(R.id.editTextTextPersonName3);
        e2=(EditText)findViewById(R.id.editTextTextPersonName4);
        e3=(EditText)findViewById(R.id.editTextTextPersonName5);
        e3.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(Second.this,MainActivity.class);
                startActivity(j);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                String s3 = e3.getText().toString();
                if(s1.equals("")||s2.equals("")||s3.equals(""))
                {
                    Toast.makeText(Second.this, "Please Fill The Form", Toast.LENGTH_SHORT).show();
                }
                else {
                    SQLiteDatabase sql = openOrCreateDatabase("gla",MODE_PRIVATE,null);
                    sql.execSQL("create table if not exists student(name varchar,email varchar,password varchar)");
                    String s4 = "select * from student where email='"+s1+"' and password='"+s2+"'";
                    Cursor c1 = sql.rawQuery(s4,null);
                    if (c1.getCount()>0){
                        Toast.makeText(Second.this, "user already exist", Toast.LENGTH_SHORT).show();
                    }else {
                        sql.execSQL("insert into student values('"+s1+"','"+s2+"','"+s3+"')");
                        Toast.makeText(Second.this, "database updated", Toast.LENGTH_SHORT).show();
                        Intent k = new Intent(Second.this,MainActivity.class);
                        startActivity(k);
                        finish();
                    }
                }
            }
        });
    }
}