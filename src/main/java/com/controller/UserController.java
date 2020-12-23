package com.controller;

import com.entity.User;
import com.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping("/login")
    public String login(@RequestParam("username") String username ,@RequestParam("password") String password){
        /*User user =new User();
        user.setUserName(username);
        user.setPassword(password);
        if (userService.login(user)){
            return "home";
        }*/
        return "home";
    }

    @RequestMapping("/index")
    public String hello(){
        return "init/index";
    }


    @RequestMapping("/hello")
    public String hello2(){
        return "home_bak";
    }
}
