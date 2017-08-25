package com.output;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OutputHelper {
	
	
	IOutputGenerator outputGenerator;

	public void generateOutput() {
		outputGenerator.generateOutput();
	}

	// DI via setter method
	@Autowired
	@Qualifier("csvoutputGenerator")
	public void setOutputGenerator(IOutputGenerator outputGenerator) {
		this.outputGenerator = outputGenerator;
	}
}
