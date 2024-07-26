package com.app.picpay;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;

public class InitialScreenActivity extends AppCompatActivity {

    private ImageView imgAccess;
    private Button btnAccess;
    private Button btnLeave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial_screen);

        imgAccess = findViewById(R.id.imgAccess);
        Glide.with(this)
                .load("https://firebasestorage.googleapis.com/v0/b/picpayfake-2da1a.appspot.com/o/tela-acesso.jpeg?alt=media&token=20022c62-5b69-4625-819d-42e8928c9732")
                .into(imgAccess);

        btnAccess = findViewById(R.id.btnAccess);
        btnAccess.setBackgroundColor(Color.TRANSPARENT);
        btnAccess.setTextColor(Color.TRANSPARENT);

        btnLeave = findViewById(R.id.btnLeave);
        btnLeave.setBackgroundColor(Color.TRANSPARENT);
        btnLeave.setTextColor(Color.TRANSPARENT);
    }

    public void openInitialScreen(View view) {
        Handler handler = new Handler();
        handler.postDelayed(()->{
            Intent intent = new Intent(InitialScreenActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }, 1000);
    }

    public void leaveApp(View view) {
        Handler handler = new Handler();
        handler.postDelayed(this::finishAffinity, 1000);
    }
}