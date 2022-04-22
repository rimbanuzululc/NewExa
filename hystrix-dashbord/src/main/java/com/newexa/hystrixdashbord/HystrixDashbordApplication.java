package com.newexa.hystrixdashbord;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class HystrixDashbordApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixDashbordApplication.class, args);
	}

}
