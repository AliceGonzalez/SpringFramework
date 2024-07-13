package com.spring.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary //Will chose this class as default
public class Laptop implements Computer {

    public void compile(){
        System.out.println("Laptop: Compiling with 404 bug is working");
    }
}
