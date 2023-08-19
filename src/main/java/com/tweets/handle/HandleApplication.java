package com.tweets.handle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.tweets.handle")
@EnableJpaRepositories(basePackages = "com.tweets.handle")
public class HandleApplication {

	public static void main(String[] args) {
		SpringApplication.run(HandleApplication.class, args);
	}

}
