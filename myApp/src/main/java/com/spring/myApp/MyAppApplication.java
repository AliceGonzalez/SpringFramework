package com.spring.myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {
		//This creates a container
		ApplicationContext context = SpringApplication.run(MyAppApplication.class, args);

		//Without Spring you have to create ojg if you want to use methods from another class
		//This way im creating obj inside JVM container but not the I0C container meaning im responsible to the object cycle and managin it
		//Person personObj = new Person();

		//personObj.build();

		//WITH SPRING you need a reference to the container to talk  to it
		//This below is injecting a dependency
		Dev devRef = context.getBean(Dev.class);
		
		devRef.build();
	}

}
