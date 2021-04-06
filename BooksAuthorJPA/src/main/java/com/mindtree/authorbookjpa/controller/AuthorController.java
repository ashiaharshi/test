package com.mindtree.authorbookjpa.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.authorbookjpa.dto.AuthorDto;
import com.mindtree.authorbookjpa.entity.Book;
import com.mindtree.authorbookjpa.exception.BookException;
import com.mindtree.authorbookjpa.exception.ControllerException;
import com.mindtree.authorbookjpa.exception.service.AuthorServiceException;
import com.mindtree.authorbookjpa.exception.service.BookServiceException;
import com.mindtree.authorbookjpa.service.AuthorService;

@RestController
@RequestMapping("/Author")
public class AuthorController {
	@Autowired
	private AuthorService authorService;

	@PostMapping("/addAuthor/{bookName}")
	public ResponseEntity<?> addAuthor(@RequestBody @Valid AuthorDto authorDto,
			@PathVariable("bookName") String bookName) throws ControllerException {
		try {
			authorDto = authorService.addAuthor(authorDto, bookName);
			HttpHeaders header = new HttpHeaders();
			header.set("name", authorDto.getAuthorName());
			return new ResponseEntity(authorDto, header, HttpStatus.OK);
		} catch (AuthorServiceException e) {
			throw new ControllerException(e.getMessage());
		}
	}

	@GetMapping("/fetchAuthorDetailsByBookName/{bookName}")
	public List<AuthorDto> fetchDetailsByPrice(@PathVariable("bookName") String bookName) {
		return authorService.fetchDetailsByPrice(bookName);
	}
}
