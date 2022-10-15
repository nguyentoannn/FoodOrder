package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    EditText _username, _password;
    TextView _forgot, _toSignUp;
    Button _login;
    ImageView _cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        _username = findViewById(R.id.txt_login_username);
        _password = findViewById(R.id.txt_login_password);
        _forgot = findViewById(R.id.txt_login_forgot);
        _toSignUp = findViewById(R.id.btn_toSignUp);
        _login = findViewById(R.id.btn_login);
        _cancel = findViewById(R.id.img_login_cancel);

    }
}