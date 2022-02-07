package com.thoughtfocus.applicationform.exception;

public class PasswordNotMatchedException extends RuntimeException{
	
	public PasswordNotMatchedException(String msg) {
		super(msg);
	}

}
