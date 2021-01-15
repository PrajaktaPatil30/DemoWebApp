package com.DemoWebApp.BookExchange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.DemoWebApp.controller")
@EnableAutoConfiguration
public class BookExchangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookExchangeApplication.class, args);
	}

}
