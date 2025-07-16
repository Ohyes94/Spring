package com.devguru.viktor.book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
	private List<Book> books;
	
	public BookRepository() {
		books = new ArrayList<>();		
		Book b1 = Book.builder().id(0).name("스프링 부트 완전정복").category("IT").build();
		books.add(b1);		
		Book b2 = Book.builder().id(1).name("침팬지와의 대화").category("생물학").build();
		books.add(b2);
	}
	
	public List<Book> getBooks() {
		return books;
	}
	
	public List<Book> getBooksByCategory(String category) {
		List<Book> filtered = books.stream()
			    .filter(book -> book.getCategory().equals(category))
			    .collect(Collectors.toList());
		return filtered;
	}
	
	public Book getBookById(int id) {
		return books.get(id);
	}

}
