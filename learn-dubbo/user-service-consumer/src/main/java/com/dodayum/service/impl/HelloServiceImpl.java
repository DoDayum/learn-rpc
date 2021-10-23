package com.dodayum.service.impl;

import com.dodayum.po.User;
import com.dodayum.service.HelloService;
import com.dodayum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    UserService userService;

    @Override
    public void testHello(User user) {
        String s = userService.sayHello(user);
        System.out.println(s);
    }
}
