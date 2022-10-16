package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SearchView;

public class HomeActivity extends AppCompatActivity {

    ImageView _home, _product, _cart, _user;
    Button _toLogin;
    SearchView _search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        _home = findViewById(R.id.home_access);
        _product = findViewById(R.id.home_to_product);
        _cart = findViewById(R.id.home_to_cart);
        _user = findViewById(R.id.home_to_user_information);
        _toLogin = findViewById(R.id.btn_toSignIn);
        _search = findViewById(R.id.search_home);

    }
}