package com.springboot.docker.serviceImpl;

import com.springboot.docker.bean.User;
import com.springboot.docker.mapper.UserMapper;
import com.springboot.docker.service.UserService;
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
    public void addUser(User user){
        this.userMapper.addUser(user);
    }

    @Override
    public User login(String name, String password){
        return userMapper.login(name, password);
    }
}
