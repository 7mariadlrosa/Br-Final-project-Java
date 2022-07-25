package com.ironhack.lenguageservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class LenguageServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LenguageServiceApplication.class, args);
	}

}
