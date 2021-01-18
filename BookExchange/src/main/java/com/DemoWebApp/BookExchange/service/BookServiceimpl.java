package com.DemoWebApp.BookExchange.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.DemoWebApp.BookExchange.dao.UserRepository;
import com.DemoWebApp.BookExchange.model.User;


@Service
public class BookServiceimpl implements BookService {
	
	@Autowired
	private UserRepository repo;
	
	@Override
	public User adduser(User user) {
		return repo.save(user);
	}

}
