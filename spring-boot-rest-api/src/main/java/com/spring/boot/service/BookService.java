package com.spring.boot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entity.Book;
import com.spring.boot.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	// static List<Book> books = new ArrayList<>();

	/*
	 * static { books.add(new Book(1, "JAVA", 15.67)); books.add(new Book(2, "C++",
	 * 16.46)); books.add(new Book(3, "Spring Boot", 35.63)); }
	 */

	public List<Book> getAllBooks() {
		// return books;
		return (List<Book>) bookRepository.findAll();
	}

	public Book getBookById(int id) {
		// return books.stream().filter(b -> b.getId() == id).findFirst().get();
		return bookRepository.findById(id).get();
	}

	public Book getBookByName(String name) {
		// return books.stream().filter(b -> b.getName().compareTo(name) ==
		// 0).findFirst().get();
		return bookRepository.findByName(name);
	}

	public List<Book> addNewBook(Book book) {
		// books.add(book);
		// return books;
		bookRepository.save(book);
		return (List<Book>) bookRepository.findAll();
	}

	public List<Book> deleteBook(int id) {
		// books.remove(getBookById(id));
		// return books;
		bookRepository.deleteById(id);
		return (List<Book>) bookRepository.findAll();
	}

	public List<Book> updateBook(int id, Book book) {
		/*
		 * return books.stream().map(b -> { if (b.getId() == id) {
		 * b.setName(book.getName()); b.setPrice(book.getPrice()); } return b;
		 * }).collect(Collectors.toList());
		 */
		Book book2 = bookRepository.findById(id).get();
		book2.setName(book.getName());
		book2.setPrice(book.getPrice());
		bookRepository.save(book2);
		return (List<Book>) bookRepository.findAll();
	}

}
