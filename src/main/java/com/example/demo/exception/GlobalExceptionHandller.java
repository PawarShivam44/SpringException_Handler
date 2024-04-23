package com.example.demo.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandller {
	
	@ExceptionHandler(value = EmplyeeNotFoundException.class)
	public ResponseEntity<ApiException> HandelEmployeeNotFoundException() {
		
		ApiException err= new ApiException("Exception While Getting Employee Details", 405, LocalDate.now());
		return new ResponseEntity<ApiException>(err, HttpStatus.BAD_REQUEST);
	}
	

}
