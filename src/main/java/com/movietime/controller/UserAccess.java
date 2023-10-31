package com.movietime.controller;
public class UserAccess {
    private String email;
    private String password;


    public UserAccess() {
        // Default constructor
    }

    public UserAccess(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
