package com.example.se1603_prm392_shoestoreapp_group05.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.se1603_prm392_shoestoreapp_group05.Model.Product;
import com.example.se1603_prm392_shoestoreapp_group05.R;
import com.example.se1603_prm392_shoestoreapp_group05.View.ProductdetailActivity;
import com.squareup.picasso.Picasso;

import java.util.List;

public class NikeProductAdapter extends RecyclerView.Adapter<NikeProductAdapter.ViewHolder> {
    private List<Product> productList;
    private Context context;
    public NikeProductAdapter(Context context,List<Product> productList) {
        this.context = context;
        this.productList = productList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_nike_product, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Product product = productList.get(position);

        holder.productName.setText(product.getProductName());
        holder.productPrice.setText(String.format("$%.2f", product.getProductPrice()));
        Picasso.get().load(product.getProductImage()).into(holder.productImage);
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ImageView productImage;
        private TextView productName;
        private TextView productPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            productImage = itemView.findViewById(R.id.imageview_brandproduct);
            productName = itemView.findViewById(R.id.textview_brandname);
            productPrice = itemView.findViewById(R.id.textview_brandprice);

            itemView.setOnClickListener(this);
        }

        public void bind(Product product) {
            // Gán dữ liệu từ đối tượng Product vào các view tương ứng
            Picasso.get().load(product.getProductImage()).into(productImage);
            productName.setText(product.getProductName());
            productPrice.setText(String.valueOf(product.getProductPrice()));
        }
        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            if (position != RecyclerView.NO_POSITION) {
                Product product = productList.get(position);
                Intent intent = new Intent(context, ProductdetailActivity.class);
                intent.putExtra("productID", product.getProductID());
                intent.putExtra("productImage", product.getProductImage());
                intent.putExtra("productName", product.getProductName());
                intent.putExtra("productPrice", String.valueOf(product.getProductPrice()));
                intent.putExtra("productBrand", product.getBrand());
                intent.putExtra("productDescribe", product.getProductDescribe());
                intent.putExtra("productColor", product.getProductColor());
                intent.putExtra("productSize", product.getProductSize());
                context.startActivity(intent);
            }
        }
    }
}