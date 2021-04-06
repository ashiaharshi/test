package com.mindtree.authorbookjpa.service;

import com.mindtree.authorbookjpa.dto.AuthorDto;
import com.mindtree.authorbookjpa.exception.service.AuthorServiceException;

public interface AuthorService {

	public AuthorDto addAuthor(AuthorDto authorDto, String bookName) throws AuthorServiceException;

}
