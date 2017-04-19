package com.project.dreamjob.exceptions;

public class InvalidZipCodeException extends Exception{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    String message = "invalid zip code exception";
public InvalidZipCodeException(){
	   
   }
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}

}
