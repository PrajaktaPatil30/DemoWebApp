package com.DemoWebApp.BookExchange.dao;

import org.springframework.data.repository.CrudRepository;


import com.DemoWebApp.BookExchange.model.Book;
import com.DemoWebApp.BookExchange.model.User;


public interface UserRepository extends CrudRepository<User, Integer> {

}
