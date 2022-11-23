package com.example.bidsplashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        Button button = findViewById(R.id.setting_button);
        button.setOnClickListener(view -> {

            Intent intent = new Intent(HomeScreen.this, Settings.class);
            startActivity(intent);
        });



        }
    }
