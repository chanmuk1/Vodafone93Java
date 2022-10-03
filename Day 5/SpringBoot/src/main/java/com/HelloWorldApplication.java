package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) 
	{   
		//CODE WILL EXECUTE BEFORE SpringApplication START
		System.out.println("INSIDE MAIN METHOD1"); 
		
		//START SPRING APPLICATION
		SpringApplication.run(HelloWorldApplication.class, args);
		
		//ADD CODE
		System.out.println("INSIDE MAIN METHOD");
		System.out.println("SPRING BOOT HELLO WORLD PROJECT");
	}
}
