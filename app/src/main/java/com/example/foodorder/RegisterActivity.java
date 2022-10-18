package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText _username, _fullName, _password, _rePassword, _address, _email, _phone;
    TextView _toLogin;
    Button _register;
    ImageView _cancel;
    FoodDBManagement data;


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

        _register.setOnClickListener(v -> {
            String username, fullName, password, rePassword, address, email, phone;
            username = _username.getText().toString();
            fullName = _fullName.getText().toString();
            password = _password.getText().toString();
            rePassword = _rePassword.getText().toString();
            address = _address.getText().toString();
            email = _email.getText().toString();
            phone = _phone.getText().toString();

            if(TextUtils.isEmpty(username) || TextUtils.isEmpty(fullName) ||
               TextUtils.isEmpty(password) || TextUtils.isEmpty(rePassword) ||
               TextUtils.isEmpty(address) || TextUtils.isEmpty(email) ||
               TextUtils.isEmpty(phone)){
                Toast.makeText(RegisterActivity.this, "All fields must be required", Toast.LENGTH_SHORT).show();
            }else{
                if(password.equals(rePassword)){
                    Boolean checkUser = data.checkDuplicateUser(username);
                    if(checkUser){
                        Toast.makeText(RegisterActivity.this, "User already existed", Toast.LENGTH_SHORT).show();
                    }else{
                        Boolean addUser = data.addUser(username, fullName, password, rePassword, address, email, phone);
                        if(password.length() >= 6 && password.length() <= 20) {
                            if (addUser) {
                                Toast.makeText(RegisterActivity.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(intent);
                            } else {
                                Toast.makeText(RegisterActivity.this, "Registration Failed", Toast.LENGTH_SHORT).show();
                            }
                        }else{
                            Toast.makeText(RegisterActivity.this, "The password length must be from 6 to 20 characters", Toast.LENGTH_SHORT).show();
                        }
                    }
                }else{
                    Toast.makeText(RegisterActivity.this, "Password does not match", Toast.LENGTH_SHORT).show();
                }
            }
        });

        _toLogin.setOnClickListener(v -> startActivity(new Intent(RegisterActivity.this, LoginActivity.class)));

        _cancel.setOnClickListener(v -> startActivity(new Intent(RegisterActivity.this, HomeActivity.class)));
    }
}