package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class AdminDeleteProductActivity extends AppCompatActivity {

    ImageView _imgProduct;
    Button _delete, _cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_delete_product);

        _imgProduct = findViewById(R.id.img_product_image);
        _delete = findViewById(R.id.btn_delete_product);
        _cancel = findViewById(R.id.btn_product_cancel_delete);

    }
}