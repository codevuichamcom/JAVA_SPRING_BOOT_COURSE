package com.codevui.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		System.out.println("Hello world");
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
