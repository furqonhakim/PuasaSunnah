package com.example.puasasunnah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Detail extends AppCompatActivity {
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        web = findViewById(R.id.web);
        Intent detail = getIntent();
        detail.getIntExtra("posisi",0);
        String link = detail.getStringExtra("link");

        web.getSettings().setJavaScriptEnabled(true);
        web.getSettings().setLoadsImagesAutomatically(true);
        web.loadUrl(link);
    }
}
