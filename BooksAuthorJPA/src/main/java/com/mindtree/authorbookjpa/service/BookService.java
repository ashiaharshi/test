package com.mindtree.authorbookjpa.service;

import java.util.List;

import com.mindtree.authorbookjpa.dto.BookDto;
import com.mindtree.authorbookjpa.entity.Book;
import com.mindtree.authorbookjpa.exception.service.BookServiceException;

public interface BookService {

	public BookDto addBook(BookDto book) throws BookServiceException;

	public List<Book> fetchDetailsByPrice(double price) throws BookServiceException;

}
