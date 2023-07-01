package com.example.se1603_prm392_shoestoreapp_group05.Model;

public class Product {
    private int ProductID;
    private String ProductImage;
    private String ProductName;
    private double ProductPrice;
    public Product(String ProductImage, String ProductName, double ProductPrice) {
        this.ProductImage = ProductImage;
        this.ProductName = ProductName;
        this.ProductPrice = ProductPrice;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ID) {
        this.ProductID = ID;
    }

    public String getProductImage() {
        return ProductImage;
    }

    public void setProductImage(String Image) {
        this.ProductImage = Image;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String Name) {
        this.ProductName = Name;
    }

    public double getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(double Price) {
        this.ProductPrice = Price;
    }
}
