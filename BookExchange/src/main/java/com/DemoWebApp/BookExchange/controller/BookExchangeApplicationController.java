package com.DemoWebApp.BookExchange.controller;

import java.util.List;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.DemoWebApp.BookExchange.dao.UserRepository;
import com.DemoWebApp.BookExchange.model.User;
import com.DemoWebApp.BookExchange.service.BookService;

@Controller
public class BookExchangeApplicationController {
	
	@Autowired
	BookService serv;
	
	@Autowired
	UserRepository userRepo;
	
	@RequestMapping("/")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/user")
	public ModelAndView getuser(String uname, String psw)
	{
		ModelAndView mv = new ModelAndView("home");
		ModelAndView me = new ModelAndView("Error");
		User user = userRepo.findByUserName(uname);
		mv.addObject(user);
			if(user.getPassword().equals(psw))
				return mv;
		
		return me;
	}

	

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
