package com.example.simplejwt.jwt;

public class AuthenticationRequest {

    private String password;
    private String username;

    public AuthenticationRequest() {
    }

    public AuthenticationRequest(String password, String username) {
        this.password = password;
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
