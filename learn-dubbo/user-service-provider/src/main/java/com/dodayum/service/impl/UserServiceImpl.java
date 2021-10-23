package com.dodayum.service.impl;

import com.dodayum.po.User;
import com.dodayum.service.UserService;

public class UserServiceImpl implements UserService {

    public UserServiceImpl(){
        System.out.println("注册进去了");
    }

    public String sayHello(User user) {
        return String.format("用户：%s\t说了一句hello", user.getUserName());
    }
}
