package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView btn_getStarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_getStarted = findViewById(R.id.txt_title);
        btn_getStarted.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, HomeActivity.class)));

    }
}