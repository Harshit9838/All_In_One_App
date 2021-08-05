package com.example.internshipproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Browser_App extends AppCompatActivity {
    Button b1,b2,b3;
    WebView w1;
    EditText e1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser_app);
        b1 = (Button)findViewById(R.id.button66);
        b2 = (Button)findViewById(R.id.button67);
        b3 = (Button)findViewById(R.id.button68);
        e1 = (EditText)findViewById(R.id.editTextTextPersonName12);
        w1 = (WebView)findViewById(R.id.webview);
        t1 = (TextView)findViewById(R.id.textView27);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                w1.loadUrl(s1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(Browser_App.this,Internet_Features.class);
                startActivity(e);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent q = new Intent(Browser_App.this,MainActivity.class);
                startActivity(q);
                finish();

            }
        });
    }
}