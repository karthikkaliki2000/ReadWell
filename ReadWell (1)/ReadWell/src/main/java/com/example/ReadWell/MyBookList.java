package com.example.ReadWell;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component("myBookList")
@Scope("prototype")
public class MyBookList implements BookList {
	

	ArrayList<Book> bookListli=new ArrayList<Book>();
	
	@PostConstruct
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("Book list created");
		bookListli.add(new myBook("Default books"));
	}

	@Override
	public ArrayList<Book> getBookList() {
		// TODO Auto-generated method stub
		return bookListli;
	}

}
