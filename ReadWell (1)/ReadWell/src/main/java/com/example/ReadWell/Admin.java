package com.example.ReadWell;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Admin implements User {

    String name;
    
    @Autowired
    BookList bookList;
	@Override
	public void setDetails(String name) {
		// TODO Auto-generated method stub
		this.name=name;

	}

	@Override
	public BookList getAllBooks() {
		// TODO Auto-generated method stub
		return bookList;
	}

	@Override
	public void issueOrAddBooks(Book book) {
		// TODO Auto-generated method stub
		bookList.getBookList().add(book);
		System.out.println("Book issued succesfully");

	}

}
