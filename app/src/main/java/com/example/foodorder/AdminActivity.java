package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class AdminActivity extends AppCompatActivity {

    ImageView _home, _user, _product, _changePassword, _editInformation, _search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        _home = findViewById(R.id.img_admin_home);
        _user = findViewById(R.id.img_admin_user);
        _product = findViewById(R.id.img_admin_product);
        _changePassword = findViewById(R.id.img_admin_changePassword);
        _editInformation = findViewById(R.id.img_admin_editInformation);
        _search = findViewById(R.id.img_admin_search);

    }
}