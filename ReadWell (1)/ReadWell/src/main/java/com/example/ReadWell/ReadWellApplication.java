package com.example.ReadWell;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ReadWellApplication {

	public static void main(String[] args) {
		ApplicationContext con=SpringApplication.run(ReadWellApplication.class, args);
		System.out.println("welcome to library application");
		User user=null;
		Book book=null;
		int addorNot=0;
		while(true) {
			System.out.println("please choose your user type\n1. Admin\n2. Student\n3. Exit");
			
			Scanner s=new Scanner(System.in);
			int utype=s.nextInt();
			s.nextLine();
			if(utype==3 ) {
				break;
			}
			System.out.println("Enter your name");
			String name=s.nextLine();
			
			switch(utype) {
			case 1:{
				user=con.getBean(Admin.class);
				while(true) {
					System.out.println("Do you want to add books\n1. Yes\n2.No");
					addorNot=s.nextInt();
					s.nextLine();
					if(addorNot==2) {
						break;
					}
					System.out.println("Enter the name of book");
					String bname=s.nextLine();
					book=con.getBean(myBook.class);
					book.setBookName(bname);
					user.issueOrAddBooks(book);
					
					
				}
				break;
			}
			case 2:{
				user=con.getBean(Student.class);
				while(true) {
					System.out.println("Do you want to add books\n1. Yes\n2.No");
					addorNot=s.nextInt();
					s.nextLine();
					if(addorNot==2) {
						break;
					}
					System.out.println("Enter the name of book");
					String bname=s.nextLine();
					book=con.getBean(myBook.class);
					book.setBookName(bname);
					user.issueOrAddBooks(book);
					
				
					
				}
				break;
			}
			case 3:{
				break;
			}
			}
			if(addorNot==2) {
				break;
			}
			
			
		}
		
		System.out.println("List of all available books");
		ArrayList<Book> li=user.getAllBooks().getBookList();
		for(Book b:li) {
			System.out.println(b.getBookName());
		}
		
		
		
	}

}
