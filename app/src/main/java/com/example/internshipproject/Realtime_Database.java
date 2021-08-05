package com.example.internshipproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Realtime_Database extends AppCompatActivity {
    Button b1,b2;
    EditText e1,e2,e3;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realtime_database);
        b1 = (Button)findViewById(R.id.button83);
        b2 = (Button)findViewById(R.id.button103);
        e1 = (EditText)findViewById(R.id.editTextTextPersonName19);
        e2 = (EditText)findViewById(R.id.editTextTextPersonName20);
        e3 = (EditText)findViewById(R.id.editTextTextPersonName22);
        firebaseDatabase = FirebaseDatabase.getInstance();
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(Realtime_Database.this,Third.class);
                startActivity(s);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databaseReference = firebaseDatabase.getReference("users");
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                String s3 = e3.getText().toString();
                if(s3.length()!=10){
                    Toast.makeText(Realtime_Database.this, "Please fill correct phone number", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    users users = new users(s1,s2,s3);
                    databaseReference.child(s3).setValue(users);
                    Toast.makeText(Realtime_Database.this, "Information Updated", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
