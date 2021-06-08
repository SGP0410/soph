package com.example.soph.pojo;

public class MyToken {
    private String token;
    private int id;

    public MyToken() {
    }

    public MyToken(String token, int id) {
        this.token = token;
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
