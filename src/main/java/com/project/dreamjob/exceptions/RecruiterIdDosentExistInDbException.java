package com.project.dreamjob.exceptions;

@SuppressWarnings("serial")
public class RecruiterIdDosentExistInDbException extends Exception {
	int recruiterId;
	public String message ="recruiter id not exist in db";
	public RecruiterIdDosentExistInDbException(int recruiterId1){
		recruiterId = recruiterId1;
	}
	public int getRecruiterId() {
		return recruiterId;
	}
	public void setRecruiterId(int recruiterId) {
		this.recruiterId = recruiterId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
