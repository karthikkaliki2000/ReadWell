package com.example.ReadWell;

public interface User {
	public void setDetails(String name);

    public BookList getAllBooks();

    public void issueOrAddBooks(Book book);
}
