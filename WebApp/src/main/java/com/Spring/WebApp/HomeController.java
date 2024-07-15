package com.Spring.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    //METHOD
    RequestMapping("/")

    public String greet(){
        return "Welcome to my Spring WebApp!!!";
    }
}
