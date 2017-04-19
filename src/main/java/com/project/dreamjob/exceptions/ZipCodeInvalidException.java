package com.project.dreamjob.exceptions;

public class ZipCodeInvalidException extends Exception {
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
String zip;
public String message ="zip code is invalid";
   public ZipCodeInvalidException(String zip1){
	   zip = zip1;
   }
public String getZip() {
	return zip;
}
public void setZip(String zip) {
	this.zip = zip;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
   
}
