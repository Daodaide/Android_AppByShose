package com.example.se1603_prm392_shoestoreapp_group05.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.se1603_prm392_shoestoreapp_group05.Adapter.NikeProductAdapter;
import com.example.se1603_prm392_shoestoreapp_group05.Data.ProductsData;
import com.example.se1603_prm392_shoestoreapp_group05.Model.Product;
import com.example.se1603_prm392_shoestoreapp_group05.R;

import java.util.ArrayList;
import java.util.List;

public class PumaProduct extends AppCompatActivity {
    private RecyclerView recyclerViewPuma;
    private NikeProductAdapter pumaProductAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puma_product);

        recyclerViewPuma = findViewById(R.id.recyclerviewPuma);

        // Lấy danh sách sản phẩm của thương hiệu Nike
        List<Product> nikeProducts = getNikeProducts();

        // Khởi tạo nikeProductAdapter với danh sách sản phẩm của thương hiệu Nike
        pumaProductAdapter = new NikeProductAdapter(nikeProducts);

        // Thiết lập layout manager cho RecyclerView (GridLayoutManager với spanCount là 2)
        recyclerViewPuma.setLayoutManager(new GridLayoutManager(this, 2));

        // Thiết lập adapter cho RecyclerView với danh sách sản phẩm của thương hiệu Nike
        recyclerViewPuma.setAdapter(pumaProductAdapter);
    }
    private List<Product> getNikeProducts() {
        List<Product> nikeProducts = new ArrayList<>();

        // Lấy danh sách sản phẩm từ HomeData
        List<Product> allProducts = ProductsData.getSampleProducts();

        // Lọc danh sách sản phẩm của thương hiệu Nike
        for (Product product : allProducts) {
            if (product.getBrand().equals("Puma")) {
                nikeProducts.add(product);
            }
        }

        return nikeProducts;
    }
}