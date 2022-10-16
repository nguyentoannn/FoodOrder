package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class AdminCreateProductActivity extends AppCompatActivity {

    ImageView _imgProduct;
    EditText _nameProduct, _priceProduct;
    Button _create, _cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_create_product);

        _imgProduct = findViewById(R.id.img_product_image);
        _nameProduct = findViewById(R.id.txt_product_name_item);
        _priceProduct = findViewById(R.id.txt_product_price_item);
        _create = findViewById(R.id.btn_create_product);
        _cancel = findViewById(R.id.btn_product_cancel_create);

    }
}