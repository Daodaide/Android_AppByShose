package com.example.se1603_prm392_shoestoreapp_group05.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.se1603_prm392_shoestoreapp_group05.Data.ProductsDBHelper;
import com.example.se1603_prm392_shoestoreapp_group05.Model.Product;
import com.example.se1603_prm392_shoestoreapp_group05.R;
import com.squareup.picasso.Picasso;

public class ProductdetailActivity extends AppCompatActivity {
    private ImageView imageViewProduct;
    private TextView txtPdName;
    private TextView txtPdColor;
    private TextView txtPdSize;
    private TextView txtPdPrice;
    private TextView txtPdDescribe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productdetail);
        // Ánh xạ views
        imageViewProduct = findViewById(R.id.imageViewProduct);
        txtPdName = findViewById(R.id.txtPdName);
        txtPdColor = findViewById(R.id.txtPdColor);
        txtPdSize = findViewById(R.id.txtPdSize);
        txtPdPrice = findViewById(R.id.txtPdPrice);
        txtPdDescribe = findViewById(R.id.txtPdDescribe);

        // Nhận thông tin sản phẩm từ intent
        Intent intent = getIntent();
        if (intent != null) {
            int productID = intent.getIntExtra("productID", 0);
            String productImage = intent.getStringExtra("productImage");
            String productName = intent.getStringExtra("productName");
            float productPrice = intent.getFloatExtra("productPrice", 0.0f);
            String productBrand = intent.getStringExtra("productBrand");
            String productDescribe = intent.getStringExtra("productDescribe");
            String productColor = intent.getStringExtra("productColor");
            String productSize = intent.getStringExtra("productSize");

            // Hiển thị thông tin sản phẩm
            Picasso.get().load(productImage).into(imageViewProduct);
            txtPdName.setText(productName);
            txtPdColor.setText(productColor);
            txtPdSize.setText(productSize);
            txtPdPrice.setText(String.valueOf(productPrice));
            txtPdDescribe.setText(productDescribe);
        }
    }
}