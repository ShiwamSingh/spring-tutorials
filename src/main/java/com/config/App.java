package com.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.helloworld.HelloWorld;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(RootConfiguration.class);
		HelloWorld obj = (HelloWorld) context.getBean("helloBean");

		obj.setName("Spring3 Java Config");
		obj.printHello();

	}

}
