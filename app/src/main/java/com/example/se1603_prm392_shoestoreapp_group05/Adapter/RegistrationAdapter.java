package com.example.se1603_prm392_shoestoreapp_group05.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.se1603_prm392_shoestoreapp_group05.Data.RegistrationData;
import com.example.se1603_prm392_shoestoreapp_group05.R;

import java.util.List;

public class RegistrationAdapter extends RecyclerView.Adapter<RegistrationAdapter.ViewHolder> {
    private List<RegistrationData> registrationList;
    private Context context;

    public RegistrationAdapter(Context context, List<RegistrationData> registrationList) {
        this.context = context;
        this.registrationList = registrationList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_registration, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        RegistrationData data = registrationList.get(position);

        holder.usernameTextView.setText(data.getUsername());
        holder.emailTextView.setText(data.getEmail());
        holder.phoneNumTextView.setText(data.getPhoneNum());
        holder.addressTextView.setText(data.getAddress());
    }

    @Override
    public int getItemCount() {
        return registrationList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView usernameTextView;
        public TextView emailTextView;
        public TextView phoneNumTextView;
        public TextView addressTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            usernameTextView = itemView.findViewById(R.id.etUsername);
            emailTextView = itemView.findViewById(R.id.etEmail);
            phoneNumTextView = itemView.findViewById(R.id.etPhoneNum);
            addressTextView = itemView.findViewById(R.id.etAddress);
        }
    }
}
