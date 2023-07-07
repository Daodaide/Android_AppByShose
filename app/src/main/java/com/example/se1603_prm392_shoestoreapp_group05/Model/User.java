package com.example.se1603_prm392_shoestoreapp_group05.Model;

public class User {
    private int id;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String address;

    public User() {
        // Empty constructor needed for SQLite
    }

    public User(int id, String username, String password, String email, String phone, String address) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}