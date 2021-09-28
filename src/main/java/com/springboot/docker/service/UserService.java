package com.springboot.docker.service;

import com.springboot.docker.bean.User;

import java.util.List;

/**
        *功能描述:$ $
        *@author guyongqi
        *@date $
        */

public interface UserService {
    List<User> queryUsers();
    User findUserById(Integer id);
    void addUser(User user);
    User login(String name, String password);
}
