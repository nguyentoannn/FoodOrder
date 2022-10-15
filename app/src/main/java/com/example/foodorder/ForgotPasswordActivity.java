package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ForgotPasswordActivity extends AppCompatActivity {

    EditText _email;
    Button _sendEmail;
    TextView _toSignIn;
    ImageView _cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        _email = findViewById(R.id.txt_forgot_email);
        _sendEmail = findViewById(R.id.btn_sendEmail);
        _toSignIn = findViewById(R.id.btn_toSignIn);
        _cancel = findViewById(R.id.img_forgot_cancel);

    }
}