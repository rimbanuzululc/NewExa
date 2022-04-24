package com.newexa.cifchild;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.newexa.cifchild.*")
@EntityScan("com.newexa.cifchild.model")
@EnableJpaRepositories(basePackages = "com.newexa.cifchild.repository")
@EnableEurekaClient
public class CifServiceChildApplication {

	public static void main(String[] args) {
		SpringApplication.run(CifServiceChildApplication.class, args);
	}

}
