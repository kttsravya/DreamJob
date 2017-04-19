package com.project.dreamjob.exceptions;

public class RecruiterNotInSignUpListException extends Exception {
	String email;
	public String message ="recruiter email id not exist in db";
      public RecruiterNotInSignUpListException(String email1){
    	  email = email1;
      }
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
      
}
