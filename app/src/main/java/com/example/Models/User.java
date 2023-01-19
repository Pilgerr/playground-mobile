package com.example.Models;

import android.widget.EditText;

public class User {
    private int id;
    private String email;
    private String name;
    private String phone;
    private String password;
    private String dtBorn;
    private String document;

    public User(String email, String name, String phone, String password, String dtBorn, String document) {
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.password = password;
        this.dtBorn = dtBorn;
        this.document = document;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDtBorn() {
        return dtBorn;
    }

    public void setDtBorn(String dtBorn) {
        this.dtBorn = dtBorn;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}
