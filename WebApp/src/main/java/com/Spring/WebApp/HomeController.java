package com.Spring.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    //METHOD
    @RequestMapping("/")
    public String greet(){
        return "Welcome to my Spring WebApp!!!";
    }

    @RequestMapping("/about")
    public String about(){
        return "This is my about me page!!";
    }
}
