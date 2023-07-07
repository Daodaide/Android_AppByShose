package com.example.se1603_prm392_shoestoreapp_group05.Model;

public class Message {
    private String sender;
    private String content;

    public Message() {
        // Empty constructor needed for Firebase
    }

    public Message(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public String getContent() {
        return content;
    }
}
