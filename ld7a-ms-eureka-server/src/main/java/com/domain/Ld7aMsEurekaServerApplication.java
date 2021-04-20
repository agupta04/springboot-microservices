package com.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Ld7aMsEurekaServerApplication {

	public static void main(String[] args) {
		System.out.println("SPINNING UP THE EUREKA SERVER!!!");
		SpringApplication.run(Ld7aMsEurekaServerApplication.class, args);
	}

}
