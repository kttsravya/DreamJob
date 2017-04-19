package com.project.dreamjob.domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="job_posting")
public class JobPosting {
   
   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name="job_id")
   int jobId;
   
   @Column(name="company_name")
   String companyName;
   
  @Column(name="recruiter_email")
  @NotEmpty(message="please enter emailId")
  @Email(message="please enter correct email address")
  String recruiterEmail;
   
   @Column(name="job_field")
  String jobField;
   
   @Column(name="job_title")
  String jobtitle;
   
   @Column(name="employment_type")
  String employmentType;
  
   @Column(name="seniority_level")
  String seniorityLevel;
  String country;
  String state;
  String city;
  
  @NotNull(message="please enter zip")
  @Max(value = 99999, message="please enter valid zip number")
  @Min(value = 10000, message="please entere valid zip number")
  int zip;
  
  // ElementCollection - to specify hibernate that this is a list
  @ElementCollection
  
  //JoinTable - to define newly created table name , JoinColumn - to define newly created column name
  @JoinTable(name = "Technology",
		  		joinColumns = @JoinColumn(name = "job_id")
            )
 
   // the following three lines of code is to create primary key for newly created skill table
   @GenericGenerator(name = "sequence", strategy = "sequence")
   @GeneratedValue(generator = "sequence", strategy=GenerationType.SEQUENCE)
  // collection id defines pri key of new table
   @CollectionId(columns = { @Column(name="id") }, generator =
	  "sequence", type = @Type(type = "long") )
  
  // use arraylist to define collections because can access elements using index.
  Collection<Technology> technologies = new ArrayList<Technology>();
  
  
 public JobPosting(){
	 
 }
public int getJobId() {
	return jobId;
}
public void setJobId(int jobId) {
	this.jobId = jobId;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public String getRecruiterEmail() {
	return recruiterEmail;
}
public void setRecruiterEmail(String recruiterEmail) {
	this.recruiterEmail = recruiterEmail;
}
public String getJobField() {
	return jobField;
}
public void setJobField(String jobField) {
	this.jobField = jobField;
}
public String getJobtitle() {
	return jobtitle;
}
public void setJobtitle(String jobtitle) {
	this.jobtitle = jobtitle;
}
public String getEmploymentType() {
	return employmentType;
}
public void setEmploymentType(String employmentType) {
	this.employmentType = employmentType;
}
public String getSeniorityLevel() {
	return seniorityLevel;
}
public void setSeniorityLevel(String seniorityLevel) {
	this.seniorityLevel = seniorityLevel;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getZip() {
	return zip;
}
public void setZip(int zip) {
	this.zip = zip;
}
public Collection<Technology> getTechnologies() {
	return technologies;
}
public void setTechnologies(Collection<Technology> technologies) {
	this.technologies = technologies;
}


  
  
  
}
