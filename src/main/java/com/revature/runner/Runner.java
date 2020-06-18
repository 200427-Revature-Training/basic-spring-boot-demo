package com.revature.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.revature.services.BookService;

@Component
public class Runner implements CommandLineRunner {

	@Autowired
	BookService bookService;
	
	@Override
	public void run(String... args) throws Exception {
		bookService.saveBook();
	}
	
}
