package org.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        //THIS CREATES THE SPRING CONTAINER. Application Context is an interface
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        //TO GET THE OBJ
        Dev devObj = context.getBean(Dev.class);
        devObj.build();
    }
}
