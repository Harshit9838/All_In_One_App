package com.example.internshipproject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class Video_Recoder extends AppCompatActivity {
    Button b1,b2,b3;
    Uri u1;
    MediaController m1;
    VideoView v1;
    TextView t1;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable @org.jetbrains.annotations.Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        u1=data.getData();
        v1.setVideoURI(u1);
        v1.setMediaController(m1);
        m1.setAnchorView(v1);
        v1.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_recoder);
        b1 = (Button)findViewById(R.id.button56);
        b2 = (Button)findViewById(R.id.button57);
        v1 = (VideoView)findViewById(R.id.videoView);
        m1 = new MediaController(this);
        b3 = (Button)findViewById(R.id.button58);
        t1 = (TextView)findViewById(R.id.textView24);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Video_Recoder.this,Phone_Services.class);
                startActivity(i);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(Video_Recoder.this,MainActivity.class);
                startActivity(j);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
                startActivityForResult(i1,0);
            }
        });
    }
}