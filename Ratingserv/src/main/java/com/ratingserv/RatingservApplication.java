package com.ratingserv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RatingservApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingservApplication.class, args);
	}

}
