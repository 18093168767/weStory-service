package com.springboot.ourStory.mapper;

import com.springboot.ourStory.bean.User;
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
    Integer addUser(User user);
    User login(String name, String password);
}
