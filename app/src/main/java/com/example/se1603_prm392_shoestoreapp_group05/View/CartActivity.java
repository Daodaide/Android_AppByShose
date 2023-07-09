package com.example.se1603_prm392_shoestoreapp_group05.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.se1603_prm392_shoestoreapp_group05.Adapter.CartAdapter;
import com.example.se1603_prm392_shoestoreapp_group05.Data.CartDBHelper;
import com.example.se1603_prm392_shoestoreapp_group05.Data.ProductsData;
import com.example.se1603_prm392_shoestoreapp_group05.Model.Cart;
import com.example.se1603_prm392_shoestoreapp_group05.Model.Product;
import com.example.se1603_prm392_shoestoreapp_group05.R;

import java.util.ArrayList;
import java.util.List;

public class CartActivity extends AppCompatActivity {
    private RecyclerView recyclerViewCart;
    private CartAdapter cartAdapter;
    private List<Cart> cartList;
    private TextView textTotalQuantity;
    private TextView textTotalPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        recyclerViewCart = findViewById(R.id.recyclerViewCart);
        textTotalQuantity = findViewById(R.id.text_total_quantity);
        textTotalPrice = findViewById(R.id.text_total_price);

        cartList = new ArrayList<>();
        cartAdapter = new CartAdapter(this, cartList);
        recyclerViewCart.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewCart.setAdapter(cartAdapter);

        // Nhận danh sách sản phẩm từ Intent
        Intent intent = getIntent();
        if (intent != null) {
            List<Integer> cartProducts = intent.getIntegerArrayListExtra("cartProducts");
            if (cartProducts != null) {
                for (int productID : cartProducts) {
                    // Thêm sản phẩm vào danh sách giỏ hàng
                    Cart cart = getCartByProductID(productID);
                    if (cart != null) {
                        cartList.add(cart);
                    }
                }
                cartAdapter.notifyDataSetChanged();
            }
        }

        // Tính toán và hiển thị tổng số lượng và tổng giá tiền
        int totalQuantity = calculateTotalQuantity();
        double totalPrice = calculateTotalPrice();
        textTotalQuantity.setText(String.valueOf(totalQuantity));
        textTotalPrice.setText(String.format("$%.2f", totalPrice));
    }

    private Cart getCartByProductID(int productID) {
        // Hàm này dùng để lấy thông tin sản phẩm từ cơ sở dữ liệu hoặc nguồn dữ liệu khác
        // Trong ví dụ này, sử dụng ProductsData.getSampleProducts() để lấy danh sách sản phẩm mẫu
        List<Product> productList = ProductsData.getSampleProducts();
        Product foundProduct = null;

        for (Product product : productList) {
            if (product.getProductID() == productID) {
                foundProduct = product;
                break;
            }
        }

        if (foundProduct != null) {
            return new Cart(productID, foundProduct, 1);
        } else {
            return null; // Không tìm thấy sản phẩm trong giỏ hàng
        }
    }

    private int calculateTotalQuantity() {
        int totalQuantity = 0;
        for (Cart cart : cartList) {
            totalQuantity += cart.getQuantity();
        }
        return totalQuantity;
    }

    private double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (Cart cart : cartList) {
            totalPrice += cart.getProductPrice() * cart.getQuantity();
        }
        return totalPrice;
    }
}