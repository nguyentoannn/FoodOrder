package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SearchView;

public class AdminSearchActivity extends AppCompatActivity {

    ImageView _home;
    SearchView _inputSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_search);

        _home = findViewById(R.id.img_search_to_home);
        _inputSearch = findViewById(R.id.search_admin);

    }
}