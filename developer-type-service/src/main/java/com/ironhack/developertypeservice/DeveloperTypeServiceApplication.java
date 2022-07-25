package com.ironhack.developertypeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeveloperTypeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeveloperTypeServiceApplication.class, args);
	}

}
