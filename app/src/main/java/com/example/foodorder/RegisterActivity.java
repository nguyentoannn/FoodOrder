package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    EditText _username, _fullName, _password, _rePassword, _address, _email, _phone;
    TextView _toLogin;
    Button _register;
    ImageView _cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        _username = findViewById(R.id.txt_register_username);
        _fullName = findViewById(R.id.txt_register_fullName);
        _password = findViewById(R.id.txt_register_password);
        _rePassword = findViewById(R.id.txt_register_rePassword);
        _address = findViewById(R.id.txt_register_address);
        _email = findViewById(R.id.txt_register_email);
        _phone = findViewById(R.id.txt_register_phone);
        _toLogin = findViewById(R.id.btn_toSignIn);
        _register = findViewById(R.id.btn_register);
        _cancel = findViewById(R.id.img_register_cancel);

    }
}