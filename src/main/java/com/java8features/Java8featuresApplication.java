package com.java8features;

import com.java8features.functionalinterface.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Java8featuresApplication {

	public static void main(String[] args) {
		SpringApplication.run(Java8featuresApplication.class, args);
		System.out.println("This is demo of functional interface in java");
		UserService userService = new UserService();
//		userService.Users();
		userService.sortMethod();
	}

}
