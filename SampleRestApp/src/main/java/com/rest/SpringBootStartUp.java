package com.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.rest.controller.SpringBootRestController;


@SpringBootApplication

public class SpringBootStartUp {
	
	
		
	public static void main(String[] args) {
		SpringApplication.run(SpringBootStartUp.class, args);
	}

}
