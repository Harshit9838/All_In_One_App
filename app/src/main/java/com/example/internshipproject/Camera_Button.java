package com.example.internshipproject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Camera_Button extends AppCompatActivity {
    Button b1,b2,b3;
    ImageView i1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        b1=(Button)findViewById(R.id.button53);
        b2=(Button)findViewById(R.id.button54);
        b3=(Button)findViewById(R.id.button55);
        i1=(ImageView)findViewById(R.id.imageView);
        t1=(TextView)findViewById(R.id.textView22);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Camera_Button.this,Phone_Services.class);
                startActivity(i);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(Camera_Button.this,MainActivity.class);
                startActivity(j);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(k,10);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable @org.jetbrains.annotations.Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap bm=(Bitmap)data.getExtras().get("Data");
        i1.setImageBitmap(bm);
    }
}