package com.mindtree.authorbookjpa.service.impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.mindtree.authorbookjpa.dto.BookDto;
import com.mindtree.authorbookjpa.entity.Book;
import com.mindtree.authorbookjpa.exception.service.BookServiceException;
import com.mindtree.authorbookjpa.exception.service.NoBookFoundException;
import com.mindtree.authorbookjpa.repository.BookRepository;
import com.mindtree.authorbookjpa.service.BookService;
@Service
public class BookImpl implements BookService {

	@Autowired
	private BookRepository bookRep;
	
	static ModelMapper mapper = new ModelMapper();
	
	@Override
	public BookDto addBook(BookDto bookDto) throws BookServiceException {
		Book book = null;
		Book bookRepository = null;
		BookDto bookDt = null;
		try {
			book = mapper.map(bookDto, Book.class);
			bookRepository = bookRep.save(book);
			bookDt = mapper.map(bookRepository, BookDto.class);
			return bookDt;
		}catch (DataAccessException e) {
			throw new BookServiceException(e);
		}
	}

	@Override
	public List<Book> fetchDetailsByPrice(double price) throws BookServiceException {
		List<Book> books = bookRep.findAll();
		try {
			if(books.size()>0) {
				books = books.stream().filter(f -> f.getPrice()>=price).collect(Collectors.toList());
			Collections.sort(books, new Comparator<Book>() {

				@Override
				public int compare(Book b1, Book b2) {
					int result = b2.getBookName().compareToIgnoreCase(b1.getBookName());
					return result;
				}
			});
			}
			else
				throw new NoBookFoundException("No such book found");
		}catch (NoBookFoundException e) {
			throw new BookServiceException(e);
		}
		return books;
	}

}
