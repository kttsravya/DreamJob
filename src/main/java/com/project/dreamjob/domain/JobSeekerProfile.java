package com.project.dreamjob.domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.ElementCollection;

import org.hibernate.annotations.Type;


@Entity
@Table(name ="jobseeker_profile")
public class JobSeekerProfile {
	
	 @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "profile_id")
	 int profileId;
	 @Column(name = "jobseeker_email")
	 String email;
	 String degree;
	 
	 @Column(name="field_of_study")
	 String fieldOfStudy;
	
	 @Column(name = "job_title")
	 String jobTitle;
	 
	 @Column(name = "job_type")
	 String jobType;
	 String experience;
	 

	 
	 // ElementCollection - to specify hibernate that this is a list
	  @ElementCollection
	  
	  //JoinTable - to define newly created table name , JoinColumn - to define newly created column name
	  @JoinTable(name = "Skill",
			  		joinColumns = @JoinColumn(name = "profile_id")
	            )
	 
	   // the following three lines of code is to create primary key for newly created skill table
	   @GenericGenerator(name = "sequence", strategy = "sequence")
	   @GeneratedValue(generator = "sequence", strategy=GenerationType.SEQUENCE)
	  // collection id defines pri key of new table
	   @CollectionId(columns = { @Column(name="id") }, generator =
		  "sequence", type = @Type(type = "long") )
	  
	  // use arraylist to define collections because can access elements using index.
	  Collection<Skill> skills = new ArrayList<Skill>();
	  
	 
	 public JobSeekerProfile(){
		 
	 }
	 
	public int getProfileId() {
		return profileId;
	}
	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getFieldOfStudy() {
		return fieldOfStudy;
	}
	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}

	public Collection<Skill> getSkills() {
		return skills;
	}

	public void setSkills(Collection<Skill> skills) {
		this.skills = skills;
	}
	
	
	
	 
	 
	 
}

//@Entity
//public class Profile {
// @Id @GeneratedValue(strategy = GenerationType.AUTO)
//  int profileId;
//  String degree;
//  int expereince;
//  String jobTitle;
//  String jobType;
//  String fieldOfStudy;
// 
//  @Column(unique=true,columnDefinition="VARCHAR(64)",nullable = false)
//  String email;
//  
//  // established one to one connection between profile table and job seeker sign up table so 
//  // no need to have email field here..
//  //  String email;
//  
//  // ElementCollection - to specify hibernate that this is a list
//  @ElementCollection
//  
//  //JoinTable - to define newly created table name , JoinColumn - to define newly created column name
//  @JoinTable(name = "Skill",
//		  		joinColumns = @JoinColumn(name = "profileId")
//            )
// 
//   // the following three lines of code is to create primary key for newly created skill table
//   @GenericGenerator(name = "sequence", strategy = "sequence")
//   @GeneratedValue(generator = "sequence", strategy=GenerationType.SEQUENCE)
//  // collection id defines pri key of new table
//   @CollectionId(columns = { @Column(name="skillId") }, generator =
//	  "sequence", type = @Type(type = "long") )
//  
//  // use arraylist to define collections because can access elements using index.
//  Collection<Skill> skills = new ArrayList<Skill>();
//  
//
//  
//public Profile(){
//	
//}
//public Collection<Skill> getSkills() {
//	return skills;
//}
//public void setSkills(Collection<Skill> skills) {
//	this.skills = skills;
//}
//public int getProfileId() {
//	return profileId;
//}
//public void setProfileId(int profileId) {
//	this.profileId = profileId;
//}
//public String getDegree() {
//	return degree;
//}
//public void setDegree(String degree) {
//	this.degree = degree;
//}
//public int getExpereince() {
//	return expereince;
//}
//public void setExpereince(int expereince) {
//	this.expereince = expereince;
//}
//public String getJobTitle() {
//	return jobTitle;
//}
//public void setJobTitle(String jobTitle) {
//	this.jobTitle = jobTitle;
//}
//public String getJobType() {
//	return jobType;
//}
//public void setJobType(String jobType) {
//	this.jobType = jobType;
//}
//public String getFieldOfStudy() {
//	return fieldOfStudy;
//}
//public void setFieldOfStudy(String fieldOfStudy) {
//	this.fieldOfStudy = fieldOfStudy;
//}
////public String getEmail() {
////	return email;
////}
////public void setEmail(String email) {
////	this.email = email;
////}
//  
//}
