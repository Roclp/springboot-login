package com.example.controller;

import com.example.domain.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @RequestMapping
    public String show(){
        return "login";
    }

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/loginIN",method = RequestMethod.POST)
    //0@RequestMapping("/login")
    public String login(String name,String pwd){
        User user=userService.login(name,pwd);
        if(user!=null)
            return "success";
        else
            return "error";

    }
}
