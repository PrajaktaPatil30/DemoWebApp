package com.DemoWebApp.BookExchange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.DemoWebApp.BookExchange.model.User;
import com.DemoWebApp.BookExchange.service.BookService;

@Controller
public class BookExchangeApplicationController {
	
	@Autowired
	BookService serv;

	@RequestMapping("/register")  
	public String register()   
	{  
	return "register";  
	}  
	
	@RequestMapping("/adduser")  
	public ResponseEntity<User> adduser(User user)   
	{ 
		return ResponseEntity.ok().body(this.serv.adduser(user));
	}  
}
