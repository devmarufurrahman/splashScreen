package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SpashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spash);

        Intent iHome = new Intent(SpashActivity.this,MainActivity.class);

        // splash screen delay
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(iHome);
                finish();
            }
        },4000);

    }
}