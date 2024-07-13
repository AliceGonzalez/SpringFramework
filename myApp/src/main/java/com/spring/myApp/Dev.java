package com.spring.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {


    //FIELD INJECTION METHOD
    @Autowired
    @Qualifier("laptop")
    private Computer computerRef;

    //CONSTRUCTOR INJECTION METHOD
//    public Dev (Laptop laptopRef){
//        this.laptopRef = laptopRef;
//    }


    //SETTER INJECTION METHOD
    // @Autowired
//    public void  setLaptop(Laptop laptopRef){
//        this.laptopRef = laptopRef;
//    }

    public void build(){

        //Using methods from another class
        computerRef.compile();

        System.out.println("Working on Spring tutorial");
    }
}
