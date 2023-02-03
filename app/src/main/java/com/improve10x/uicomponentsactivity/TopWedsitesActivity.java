package com.improve10x.uicomponentsactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;

public class TopWedsitesActivity extends AppCompatActivity {
    Button googleBtn;
    WebView googleWv;
    Button facebookBtn;
    Button youtubeBtn;
    Button twitterBtn;
    Button instaBtn;
    Button improve10xBtn;
    Button whatsappBtn;
    Button swiggyBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_wedsites);
        handleinitViews();
        handlegoogleBtn();
        handlefacebook();
        handleyoutube();
        handletwitter();
        handleinstagram();
        handleimorove10x();
        handlewhatsapp();
        handleswiggy();
    }

    private void handleswiggy() {
        swiggyBtn.setOnClickListener(v -> {
            googleWv.loadUrl("https://www.swiggy.com/");
        });
    }

    private void handlewhatsapp() {
        whatsappBtn.setOnClickListener(v -> {
            googleWv.loadUrl("https://www.whatsapp.com/");
        });
    }

    private void handleimorove10x() {
        improve10xBtn.setOnClickListener(v -> {
            googleWv.loadUrl("https://www.improve10X.com/");
        });
    }

    private void handleinstagram() {
        instaBtn.setOnClickListener(v -> {
            googleWv.loadUrl("https://www.instagram.com/");
        });
    }

    private void handletwitter() {
        twitterBtn.setOnClickListener(v -> {
            googleWv.loadUrl("https://www.twitter.com/");
        });

    }

    private void handleyoutube() {
        youtubeBtn.setOnClickListener(v -> {
            googleWv.loadUrl("https://www.youtube.com/");
        });

    }

    private void handlefacebook() {
        facebookBtn.setOnClickListener(v -> {
            googleWv.loadUrl("https://www.facebook.com/");
        });
    }

    private void handlegoogleBtn() {
        googleBtn.setOnClickListener(v -> {
            googleWv.loadUrl("https://www.google.com/");

        });
    }

    private void handleinitViews() {
        googleBtn = findViewById(R.id.google_btn);
        googleWv = findViewById(R.id.google_wv);
        facebookBtn = findViewById(R.id.facebook_btn);
        youtubeBtn = findViewById(R.id.youtube_btn);
        twitterBtn = findViewById(R.id.twitter_btn);
        instaBtn = findViewById(R.id.insta_btn);
        improve10xBtn = findViewById(R.id.improve10x_btn);
        whatsappBtn = findViewById(R.id.whatsapp_btn);
        swiggyBtn = findViewById(R.id.swiggy_btn);
    }

}