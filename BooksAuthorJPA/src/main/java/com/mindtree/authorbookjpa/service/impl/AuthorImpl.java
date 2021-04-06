package com.mindtree.authorbookjpa.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import com.mindtree.authorbookjpa.entity.Author;
import com.mindtree.authorbookjpa.entity.Book;
import com.mindtree.authorbookjpa.exception.service.AuthorServiceException;
import com.mindtree.authorbookjpa.exception.service.NoBookFoundException;
import com.mindtree.authorbookjpa.dto.AuthorDto;
import com.mindtree.authorbookjpa.repository.AuthorRepository;
import com.mindtree.authorbookjpa.repository.BookRepository;
import com.mindtree.authorbookjpa.service.AuthorService;
@Service
public class AuthorImpl implements AuthorService {

	@Autowired
	private AuthorRepository authorRep;
	
	@Autowired
	private BookRepository bookRep;
	
	static ModelMapper mapper = new ModelMapper();
	
	@Override
	public AuthorDto addAuthor(AuthorDto author, String bookName) throws AuthorServiceException {
		
		Author author1 =  new Author();
		Author authorRepository = new Author();
		try {
			Book book  = bookRep.findByBookName(bookName).orElseThrow(()->new NoBookFoundException("No such Book Available"));
				author1 = mapper.map(author, Author.class);
				author1.setBook(book);
				authorRepository = authorRep.save(author1);
				author = mapper.map(authorRepository, AuthorDto.class);
			}catch (DataAccessException | NoBookFoundException e) {
			throw new AuthorServiceException(e.getMessage());
		}
		return author;
	}

}
