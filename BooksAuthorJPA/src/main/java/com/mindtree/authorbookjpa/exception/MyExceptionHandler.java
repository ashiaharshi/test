package com.mindtree.authorbookjpa.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class MyExceptionHandler {

	@ExceptionHandler(ControllerException.class)
	public ResponseEntity<?> sourceNotFound(ControllerException exception, WebRequest request){
		ErrorDetails details = new ErrorDetails(new Date(), exception.getMessage(), request.getDescription(false));
		return new ResponseEntity<ErrorDetails>(details,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(BookException.class)
	public ResponseEntity<?> sourceNotFound(BookException exception, WebRequest request){
		ErrorDetails details = new ErrorDetails(new Date(), exception.getMessage(), request.getDescription(false));
		return new ResponseEntity<ErrorDetails>(details,HttpStatus.BAD_REQUEST);
	}
	
	//	Handling custom Validation Errors
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> validationException(MethodArgumentNotValidException ex, WebRequest request){
		ErrorDetails details = new ErrorDetails(new Date(), ex.getBindingResult().getFieldError().getDefaultMessage(), request.getDescription(false));
		return new ResponseEntity<ErrorDetails>(details,HttpStatus.BAD_REQUEST);
	}
}
