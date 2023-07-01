package com.example.se1603_prm392_shoestoreapp_group05.Data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.se1603_prm392_shoestoreapp_group05.Model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDBHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "products.db";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_PRODUCTS = "products";
    private static final String COLUMN_ID = "ProductID";
    private static final String COLUMN_IMAGE = "ProductImage";
    private static final String COLUMN_NAME = "ProductName";
    private static final String COLUMN_PRICE = "ProductPrice";

    public ProductDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableQuery = "CREATE TABLE " + TABLE_PRODUCTS + " (" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                COLUMN_IMAGE + " TEXT," +
                COLUMN_NAME + " TEXT," +
                COLUMN_PRICE + " REAL" +
                ")";
        db.execSQL(createTableQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PRODUCTS);
        onCreate(db);
    }

    public void insertProduct(Product product) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_IMAGE, product.getProductImage());
        values.put(COLUMN_NAME, product.getProductName());
        values.put(COLUMN_PRICE, product.getProductPrice());
        db.insert(TABLE_PRODUCTS, null, values);
        db.close();
    }

    public List<Product> getAllProducts() {
        List<Product> productList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT rowid, * FROM " + TABLE_PRODUCTS, null);
        if (cursor.moveToFirst()) {
            do {
                int ProductID = cursor.getInt(cursor.getColumnIndexOrThrow(COLUMN_ID));
                String ProductImage = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_IMAGE));
                String ProductName = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NAME));
                double ProductPrice = cursor.getDouble(cursor.getColumnIndexOrThrow(COLUMN_PRICE));
                Product product = new Product(ProductImage, ProductName, ProductPrice);
                product.setProductID(ProductID);
                productList.add(product);
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return productList;
    }
}
