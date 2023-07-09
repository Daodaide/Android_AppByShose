package com.example.se1603_prm392_shoestoreapp_group05.Model;

public class Message {
    private String sender;
    private String message;
    private String timestamp;

    public Message(String sender, String message) {
        this.sender = sender;
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getSender() {
        return sender;
    }

    public String getMessage() {
        return message;
    }

    public String getTimestamp() {
        return timestamp;
    }
}