package com.springboot.docker.controller;

import com.springboot.docker.bean.User;
import com.springboot.docker.result.ResultCode;
import com.springboot.docker.result.ResultVO;
import com.springboot.docker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
        *功能描述:$ $
        *@author guyongqi
        *@date $
        */

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserService userService;

    /*查询所有用户*/
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> queryUsers(){
        return userService.queryUsers();
    }
    /*根据用户id查用户*/
    @RequestMapping(value = "/findUserById/{id}", method = RequestMethod.GET)
    public User queryUserDetails(@PathVariable("id") Integer id){
        return userService.findUserById(id);
    }
    /*添加用户*/
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(User user){
        userService.addUser(user);
        return "ok";
    }
    /**
     * 用户登录
     * @param user
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResultVO userLogin(@RequestBody User user){
        String name = user.getName();
        String password = user.getPassword();
        User userInfo = userService.login(name, password);
        if(userInfo==null){
            return new ResultVO<>(ResultCode.USER_LOGIN_FAIL, "");
        }else{
            return new ResultVO<>(ResultCode.USER_LOGIN_SUCCESS, userInfo);
        }
    }
}

















