package com.example.se1603_prm392_shoestoreapp_group05.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.se1603_prm392_shoestoreapp_group05.Adapter.CartAdapter;
import com.example.se1603_prm392_shoestoreapp_group05.Data.CartDBHelper;
import com.example.se1603_prm392_shoestoreapp_group05.Model.Cart;
import com.example.se1603_prm392_shoestoreapp_group05.R;

import java.util.ArrayList;
import java.util.List;


public class CartActivity extends AppCompatActivity {
    private RecyclerView recyclerViewCart;
    private CartAdapter cartAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        recyclerViewCart = findViewById(R.id.recyclerViewCart);

        // Set the RecyclerView layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerViewCart.setLayoutManager(layoutManager);

        // Retrieve the cart item data from the Intent
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("cartItem")) {
            Cart cartItem = intent.getParcelableExtra("cartItem");
            List<Cart> cartList = new ArrayList<>();
            cartList.add(cartItem);

            // Create and set the CartAdapter
            cartAdapter = new CartAdapter(this, cartList);
            recyclerViewCart.setAdapter(cartAdapter);
        }
    }
}