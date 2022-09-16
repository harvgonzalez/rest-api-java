package com.restfulws.springmvvjpa.restfulappspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class RestfulAppSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulAppSpringApplication.class, args);
	}

	@Bean
	BCryptPasswordEncoder bCryptPasswordEncoder(){
		return new BCryptPasswordEncoder();
	}

	@Bean
	SpringApplicationContext springApplicationContext(){
		return new SpringApplicationContext();
	}

}
