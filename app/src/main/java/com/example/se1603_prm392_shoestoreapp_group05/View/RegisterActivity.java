package com.example.se1603_prm392_shoestoreapp_group05.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.se1603_prm392_shoestoreapp_group05.Adapter.RegistrationAdapter;
import com.example.se1603_prm392_shoestoreapp_group05.Data.RegistrationData;
import com.example.se1603_prm392_shoestoreapp_group05.R;

import java.util.ArrayList;
import java.util.List;

public class RegisterActivity extends AppCompatActivity {

    private EditText etUsername, etPassword, etPasswordConfirm, etEmail, etPhoneNum, etAddress;
    private Button btnRegister;

    private List<RegistrationData> registrationList;
    private RegistrationAdapter registrationAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        registrationList = new ArrayList<>(); // Khởi tạo danh sách đăng ký

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        etPasswordConfirm = findViewById(R.id.etPasswordConfirm);
        etEmail = findViewById(R.id.etEmail);
        etPhoneNum = findViewById(R.id.etPhoneNum);
        etAddress = findViewById(R.id.etAddress);
        btnRegister = findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsername.getText().toString().trim();
                String password = etPassword.getText().toString().trim();
                String passwordConfirm = etPasswordConfirm.getText().toString().trim();
                String email = etEmail.getText().toString().trim();
                String phoneNum = etPhoneNum.getText().toString().trim();
                String address = etAddress.getText().toString().trim();

                if (validateRegistration(username, password, passwordConfirm, email, phoneNum, address)) {
                    RegistrationData registrationData = new RegistrationData(username, password, email, phoneNum, address);

                    // Lưu dữ liệu đăng ký vào danh sách
                    registrationList.add(registrationData);

                    // Đặt Adapter cho danh sách đăng ký (sử dụng registrationList như nguồn dữ liệu)
                    registrationAdapter = new RegistrationAdapter(RegisterActivity.this, registrationList);

                    Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                    intent.putExtra("registrationData", registrationData);
                    startActivity(intent);

                    Toast.makeText(RegisterActivity.this, "Registration successful!", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
    }

    private boolean validateRegistration(String username, String password, String passwordConfirm,
                                         String email, String phoneNum, String address) {
        if (username.isEmpty()) {
            etUsername.setError("Username is required");
            etUsername.requestFocus();
            return false;
        }

        if (password.isEmpty()) {
            etPassword.setError("Password is required");
            etPassword.requestFocus();
            return false;
        }

        if (password.length() < 6) {
            etPassword.setError("Password must be at least 6 characters");
            etPassword.requestFocus();
            return false;
        }

        if (!password.equals(passwordConfirm)) {
            etPasswordConfirm.setError("Passwords do not match");
            etPasswordConfirm.requestFocus();
            return false;
        }

        if (email.isEmpty()) {
            etEmail.setError
                    ("Email is required");
            etEmail.requestFocus();
            return false;
        }
        return true;
    }
}