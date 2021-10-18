package com.springboot.ourStory.service;

import com.springboot.ourStory.bean.User;

import java.util.List;

/**
        *功能描述:$ $
        *@author guyongqi
        *@date $
        */

public interface UserService {
    List<User> queryUsers();
    User findUserById(Integer id);
    Integer addUser(User user);
    User login(String name, String password);
}
