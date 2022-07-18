package com.example.StepUp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication
@EnableAutoConfiguration
public class StepUpApplication {

	public static void main(String[] args) {
		SpringApplication.run(StepUpApplication.class, args);
	}

}
