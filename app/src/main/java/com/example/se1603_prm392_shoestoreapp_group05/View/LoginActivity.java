package com.example.se1603_prm392_shoestoreapp_group05.View;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.se1603_prm392_shoestoreapp_group05.Adapter.ChatAdapter;
import com.example.se1603_prm392_shoestoreapp_group05.Adapter.UserAdapter;
import com.example.se1603_prm392_shoestoreapp_group05.Data.RegisterHelper;
import com.example.se1603_prm392_shoestoreapp_group05.R;

public class LoginActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;

    private UserAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Khởi tạo UserAdapter
        userAdapter = new UserAdapter(this);

        Button signInButton = findViewById(R.id.btn_SignUp);
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
                finish(); // Để kết thúc hoạt động của trang Register
            }
        });

        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);
        loginButton = findViewById(R.id.btn_login);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();

                if (username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Please enter username and password", Toast.LENGTH_SHORT).show();
                } else {
                    if (userAdapter.authenticateUser(username, password)) {
                        Toast.makeText(LoginActivity.this, "Login successful", Toast.LENGTH_SHORT).show();
                        // Kiểm tra xem người dùng có phải là admin hay không
                        boolean isAdmin = username.equals("admin") && password.equals("123");
                        if (isAdmin) {
                            // Chuyển sang trang AdminActivity
                            Intent intent = new Intent(LoginActivity.this, ChatActivity.class);
                            startActivity(intent);
                        } else {
                            // Chuyển sang trang chính
                            Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                            intent.putExtra("USERNAME", username);
                            startActivity(intent);
                        }
                        finish();
                    } else {
                        Toast.makeText(LoginActivity.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}


