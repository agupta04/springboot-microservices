package com.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Ld7bMsProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ld7bMsProductServiceApplication.class, args);
	}

}
