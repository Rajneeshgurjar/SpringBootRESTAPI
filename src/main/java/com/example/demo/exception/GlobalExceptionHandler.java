package com.example.demo.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.utiliy.ResponseStatus;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseStatus handleUserNotFOundException(UserNotFoundException ex){
		return new ResponseStatus(200,ex.getMessage());
	}
}
