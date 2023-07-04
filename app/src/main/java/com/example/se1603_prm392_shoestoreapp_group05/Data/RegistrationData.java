package com.example.se1603_prm392_shoestoreapp_group05.Data;

import android.os.Parcel;
import android.os.Parcelable;

public class RegistrationData implements Parcelable {
    private String username;
    private String password;
    private String email;
    private String phoneNum;
    private String address;

    public RegistrationData(String username, String password, String email, String phoneNum, String address) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNum = phoneNum;
        this.address = address;
    }

    // Getter và setter cho các thuộc tính

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getName() {
        // Giả sử tên được xác định từ tên người dùng (username)
        return username;
    }

    // Implement Parcelable interface methods
    protected RegistrationData(Parcel in) {
        username = in.readString();
        password = in.readString();
        email = in.readString();
        phoneNum = in.readString();
        address = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(username);
        dest.writeString(password);
        dest.writeString(email);
        dest.writeString(phoneNum);
        dest.writeString(address);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<RegistrationData> CREATOR = new Creator<RegistrationData>() {
        @Override
        public RegistrationData createFromParcel(Parcel in) {
            return new RegistrationData(in);
        }

        @Override
        public RegistrationData[] newArray(int size) {
            return new RegistrationData[size];
        }
    };
}
