package com.project.dreamjob.exceptions;

public class GivenJobSeekerIdNotExistInDbException extends Exception {
   int id;
   public String message ="given jobseeker id not exist in db";
   public GivenJobSeekerIdNotExistInDbException(int id1){
	   id = id1;
   }
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}

   
}
