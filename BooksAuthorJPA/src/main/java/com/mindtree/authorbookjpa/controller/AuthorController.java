package com.mindtree.authorbookjpa.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.authorbookjpa.dto.AuthorDto;
import com.mindtree.authorbookjpa.exception.ControllerException;
import com.mindtree.authorbookjpa.exception.service.AuthorServiceException;
import com.mindtree.authorbookjpa.service.AuthorService;

@RestController
@RequestMapping("/Author")
public class AuthorController {
	@Autowired
	private AuthorService authorService;

	@PostMapping("/addAuthor/{name}")
	public ResponseEntity<?> addAuthor(@RequestBody @Valid AuthorDto authorDto, @PathVariable("name") String bookName)
			throws ControllerException {
		try {
			authorDto = authorService.addAuthor(authorDto, bookName);
			HttpHeaders header = new HttpHeaders();
			header.set("name", authorDto.getAuthorName());
			return new ResponseEntity(authorDto, header, HttpStatus.OK);
		} catch (AuthorServiceException e) {
			throw new ControllerException(e.getMessage());
		}
	}
}
