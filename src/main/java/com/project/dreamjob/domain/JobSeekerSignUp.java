package com.project.dreamjob.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import com.project.dreamjob.customAnnotatedValidators.Phone;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@Entity
@Table(name = "jobseeker_signup")
public class JobSeekerSignUp {
	
	// id is primary key, and using IDENTITY which is better for mySQL
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "jobseeker_id")
    int jobSeekerId;
	
	@NotEmpty(message="please enter emailId")
	@Email(message="please enter correct email address")
    String email;
	
	@NotEmpty(message="please enter password")
	@Size(min=8)
    String password;
	
	@NotEmpty(message="please enter name")
	@Pattern(regexp="[a-z-A-Z]*",message="name has invalid characters")
    String name;
	
    @Column(name = "contact_number")
    @NotEmpty(message="please enter contact Number")
    @Phone
    String contactNumber;
    
    @NotEmpty(message="please enter country")
    String country;
    
    @NotEmpty(message="please enter state")
    String state;
    
    @NotEmpty(message="please enter city")
    String city;
    
    @NotNull(message="please enter zip")
    @Max(value = 99999, message="please enter valid zip number")
    @Min(value = 10000, message="please entere valid zip number")
    int zip;
   
    // the following code is written to tell hibernate there is one to many relationship
    // between jobSeekerSignUp class and jobSeekerDocument
    
    //fetch = FetchType.EAGER,
    //@XmlTransient
    @OneToMany(mappedBy = "jobSeekerSignUp", cascade = CascadeType.ALL)
    private List<JobSeekerDocument> jobSeekerDocuments = new ArrayList<JobSeekerDocument>();
    
    public JobSeekerSignUp(){
    	
    }
    @XmlElement
	public int getJobSeekerId() {
		return jobSeekerId;
	}
	public void setJobSeekerId(int jobSeekerId) {
		this.jobSeekerId = jobSeekerId;
	}
	@XmlElement
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@XmlElement
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@XmlElement
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@XmlElement
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	@XmlElement
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@XmlElement
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@XmlElement
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@XmlElement
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
//	public Set<JobSeekerDocument> getUserDocuments() {
//		return jobSeekerDocuments;
//	}
//	public void setUserDocuments(Set<JobSeekerDocument> userDocuments) {
//		this.jobSeekerDocuments = userDocuments;
//	}
	
	@Override
	public String toString() {
		return "JobSeekerSignUp [jobSeekerId=" + jobSeekerId + ", email=" + email + ", password=" + password + ", name="
				+ name + ", contactNumber=" + contactNumber + ", country=" + country + ", state=" + state + ", city="
				+ city + ", zip=" + zip + "]";
	}
	public List<JobSeekerDocument> getJobSeekerDocuments() {
		return jobSeekerDocuments;
	}
	public void setJobSeekerDocuments(List<JobSeekerDocument> jobSeekerDocuments) {
		this.jobSeekerDocuments = jobSeekerDocuments;
	}
	

}



