package com.devguru.viktor.book;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
@RequestMapping("/books")
public class BookPageController {
	
	private final BookService bookService;
	
	@GetMapping()
	public String bookList(@RequestParam(defaultValue="all") String category, Model model) {
		List<Book> books = bookService.getBooksByCategory(category);
		model.addAttribute("bookList", books);
		return "books";
	}
	
	@GetMapping("/{id}")
	public String book(@PathVariable("id") int id, Model model) {
		Book book = bookService.getBookById(id);
		model.addAttribute("book", book);
		return "book";
	}

}
