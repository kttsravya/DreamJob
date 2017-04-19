package com.project.dreamjob.exceptions;

public class EmptyPasswordFieldException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
     public String message="empty password field exception";
	public EmptyPasswordFieldException(){
		
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
