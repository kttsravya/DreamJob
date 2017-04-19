package com.project.dreamjob.exceptions;

public class JobPostingWithJobIdNotExistException extends Exception {
	int jobId;
	public String message ="job id not exist";
	public JobPostingWithJobIdNotExistException(int jobId1) {
		jobId = jobId1;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
