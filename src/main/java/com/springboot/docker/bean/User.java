package com.springboot.docker.bean;
/**
        *功能描述:$ $
        *@author guyongqi
        *@date $
        */

public class User {
    public int id;
    public  String name;
    public String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
