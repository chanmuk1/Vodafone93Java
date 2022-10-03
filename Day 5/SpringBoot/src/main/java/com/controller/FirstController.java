package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//STEP 1 :- Spring can understand that it is a REST Controller
//maps to the url method
@RestController
public class FirstController 
{
	    //STEP 2 MAP URL WITH METHOD
		@RequestMapping("/reg")
		public String func1()
		{
			return "<h1>THIS WILL OPEN REG PAGE</h1>";
		}
		
		@RequestMapping("/login")
		public String func2()
		{
			return "<h3>THIS WILL OPEN LOGIN PAGE</h3>";
		}
}
