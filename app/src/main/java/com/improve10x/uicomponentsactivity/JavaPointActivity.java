package com.improve10x.uicomponentsactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class JavaPointActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_point);
        WebView webviewWb = findViewById(R.id.webview_wb);
        webviewWb.loadUrl("https://www.javatpoint.com/");
    }
}