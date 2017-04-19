package com.project.dreamjob.exceptions;

public class EmailAlreadyExistInDbException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String emailId;
	public String message ="email already exist in db";
	public EmailAlreadyExistInDbException(String email){
		emailId = email;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
