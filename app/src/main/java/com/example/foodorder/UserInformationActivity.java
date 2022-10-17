package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class UserInformationActivity extends AppCompatActivity {

    TextView _name, _address, _email, _phone, _logout, _edit, _change;
    ImageView _home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_information);

        _name = findViewById(R.id.txt_name_item);
        _address = findViewById(R.id.txt_address_item);
        _email = findViewById(R.id.txt_email_item);
        _phone = findViewById(R.id.txt_phone_item);
        _logout = findViewById(R.id.txt_ui_logout);
        _edit = findViewById(R.id.txt_edit);
        _change = findViewById(R.id.txt_change);
        _home = findViewById(R.id.img_ui_cancel);


        _logout.setOnClickListener(v -> {
            startActivity(new Intent(UserInformationActivity.this, HomeActivity.class));
            finish();
            Toast.makeText(UserInformationActivity.this, "Logout Successfully", Toast.LENGTH_SHORT).show();
        });

    }
}