package com.example.bidsplashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Button button1 = findViewById(R.id.personal);
        button1.setOnClickListener(view -> {

            Intent intent1 = new Intent(Settings.this, settings_personalinfo.class);
            startActivity(intent1);
        });
    }
}
