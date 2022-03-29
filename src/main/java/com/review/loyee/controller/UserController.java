package com.review.loyee.controller;

import com.review.loyee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/test1111")
    public String test111(){
        int a = userService.go();
        return "test111";
    }

    @RequestMapping(method = RequestMethod.GET )
    public String test222(){
        return "test222";
    }
}
