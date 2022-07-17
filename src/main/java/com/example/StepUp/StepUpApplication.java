package com.example.StepUp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude =  {DataSourceAutoConfiguration.class })

public class StepUpApplication {

	public static void main(String[] args) {
		SpringApplication.run(StepUpApplication.class, args);
	}

}
