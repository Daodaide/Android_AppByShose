package com.example.se1603_prm392_shoestoreapp_group05.Adapter;

import android.content.Context;
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

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ProductViewHolder>{
    private List<Product> productList;
    private Context context;



    public HomeAdapter(Context context, List<Product> productList) {
        this.context = context;
        this.productList = productList;
    }
    public void setProducts(List<Product> products) {
        this.productList = products;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_home, parent, false);
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

    public class ProductViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageViewProduct;
        private TextView textViewName;
        private TextView textViewPrice;



        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewProduct = itemView.findViewById(R.id.imageview_product);
            textViewName = itemView.findViewById(R.id.textview_name);
            textViewPrice = itemView.findViewById(R.id.textview_price);
        }

        public void bind(Product product) {
            Picasso.get().load(product.getProductImage()).into(imageViewProduct);
            textViewName.setText(product.getProductName());
            textViewPrice.setText(String.valueOf(product.getProductPrice()));
        }
    }
}
