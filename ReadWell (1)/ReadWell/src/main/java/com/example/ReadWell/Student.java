package com.example.ReadWell;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student implements User {

     String name;
     @Autowired
     @Qualifier("myBookList")
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
		System.out.println("Book added succesfully");
		

	}

}
