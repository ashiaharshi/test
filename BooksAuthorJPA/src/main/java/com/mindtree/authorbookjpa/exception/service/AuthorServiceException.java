package com.mindtree.authorbookjpa.exception.service;

import com.mindtree.authorbookjpa.exception.AuthorException;

public class AuthorServiceException extends AuthorException {

	private static final long serialVersionUID = 1L;

	public AuthorServiceException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AuthorServiceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public AuthorServiceException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public AuthorServiceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public AuthorServiceException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
