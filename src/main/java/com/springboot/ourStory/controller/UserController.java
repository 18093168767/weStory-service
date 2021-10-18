package com.springboot.ourStory.controller;

import com.springboot.ourStory.bean.User;
import com.springboot.ourStory.result.ResultCode;
import com.springboot.ourStory.result.ResultVO;
import com.springboot.ourStory.service.UserService;
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

    /**
     * 用户注册
     * @param user
     * @return
     */
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public ResultVO addUser(@RequestBody User user){
        Integer id = userService.addUser(user);
        if(id != null) {
            return new ResultVO<>(ResultCode.USER_REGISTER_SUCCESS, user.getId());
        } else {
            return new ResultVO<>(ResultCode.USER_LOGIN_SUCCESS, "");
        }
    }

    /**
     * 查询所有用户
     * @param user
     * @return
     */
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> queryUsers(){
        return userService.queryUsers();
    }

    /**
     * 根据用户id查用户
     * @param user
     * @return
     */
    @RequestMapping(value = "/findUserById/{id}", method = RequestMethod.GET)
    public User queryUserDetails(@PathVariable("id") Integer id){
        return userService.findUserById(id);
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
        class UserInfobd {
            public  String name;

            public void setId(int id) {
                this.id = id;
            }
            public int id;

            public void setName(String name) {
                this.name = name;
            }
        }
        UserInfobd userInfobd = new UserInfobd();
        userInfobd.setName(userInfo.getName());
        userInfobd.setId(userInfo.getId());
        return new ResultVO<>(ResultCode.USER_LOGIN_SUCCESS, userInfobd);
    }
}

















