package com.example.se1603_prm392_shoestoreapp_group05.View;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.se1603_prm392_shoestoreapp_group05.Data.RegisterHelper;
import com.example.se1603_prm392_shoestoreapp_group05.R;

public class RegisterActivity extends AppCompatActivity {

    private EditText etUsername, etPassword, etPasswordConfirm, etEmail, etPhoneNum, etAddress;
    private Button btnRegister;

    private RegisterHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        etPasswordConfirm = findViewById(R.id.etPasswordConfirm);
        etEmail = findViewById(R.id.etEmail);
        etPhoneNum = findViewById(R.id.etPhoneNum);
        etAddress = findViewById(R.id.etAddress);
        btnRegister = findViewById(R.id.btnRegister);
        Button signInButton = findViewById(R.id.btnSignIn);
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
                finish(); // Để kết thúc hoạt động của trang Register
            }
        });


        databaseHelper = new RegisterHelper(this);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerUser();
            }
        });
    }

    private void registerUser() {
        String username = etUsername.getText().toString().trim();
        String password = etPassword.getText().toString().trim();
        String passwordConfirm = etPasswordConfirm.getText().toString().trim();
        String email = etEmail.getText().toString().trim();
        String phoneNum = etPhoneNum.getText().toString().trim();
        String address = etAddress.getText().toString().trim();

        if (username.isEmpty() || password.isEmpty() || passwordConfirm.isEmpty() || email.isEmpty() || phoneNum.isEmpty() || address.isEmpty()) {
            Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
        } else if (!password.equals(passwordConfirm)) {
            Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show();
        } else if (!email.matches(".*@gmail\\.com") || email.length() > 20) {
            Toast.makeText(this, "Please enter a valid Gmail address (max 20 characters)", Toast.LENGTH_SHORT).show();
        } else if (phoneNum.length() != 10) {
            Toast.makeText(this, "Please enter a 10-digit phone number", Toast.LENGTH_SHORT).show();
        } else if (!phoneNum.matches("\\d+")) {
            Toast.makeText(this, "Please enter a numeric phone number", Toast.LENGTH_SHORT).show();
        } else {
            SQLiteDatabase db = databaseHelper.getWritableDatabase();

            // Check if the email already exists in the database
            String query = "SELECT * FROM " + RegisterHelper.TABLE_USER + " WHERE " + RegisterHelper.COLUMN_EMAIL + "=?";
            Cursor cursor = db.rawQuery(query, new String[]{email});
            if (cursor.moveToFirst()) {
                // Email already exists
                Toast.makeText(this, "Email already exists", Toast.LENGTH_SHORT).show();
            } else {
                // Email is unique, proceed with registration
                ContentValues values = new ContentValues();
                values.put(RegisterHelper.COLUMN_USERNAME, username);
                values.put(RegisterHelper.COLUMN_PASSWORD, password);
                values.put(RegisterHelper.COLUMN_EMAIL, email);
                values.put(RegisterHelper.COLUMN_PHONE, phoneNum);
                values.put(RegisterHelper.COLUMN_ADDRESS, address);

                long result = db.insert(RegisterHelper.TABLE_USER, null, values);

                if (result == -1) {
                    Toast.makeText(this, "Failed to register", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Registration successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(intent);
                    finish();
                }
            }

            cursor.close();
            db.close();
        }
    }
}