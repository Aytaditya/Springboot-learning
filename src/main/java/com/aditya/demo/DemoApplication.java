package com.aditya.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
	ApplicationContext context= SpringApplication.run(DemoApplication.class, args);
	Dev obj=context.getBean(Dev.class);
		// above line means like hey spring give me object(bean) of type Dev that you are managing
	obj.build();
	}

}
