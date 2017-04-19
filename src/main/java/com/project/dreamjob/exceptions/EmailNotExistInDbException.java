package com.project.dreamjob.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
//@ResponseStatus(HttpStatus.NOT_FOUND)
 
public class EmailNotExistInDbException extends Exception {
	String emailId;
	public String message ="email id not exist in db";
	public EmailNotExistInDbException(String emailId1){
		emailId = emailId1;
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


