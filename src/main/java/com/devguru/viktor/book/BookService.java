package com.devguru.viktor.book;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BookService {
	
	private final BookRepository bookRepository;

	public List<Book> getBooks() {
		return bookRepository.getBooks();
	}
	
	public List<Book> getBooksByCategory(String category) {
		if (category.equals("all"))
			return getBooks();
		else
			return bookRepository.getBooksByCategory(category);		
	}
	
	public Book getBookById(int id) {
		return bookRepository.getBookById(id);		
	}
}
