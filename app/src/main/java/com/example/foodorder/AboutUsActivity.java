package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

public class AboutUsActivity extends AppCompatActivity {

    ImageView _cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        _cancel = findViewById(R.id.img_aboutUs_cancel);

    }
}