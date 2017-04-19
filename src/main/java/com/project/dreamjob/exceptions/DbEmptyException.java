package com.project.dreamjob.exceptions;

public class DbEmptyException extends Exception {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message = "db is empty";

public DbEmptyException(){
	
	
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

}
