package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.helloworld.CustomerBo;
import com.helloworld.HelloWorld;
import com.helloworld.SchedulerBo;
import com.output.OutputHelper;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(RootConfiguration.class);
		HelloWorld obj = (HelloWorld) context.getBean("helloBean");

		obj.setName("Spring3 Java Config");
		obj.printHello();
		
		CustomerBo customer = (CustomerBo) context.getBean("customer");
		customer.printMsg("Hello 1");

		SchedulerBo scheduler = (SchedulerBo) context.getBean("scheduler");
		scheduler.printMsg("Hello 2");

		OutputHelper output = (OutputHelper)context.getBean("OutputHelper");
		output.generateOutput();

	}

}
