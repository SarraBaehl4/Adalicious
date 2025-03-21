package com.kata.kata5;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import me.paulschwarz.springdotenv.DotenvPropertySource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class BackEndApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();

		// Add DotenvPropertySource to environment before registering components
    	DotenvPropertySource.addToEnvironment(applicationContext.getEnvironment());
    	applicationContext.refresh();

		SpringApplication.run(BackEndApplication.class, args);
	}
}
