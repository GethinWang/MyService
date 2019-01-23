package com.gethin.wang.demo.controller;

import com.gethin.wang.domain.UserEntity;
import com.gethin.wang.domain.enums.UserSexEnum;
import com.gethin.wang.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private DemoMapper demoMapper;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String hello(){
        UserEntity u = new UserEntity();
        u.setNickName("wang");
//        u.setUserSex(UserSexEnum.MAN);
        demoMapper.insert(u);
        return "hello world!";
    }
}
