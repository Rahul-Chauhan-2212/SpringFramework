package com.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.entity.Book;
import com.spring.boot.service.BookService;

@RestController
public class BookController {

	@Autowired
	BookService bookService;

	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}

	@GetMapping("/books/id/{id}")
	public Book getBookById(@PathVariable("id") int id) {
		return bookService.getBookById(id);
	}

	@GetMapping("/books/name/{name}")
	public Book getBookByName(@PathVariable("name") String name) {
		return bookService.getBookByName(name);
	}

	@PostMapping("/books/add")
	public List<Book> addNewBook(@RequestBody Book book) {
		return bookService.addNewBook(book);
	}

	@DeleteMapping("/books/{id}")
	public List<Book> deleteBook(@PathVariable("id") int id) {
		return bookService.deleteBook(id);
	}

	@PutMapping("/books/{id}")
	public List<Book> updateBook(@PathVariable("id") int id, @RequestBody Book book) {
		return bookService.updateBook(id, book);
	}

}
