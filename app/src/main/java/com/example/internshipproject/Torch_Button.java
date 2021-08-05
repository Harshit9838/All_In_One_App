package com.example.internshipproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Torch_Button extends AppCompatActivity {
    Button b1,b2,b3,b4;
    CameraManager cm ;
    private boolean cmr = false;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_torch_button);
        b1 = (Button)findViewById(R.id.button44);
        b2 = (Button)findViewById(R.id.button45);
        b3 = (Button)findViewById(R.id.button46);
        b4 = (Button)findViewById(R.id.button47);
        t1 = (TextView)findViewById(R.id.textView23);
        cm = (CameraManager)getSystemService(CAMERA_SERVICE);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Torch_Button.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(Torch_Button.this, Phone_Services.class);
                startActivity(j);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String s1 = cm.getCameraIdList()[0];
                    cm.setTorchMode(s1, true);
                    cmr = true;
                } catch (CameraAccessException e) {
                }
            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String s2 = cm.getCameraIdList()[0];
                    cm.setTorchMode(s2,false);
                    cmr = false;
                }
                catch (CameraAccessException e){}

            }
        });
    }
}