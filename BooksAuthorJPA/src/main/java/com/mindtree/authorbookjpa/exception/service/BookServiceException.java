package com.mindtree.authorbookjpa.exception.service;

import com.mindtree.authorbookjpa.exception.BookException;

public class BookServiceException extends BookException {

	private static final long serialVersionUID = 1L;

	public BookServiceException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookServiceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public BookServiceException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public BookServiceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public BookServiceException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
