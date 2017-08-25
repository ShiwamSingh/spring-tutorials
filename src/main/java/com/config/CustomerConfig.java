package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.helloworld.CustomerBo;

@Configuration
public class CustomerConfig {

	@Bean(name = "customer")
	public CustomerBo customerBo() {

		return new CustomerBo();

	}
}
