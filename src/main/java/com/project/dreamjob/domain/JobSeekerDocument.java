package com.project.dreamjob.domain;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
@Entity
@Table(name = "jobseeker_document")
public class JobSeekerDocument {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "document_id")
	int documentId;
	
	@Column(name="name", length=100, nullable=false)
    String name;
	
	@Column(name="type", length=100, nullable=false)
	String type;
	
	@Column(name="description", length=255, nullable = false)
	String description;
	
	@Lob
	@Column(name="content", nullable=false)
	byte[] content;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="jobseeker_id")
	JobSeekerSignUp jobSeekerSignUp;
	
	public JobSeekerDocument(){
		
	}

	public int getDocumentId() {
		return documentId;
	}

	public void setDocumentId(int documentId) {
		this.documentId = documentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getContent() {
		return content;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}

	public JobSeekerSignUp getJobSeekerSignUp() {
		return jobSeekerSignUp;
	}

	public void setJobSeekerSignUp(JobSeekerSignUp jobSeekerSignUp) {
		this.jobSeekerSignUp = jobSeekerSignUp;
	}
	
	public int getJobSeekerId(){
		return jobSeekerSignUp.jobSeekerId;
	}

	@Override
	public String toString() {
		return "JobSeekerDocument [name=" + name + ", type=" + type + ", description=" + description + ", content="
				+ Arrays.toString(content) + "]";
	}
	
	
    
    

}
