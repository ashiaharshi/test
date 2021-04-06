package com.mindtree.authorbookjpa.service;

import java.util.List;

import com.mindtree.authorbookjpa.dto.AuthorDto;
import com.mindtree.authorbookjpa.exception.service.AuthorServiceException;

public interface AuthorService {

	public AuthorDto addAuthor(AuthorDto authorDto, String bookName) throws AuthorServiceException;

	public List<AuthorDto> fetchDetailsByPrice(String bookName);

}
