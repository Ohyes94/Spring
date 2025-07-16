package com.devguru.viktor.book;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Book {
	int id;
	String name;
	String category;
}
