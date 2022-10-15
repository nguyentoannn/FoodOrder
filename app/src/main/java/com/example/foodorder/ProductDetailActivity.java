package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class ProductDetailActivity extends AppCompatActivity {

    ImageView _cancel;
    Button _addToCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        _cancel = findViewById(R.id.img_productDetail_cancel);
        _addToCart = findViewById(R.id.btn_addToCart);

    }
}