package com.example.internshipproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.TimeUnit;

public class Otp_Second extends AppCompatActivity {
    EditText e1;
    Button b1,b2,b3;
    FirebaseAuth firebaseAuth;
    String phone;
    String otp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_second);
        e1 = (EditText) findViewById(R.id.editTextTextPersonName25);
        b1 = (Button) findViewById(R.id.button93);
        b2 = (Button) findViewById(R.id.button94);
        b3 = (Button) findViewById(R.id.button95);
        firebaseAuth = FirebaseAuth.getInstance();
        phone = getIntent().getStringExtra("mobile".toString());
        genotp();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e1.getText().toString().isEmpty()) {
                    Toast.makeText(Otp_Second.this, "PLz fill", Toast.LENGTH_SHORT).show();
                } else {
                    if (e1.getText().toString().length() != 6) {
                        Toast.makeText(Otp_Second.this, "give valid otp", Toast.LENGTH_SHORT).show();
                    } else {
                        PhoneAuthCredential credential = PhoneAuthProvider.getCredential(otp, e1.getText().toString());
                        signInwithPhoneAuthCredential(credential);

                    }
                }
            }
        });
    }
    private void genotp() {
        PhoneAuthProvider.getInstance().verifyPhoneNumber(
                phone,
                60,
                TimeUnit.SECONDS,
                this,
                new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
                    @Override
                    public void onVerificationCompleted(@NonNull @NotNull PhoneAuthCredential phoneAuthCredential) {
                        signInwithPhoneAuthCredential(phoneAuthCredential);
                    }


                    @Override
                    public void onVerificationFailed(@NonNull @NotNull FirebaseException e) {
                        Toast.makeText(Otp_Second.this, "mismatch", Toast.LENGTH_SHORT).show();

                    }

                });
    }
    private void signInwithPhoneAuthCredential(PhoneAuthCredential credential)
    {
        firebaseAuth.signInWithCredential(credential).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull @NotNull Task<AuthResult> task) {
                if(task.isSuccessful())
                {
                    Toast.makeText(Otp_Second.this, "DataBase Updated", Toast.LENGTH_SHORT).show();
                    Intent k = new Intent(Otp_Second.this,Otp_Third.class);
                    startActivity(k);
                    finish();
                }
                else
                {
                    Toast.makeText(Otp_Second.this,"Database failed",Toast.LENGTH_SHORT).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a= new Intent(Otp_Second.this,Otp_First.class);
                startActivity(a);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b=new Intent(Otp_Second.this,MainActivity.class);
                startActivity(b);
                finish();
            }
        });
    }
}