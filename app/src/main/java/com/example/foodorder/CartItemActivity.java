package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class CartItemActivity extends AppCompatActivity {

    Button _subtract, _increase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_item);

        _subtract = findViewById(R.id.subtract);
        _increase = findViewById(R.id.increase);

    }
}