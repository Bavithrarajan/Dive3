package com.rsb.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rsb.Model.Books;

@Configuration
public class BooksConfiguration {
@Bean
public Books books(){
	return new Books();
}
}
