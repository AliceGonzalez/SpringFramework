package com.spring.myApp;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

    public void compile(){
        System.out.println("Desktop: Compiling with 404 bug is working");
    }
}
