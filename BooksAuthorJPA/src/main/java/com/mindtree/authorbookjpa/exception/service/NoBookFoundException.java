package com.mindtree.authorbookjpa.exception.service;

public class NoBookFoundException extends BookServiceException {

	private static final long serialVersionUID = 1L;

	public NoBookFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NoBookFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public NoBookFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NoBookFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public NoBookFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
