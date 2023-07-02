package com.example.se1603_prm392_shoestoreapp_group05.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.se1603_prm392_shoestoreapp_group05.Adapter.ListProductAdapter;
import com.example.se1603_prm392_shoestoreapp_group05.Data.ProductsData;
import com.example.se1603_prm392_shoestoreapp_group05.Model.Product;
import com.example.se1603_prm392_shoestoreapp_group05.R;

import java.util.List;

public class ListProductActivity extends AppCompatActivity {
    private List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_product);

        // Gọi phương thức để lấy danh sách sản phẩm từ HomeData
        productList = ProductsData.getSampleProducts();

        // Gọi phương thức để hiển thị danh sách sản phẩm trong RecyclerView
        setupRecyclerView();
    }

    private void setupRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerviewProduct);
        ListProductAdapter adapter = new ListProductAdapter(productList);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(adapter);
    }
}