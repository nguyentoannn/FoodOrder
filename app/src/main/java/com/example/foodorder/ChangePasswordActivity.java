package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ChangePasswordActivity extends AppCompatActivity {

    EditText _oldPassword, _newPassword, _reNewPassword;
    Button _changePassword;
    TextView _toUserInformation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        _oldPassword = findViewById(R.id.txt_changePassword_old);
        _newPassword = findViewById(R.id.txt_changePassword_new);
        _reNewPassword = findViewById(R.id.txt_changePassword_reNew);
        _changePassword = findViewById(R.id.btn_changePassword);
        _toUserInformation = findViewById(R.id.btn_toUserInformation);

    }
}