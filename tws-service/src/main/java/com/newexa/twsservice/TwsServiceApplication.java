package com.newexa.twsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TwsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwsServiceApplication.class, args);
	}

}
