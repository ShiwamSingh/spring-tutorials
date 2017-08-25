package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.helloworld.SchedulerBo;

@Configuration
public class SchedulerConfig {

	@Bean(name = "scheduler")
	public SchedulerBo suchedulerBo() {

		return new SchedulerBo();

	}

}
