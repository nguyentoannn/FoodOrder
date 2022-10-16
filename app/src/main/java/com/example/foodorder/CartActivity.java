package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SearchView;

public class CartActivity extends AppCompatActivity {

    ImageView _home;
    SearchView _search;
    Button _order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        _home = findViewById(R.id.back_item);
        _search = findViewById(R.id.search_cart);
        _order = findViewById(R.id.btn_place_order);

    }
}