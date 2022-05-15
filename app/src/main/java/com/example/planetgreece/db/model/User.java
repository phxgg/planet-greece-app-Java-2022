package com.example.planetgreece.db.model;

import java.io.Serializable;

public class User implements Serializable {
    int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String salt;
    private boolean isAdmin;
    private String savedArticles;
    private String createdAt;

    public User() {

    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getSalt() {
        return salt;
    }

    public boolean getIsAdmin() {
        return isAdmin;
    }

    public String getSavedArticles() {
        return savedArticles;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public void setSavedArticles(String savedArticles) {
        this.savedArticles = savedArticles;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
