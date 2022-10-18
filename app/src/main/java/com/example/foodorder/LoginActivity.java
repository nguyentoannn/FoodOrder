package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;

import java.util.Collections;

public class LoginActivity extends AppCompatActivity {

    EditText _username, _password;
    TextView _forgot, _toSignUp;
    Button _login;
    ImageView _cancel;
    LinearLayout _facebook, _google;
    FoodDBManagement _data;
    CallbackManager _callbackManager;
    GoogleSignInOptions _gso;
    GoogleSignInClient _gsc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        _gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        _gsc = GoogleSignIn.getClient(LoginActivity.this, _gso);
        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(this);
        if(account != null){
            navigateToHome();
        }
        _callbackManager = CallbackManager.Factory.create();

        LoginManager.getInstance().registerCallback(_callbackManager,
                new FacebookCallback<LoginResult>() {
                    @Override
                    public void onSuccess(LoginResult loginResult) {
                        // App code
                    }

                    @Override
                    public void onCancel() {
                        // App code
                    }

                    @Override
                    public void onError(FacebookException exception) {
                        // App code
                    }
                });

        _username = findViewById(R.id.txt_login_username);
        _password = findViewById(R.id.txt_login_password);
        _forgot = findViewById(R.id.txt_login_forgot);
        _toSignUp = findViewById(R.id.btn_toSignUp);
        _login = findViewById(R.id.btn_login);
        _cancel = findViewById(R.id.img_login_cancel);
        _facebook = findViewById(R.id.layout_login_facebook);
        _google = findViewById(R.id.layout_login_google);

        _forgot.setOnClickListener(v -> startActivity(new Intent(LoginActivity.this, ForgotPasswordActivity.class)));

        _login.setOnClickListener(v -> {
            String username, password;
            username = _username.getText().toString();
            password = _password.getText().toString();

            if(TextUtils.isEmpty(username) || TextUtils.isEmpty(password)){
                Toast.makeText(LoginActivity.this, "All fields must be required", Toast.LENGTH_SHORT).show();
            }else{
                Boolean checkDataLogin = _data.checkLogin(username, password);
                if(checkDataLogin){
                    Toast.makeText(LoginActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(LoginActivity.this, HomeActivity.class));
                }else{
                    Toast.makeText(LoginActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });

        _toSignUp.setOnClickListener(v -> startActivity(new Intent(LoginActivity.this , RegisterActivity.class)));

        _cancel.setOnClickListener(v -> startActivity(new Intent(LoginActivity.this, HomeActivity.class)));

        _facebook.setOnClickListener(v -> LoginManager.getInstance().logInWithReadPermissions(LoginActivity.this, Collections.singletonList("public_profile")));

        _google.setOnClickListener(v -> signIn());
    }

    void signIn(){
        Intent _signIntent = _gsc.getSignInIntent();
        startActivityForResult(_signIntent, 10000);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        _callbackManager.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 10000){
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            try {
                task.getResult(ApiException.class);
                navigateToHome();
            } catch (ApiException e) {
                Toast.makeText(LoginActivity.this, "Something was wrong", Toast.LENGTH_SHORT).show();
            }
        }
    }

    void navigateToHome(){
        finish();
        startActivity(new Intent(LoginActivity.this, HomeActivity.class));
    }
}