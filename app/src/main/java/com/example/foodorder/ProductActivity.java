package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class ProductActivity extends AppCompatActivity {

    ImageView _home, _cart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        _home = findViewById(R.id.img_product_to_home);
        _cart = findViewById(R.id.img_product_to_cart);

    }
}