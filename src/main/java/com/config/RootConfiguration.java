package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.helloworld.HelloWorld;

@Configuration
public class RootConfiguration {

	@Bean(name = "helloBean")
	public HelloWorld helloBean() {
		return new HelloWorld();
	}
}
