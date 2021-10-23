package com.dodayum.service;

import com.dodayum.po.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplicationConsumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        UserService bean = context.getBean(UserService.class);
        User user = new User();
        user.setUserName("abc");
        String s = bean.sayHello(user);
        System.out.println(s);
    }

}
