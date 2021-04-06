package com.mindtree.authorbookjpa.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.authorbookjpa.dto.BookDto;
import com.mindtree.authorbookjpa.entity.Book;
import com.mindtree.authorbookjpa.exception.BookException;
import com.mindtree.authorbookjpa.exception.service.BookServiceException;
import com.mindtree.authorbookjpa.service.BookService;

@RestController
@RequestMapping("/Book")
public class BookController {

	@Autowired
	private BookService bookService;

	@PostMapping(value = "/addBook", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<?> addBook(@RequestHeader(value = "Accept") String acceptHeader,
			@RequestHeader(value = "Postman-Token") String token, 
			@RequestHeader(value = "Content-Type") String content, 
			@RequestHeader(value = "Content-Length") String length, 
			@RequestHeader(value = "Host") String host, 
			@RequestBody @Valid BookDto book)
			throws BookException {
		try {
			book = bookService.addBook(book);
			Map<String, String> value = new HashMap<>();
			value.put("Accept", acceptHeader);
			value.put("Postman-Token", token);
			value.put("Content-Type", content);
			value.put("Content-Length", length);
			value.put("Host", host);
			return new ResponseEntity(book, HttpStatus.OK);
		} catch (BookServiceException e) {
			throw new BookException(e);
		}
	}

	@GetMapping("/fetchDetailsByPrice/{price}")
	public List<Book> fetchDetailsByPrice(@PathVariable("price") double price) throws BookException {
		try {
			return bookService.fetchDetailsByPrice(price);
		} catch (BookServiceException e) {
			throw new BookException(e);
		}
	}
}
