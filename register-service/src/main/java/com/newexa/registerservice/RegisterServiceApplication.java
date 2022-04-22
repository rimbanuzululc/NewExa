package com.newexa.registerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.newexa")
@EntityScan("com.newexa.registerservice.model")
@EnableJpaRepositories(basePackages = "com.newexa.registerservice.repository")
public class RegisterServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterServiceApplication.class, args);
	}

}
