package com.revature.daos;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BookDaoMySQL implements BookDao{

	@Override
	public void saveBook() {
		System.out.println("Saving book in BookDao using MySQL");
	}

}
