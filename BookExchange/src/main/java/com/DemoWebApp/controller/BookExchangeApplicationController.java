package com.DemoWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookExchangeApplicationController {

	@RequestMapping("/")  
	public String hello()   
	{  
	return "Hello There!";  
	}  
}
