package com.etoak;

import com.etoak.service.User;
import com.etoak.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringClient {
    public static void main(String[] args) {
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-cxf.xml");
        UserService userService =(UserService) ioc.getBean("userService");
        User user = userService.getById(100);
        System.out.println(user.getName()+":"+user.getAge());
    }
}
