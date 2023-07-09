package com.example.se1603_prm392_shoestoreapp_group05.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.se1603_prm392_shoestoreapp_group05.Data.ProductsDBHelper;
import com.example.se1603_prm392_shoestoreapp_group05.Data.ProductsData;
import com.example.se1603_prm392_shoestoreapp_group05.Model.Product;
import com.example.se1603_prm392_shoestoreapp_group05.R;
import com.nex3z.notificationbadge.NotificationBadge;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ProductdetailActivity extends AppCompatActivity {
    private ImageView imageViewProduct;
    private TextView txtPdName;
    private TextView txtPdColor;
    private TextView txtPdSize;
    private TextView txtPdPrice;
    private TextView txtPdDescribe;
    private Spinner spinnerQuantity;
    private NotificationBadge notificationBadge;
    private int cartCount = 0;
    private HashSet<Integer> cartProducts = new HashSet<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productdetail);
        imageViewProduct = findViewById(R.id.imageViewProduct);
        txtPdName = findViewById(R.id.txtPdName);
        txtPdColor = findViewById(R.id.txtPdColor);
        txtPdSize = findViewById(R.id.txtPdSize);
        txtPdPrice = findViewById(R.id.txtPdPrice);
        txtPdDescribe = findViewById(R.id.txtPdDescribe);
        spinnerQuantity = findViewById(R.id.spinnerQuantity);

        notificationBadge = findViewById(R.id.menu_sl);

        // Nhận thông tin sản phẩm từ intent
        Intent intent = getIntent();
        if (intent != null) {
            int productID = intent.getIntExtra("productID", 0);
            String productImage = intent.getStringExtra("productImage");
            String productName = intent.getStringExtra("productName");
            double productPrice = intent.getDoubleExtra("productPrice", 0.0);
            String productBrand = intent.getStringExtra("productBrand");
            String productDescribe = intent.getStringExtra("productDescribe");
            String productColor = intent.getStringExtra("productColor");
            String productSize = intent.getStringExtra("productSize");

            // Tạo đối tượng Product với các thông tin nhận được
            Product product = new Product(productID, productImage, productName, productPrice, productBrand, productDescribe, productColor, productSize);
            // Hiển thị thông tin sản phẩm
            Picasso.get().load(productImage).into(imageViewProduct);
            txtPdName.setText(productName);
            txtPdColor.setText(productColor);
            txtPdSize.setText(productSize);
            txtPdPrice.setText(String.valueOf(product.getProductPrice()));
            txtPdDescribe.setText(productDescribe);

           Integer[] so =new Integer[]{1,2,3,4,5,6,7,8,9,10};
            ArrayAdapter<Integer> adapter = new ArrayAdapter<>(this, R.layout.spinner_item, so);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerQuantity.setAdapter(adapter);

            // Xử lý sự kiện khi nhấn nút "Add to Cart"
            Button addToCartButton = findViewById(R.id.addtocart);
            addToCartButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int quantity = (int) spinnerQuantity.getSelectedItem();

                    // Kiểm tra xem sản phẩm đã tồn tại trong giỏ hàng chưa
                    if (cartProducts.contains(productID)) {
                        Toast.makeText(ProductdetailActivity.this, "Product already added to cart", Toast.LENGTH_SHORT).show();
                    } else {
                        // Thêm sản phẩm vào giỏ hàng và cập nhật số lượng trên notification badge
                        cartProducts.add(productID);
                        cartCount += quantity;
                        notificationBadge.setNumber(cartCount);
                        Toast.makeText(ProductdetailActivity.this, "Product added to cart", Toast.LENGTH_SHORT).show();
                    }
                }
            });

            // Xử lý sự kiện khi nhấn vào biểu tượng giỏ hàng
            ImageView cartImageView = findViewById(R.id.CartimageView);
            cartImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Chuyển tới trang CartActivity
                    Intent cartIntent = new Intent(ProductdetailActivity.this, CartActivity.class);
                    cartIntent.putExtra("cartProducts", new ArrayList<>(cartProducts));
                    startActivity(cartIntent);
                }
            });
        }
    }
}