package com.Spring.WebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LoginController {

    //REQUESTS - Here we're creating a request to server, mapping and returning the data
    @RequestMapping("/login")
    public String login(){
        return "Login Page working...";
    }
}
