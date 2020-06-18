package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.daos.BookDao;

@Component
public class BookServiceImpl implements BookService {

	@Autowired
	BookDao bookDao;
	
	@Override
	public void saveBook() {
		System.out.println("Saving book in BookService");
		bookDao.saveBook();
	}
}
