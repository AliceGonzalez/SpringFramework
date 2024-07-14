package org.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        //THIS CREATES THE SPRING CONTAINER. Application Context is an interface
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //Dev devObj = new Dev();

        //TO GET THE OBJ
        Dev devObj = (Dev) context.getBean("dev");
        //devObj.setAge(18);
        System.out.println(devObj.getAge());
        //devObj.build();
    }
}
