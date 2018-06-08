package edu.bu.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "edu.bu.controller")
@EnableJpaRepositories(basePackages = "edu.bu.repository")
@EntityScan(basePackages = "edu.bu.model")
public class Application {
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        
    }
    
    
}