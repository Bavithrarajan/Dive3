package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.rsb.Configuration.BooksConfiguration;
import com.rsb.Model.Books;

public class BooksTest {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(BooksConfiguration.class);
	Books books=(Books)context.getBean(Books.class);
	books.setId(1);
	books.setBookName("Beauty");
	books.setAuthor("shylaja");
	System.out.println(books);
	((AbstractApplicationContext)context).close();
}
}
