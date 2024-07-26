package com.app.picpay;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;

public class SplashScreenActivity extends AppCompatActivity {

    private ImageView imgSplashScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Handler handler = new Handler();

        imgSplashScreen = findViewById(R.id.imgSplashScreen);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/picpayfake-2da1a.appspot.com/o/splashscreen.jpeg?alt=media&token=a34c327c-d9be-4025-ab6d-21d3eea5d8d0")
                .into(imgSplashScreen);

        handler.postDelayed(()->{
            Intent intent = new Intent(SplashScreenActivity.this, InitialScreenActivity.class);
            startActivity(intent);
            finish();
        }, 3000);
    }
}