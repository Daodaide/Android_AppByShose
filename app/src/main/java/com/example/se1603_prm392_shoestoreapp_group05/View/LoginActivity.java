package com.example.se1603_prm392_shoestoreapp_group05.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.se1603_prm392_shoestoreapp_group05.Data.RegistrationData;
//import com.example.se1603_prm392_shoestoreapp_group05.Model.Utils;
import com.example.se1603_prm392_shoestoreapp_group05.R;

public class LoginActivity extends AppCompatActivity {
    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;
    private TextView forgotPasswordTextView;
    private Button signUpButton;

    private RegistrationData registrationData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Ánh xạ các thành phần giao diện
        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);
        loginButton = findViewById(R.id.btn_login);
        forgotPasswordTextView = findViewById(R.id.edt_fogotpassword);
        signUpButton = findViewById(R.id.textView);

        // Nhận dữ liệu từ Intent
        Intent intent = getIntent();
        registrationData = intent.getParcelableExtra("registrationData");

        // Xử lý sự kiện khi nhấn nút Đăng nhập
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputUsername = usernameEditText.getText().toString();
                String inputPassword = passwordEditText.getText().toString();

                // Kiểm tra thông tin đăng nhập
                if (registrationData != null && inputUsername.equals(registrationData.getUsername()) && inputPassword.equals(registrationData.getPassword())) {

                    // Đăng nhập thành công
                    Toast.makeText(LoginActivity.this, "Login successful", Toast.LENGTH_SHORT).show();
                    Intent homeIntent = new Intent(LoginActivity.this, HomeActivity.class);
                    //Utils.saveLoggedInUser(LoginActivity.this, inputUsername, inputPassword);
                    homeIntent.putExtra("username", registrationData.getName());
                    startActivity(homeIntent);
                } else {
                    // Đăng nhập thất bại
                    Toast.makeText(LoginActivity.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Xử lý sự kiện khi nhấn nút Đăng ký
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển sang màn hình đăng ký
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

    }
}
