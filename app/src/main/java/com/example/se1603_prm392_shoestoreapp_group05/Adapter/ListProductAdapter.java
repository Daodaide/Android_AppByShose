package com.example.se1603_prm392_shoestoreapp_group05.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.se1603_prm392_shoestoreapp_group05.Model.Product;
import com.example.se1603_prm392_shoestoreapp_group05.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ListProductAdapter extends RecyclerView.Adapter<ListProductAdapter.ProductViewHolder> {

    private List<Product> productList;

    public ListProductAdapter(List<Product> productList) {
        this.productList = productList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_product, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product product = productList.get(position);
        holder.bind(product);
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }



        static class ProductViewHolder extends RecyclerView.ViewHolder {

            private ImageView imageView;
            private TextView nameTextView;
            private TextView priceTextView;

            public ProductViewHolder(@NonNull View itemView) {
                super(itemView);
                imageView = itemView.findViewById(R.id.imageview_brandproduct3);
                nameTextView = itemView.findViewById(R.id.textview_brandname3);
                priceTextView = itemView.findViewById(R.id.textview_brandprice2);
            }

            public void bind(Product product) {
                // Load the image using Picasso
                Picasso.get().load(product.getProductImage()).into(imageView);
                nameTextView.setText(product.getProductName());
                priceTextView.setText(String.valueOf(product.getProductPrice()));
            }
    }
}