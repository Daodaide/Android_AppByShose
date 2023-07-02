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

public class PumaProductAdapter extends RecyclerView.Adapter<PumaProductAdapter.ViewHolder> {
private List<Product> productList;

public PumaProductAdapter(List<Product> productList) {
        this.productList = productList;
        }

@NonNull
@Override
public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_puma_product, parent, false);
        return new ViewHolder(view);
        }

@Override
public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Product product = productList.get(position);
        holder.bind(product);
        }

@Override
public int getItemCount() {
        return productList.size();
        }

public class ViewHolder extends RecyclerView.ViewHolder {
    private ImageView productImage;
    private TextView productName;
    private TextView productPrice;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        productImage = itemView.findViewById(R.id.imageview_brandproduct2);
        productName = itemView.findViewById(R.id.textview_brandname2);
        productPrice = itemView.findViewById(R.id.textview_brandprice2);
    }

    public void bind(Product product) {
        // Gán dữ liệu từ đối tượng Product vào các view tương ứng
        Picasso.get().load(product.getProductImage()).into(productImage);
        productName.setText(product.getProductName());
        productPrice.setText(String.valueOf(product.getProductPrice()));
    }
}
}