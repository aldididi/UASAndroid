package com.uas.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();

        final Intent i = new Intent(SplashScreenAct.this, MainActivity.class);
    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            startActivity(i);
            finish();
        }
    }, 100);
    }
}