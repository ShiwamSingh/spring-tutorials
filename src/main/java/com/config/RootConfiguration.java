package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.helloworld.HelloWorld;

@Configuration
@Import({ CustomerConfig.class, SchedulerConfig.class })
public class RootConfiguration {

	@Bean(name = "helloBean")
	public HelloWorld helloBean() {
		return new HelloWorld();
	}
}
