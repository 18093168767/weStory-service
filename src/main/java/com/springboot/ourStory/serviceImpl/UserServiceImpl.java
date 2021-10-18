package com.springboot.ourStory.serviceImpl;

import com.springboot.ourStory.bean.User;
import com.springboot.ourStory.mapper.UserMapper;
import com.springboot.ourStory.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
        *功能描述:$ $
        *@author guyongqi
        *@date $
        */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryUsers(){
        return userMapper.queryUsers();
    }

    @Override
    public User findUserById(Integer id){
        return userMapper.findUserById(id);
    }

    @Override
    public Integer addUser(User user){
        return this.userMapper.addUser(user);
    }

    @Override
    public User login(String name, String password){
        return userMapper.login(name, password);
    }
}
