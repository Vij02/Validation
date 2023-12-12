package com.example.Validation;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages= {"com.example.Validation"})
@SpringBootApplication
public class ValidationApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(ValidationApplication.class, args);
		System.out.println("Welcome..!");
	}
 
}
