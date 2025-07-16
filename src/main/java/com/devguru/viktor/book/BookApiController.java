package com.devguru.viktor.book;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/books")
public class BookApiController {
	
	private final BookService bookService;
	
	@GetMapping()
	public List<Book> getBooks() {
		List<Book> bookList = bookService.getBooks();
		return bookList;
	}
	
	@GetMapping("/{id}")
	public Book getBookById(@PathVariable("id") int id) {
		Book book = bookService.getBookById(id);
		return book;
	}
	
	@GetMapping("/test")
	public String test(@RequestParam(name="id", defaultValue="default", required=true) String id) {
		return id == null? "null" : id;
	}

}
