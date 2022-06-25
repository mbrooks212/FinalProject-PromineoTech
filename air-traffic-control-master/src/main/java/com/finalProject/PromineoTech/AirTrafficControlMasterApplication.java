package com.finalProject.PromineoTech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {
"com.finalProject.controller","com.finalProject.exception","com.finalProject.model",
"com.finalProject.repository","com.finalProject.service","com.finalProject.service.impl"})

@EntityScan("com.finalProject.model")
@EnableJpaRepositories(basePackages = "com.finalProject.repository")
public class AirTrafficControlMasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirTrafficControlMasterApplication.class, args);
	}
}