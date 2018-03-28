package com.springboot.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan(basePackages= {"com.springboot.controller"})

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SpringApplication.run(Main.class, args);
	}

}
