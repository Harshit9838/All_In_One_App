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

import org.jetbrains.annotations.NotNull;

public class Gmail_Button extends AppCompatActivity {
    Button b1,b2,b3;
    ProgressBar p1;
    EditText e1,e2;
    FirebaseAuth firebaseAuth;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gmail_button);
        firebaseAuth = FirebaseAuth.getInstance();
        b1 = (Button)findViewById(R.id.button98);
        b2 = (Button)findViewById(R.id.button99);
        b3 = (Button)findViewById(R.id.button101);
        t1 = (TextView)findViewById(R.id.textView30);
        e1 = (EditText)findViewById(R.id.editTextTextPersonName23);
        e2 = (EditText)findViewById(R.id.editTextTextPersonName24);
        e2.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD);
        p1 = (ProgressBar)findViewById(R.id.progressBar3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                if(s1.isEmpty())
                {
                    e1.setError("Fill Email");
                }
                else
                {
                    if(s2.isEmpty())
                    {
                        e2.setError("Fill Password");
                    }
                }
                p1.setVisibility(View.VISIBLE);
                firebaseAuth.createUserWithEmailAndPassword(s1,s2).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull @NotNull Task<AuthResult> task) {
                        if(task.isSuccessful())
                        {
                            Toast.makeText(Gmail_Button.this, "Sucessful", Toast.LENGTH_SHORT).show();
                            p1.setVisibility(View.INVISIBLE);
                        }
                        else
                        {
                            Toast.makeText(Gmail_Button.this, "Unsucessful", Toast.LENGTH_SHORT).show();
                            p1.setVisibility(View.INVISIBLE);
                        }

                        }
                });
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent s=new Intent(Gmail_Button.this,Internet_Features.class);
                        startActivity(s);
                        finish();
                    }
                });
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent j=new Intent(Gmail_Button.this,Third.class);
                        startActivity(j);
                        finish();
                    }
                });
            }
        });
    }
}