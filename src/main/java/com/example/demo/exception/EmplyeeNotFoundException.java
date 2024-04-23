package com.example.demo.exception;

import org.springframework.stereotype.Component;

//@Component
public class EmplyeeNotFoundException extends Throwable {

	public EmplyeeNotFoundException(String errMsg) {
		super(errMsg);
	}
	
}
