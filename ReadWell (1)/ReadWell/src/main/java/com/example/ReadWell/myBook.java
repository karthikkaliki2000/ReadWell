package com.example.ReadWell;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myBook")
@Scope("prototype")
public class myBook implements Book {
	String name;
	boolean isIssued=false;
	public myBook(String name) {
		this.name=name;
	}
	public myBook() {
		
	}
	@Override
	public String getBookName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	@Override
	public void setBookName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
		
		
	}
	@Override
	public boolean isIssued() {
		// TODO Auto-generated method stub
		return this.isIssued;
	}
	@Override
	public void issue() {
		// TODO Auto-generated method stub
		this.isIssued=true;
		
	}
	
}
