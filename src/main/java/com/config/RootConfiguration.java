package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.helloworld.HelloWorld;
import com.output.IOutputGenerator;
import com.output.OutputHelper;
import com.output.impl.CsvOutputGenerator;
import com.output.impl.JsonOutputGenerator;

@Configuration
@Import({ CustomerConfig.class, SchedulerConfig.class })
public class RootConfiguration {

	@Bean(name = "helloBean")
	public HelloWorld helloBean() {
		return new HelloWorld();
	}
	
	@Bean(name = "jsonoutputGenerator")
	public IOutputGenerator jsonoutputGenerator(){
		return new JsonOutputGenerator();
	}
	
	@Bean(name = "csvoutputGenerator")
	public IOutputGenerator csvoutputGenerator(){
		return new CsvOutputGenerator();
	}
	
	
	@Bean(name = "OutputHelper")
	public OutputHelper outputHelper() {
		return new OutputHelper();
	}
}
