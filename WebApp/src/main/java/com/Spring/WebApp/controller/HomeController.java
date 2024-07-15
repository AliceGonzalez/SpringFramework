package com.Spring.WebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    //REQUESTS - Here we're creating a request to server, mapping and returning the data
    @RequestMapping("/")
    public String greet(){
        return "Welcome to my Spring WebApp!!!";
    }

    @RequestMapping("/about")
    public String about(){
        return "This is my about me page!!";
    }
}
