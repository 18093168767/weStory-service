package com.springboot.docker.mapper;

import com.springboot.docker.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
        *功能描述:$ $
        *@author guyongqi
        *@date $
        */

@Mapper
public interface UserMapper {
    List<User> queryUsers();
    User findUserById(Integer id);
    void addUser(User user);
    User login(String name, String password);
}
