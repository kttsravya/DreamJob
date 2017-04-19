package com.project.dreamjob.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Pattern.Flag;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.project.dreamjob.customAnnotatedValidators.Phone;
@XmlRootElement
@Entity
@Table(name = "recruiter_signup")
public class RecruiterSignUp {
  
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)	
  @Column(name = "recruiter_id")
  int recruiterId;
  
  

  @Email(message="please enter correct email address")
  @NotEmpty(message="please enter emailId")
  @Column(name="email", length=100, nullable=false)
  String email;
  


  @Size(min=8)  //--> this is giving getConstraintName error
  @NotEmpty(message="please enter password")
  @Column(name="password", length=100, nullable=false)
  String password;
  


  @Pattern(regexp="[a-z-A-Z]*",message="name has invalid characters", flags={Flag.CASE_INSENSITIVE})
  @NotEmpty(message="please enter name")
  @Column(name="name", length=100, nullable=false)
  String name;
  
 


  @Phone
  @NotEmpty(message="please enter contact Number")
  @Column(name = "contact_number",length=100, nullable=false)
  String contactNumber;
  

  @Column(name="country", length=100, nullable=false)
  String country;
  

  @Column(name="state", length=100, nullable=false)
  String state;
  

  @Column(name="city", length=100, nullable=false)
  String city;
  
 

  @NotNull(message="please enter zip")
  @Max(value = 99999, message="please enter valid zip number")
  @Min(value = 10000, message="please entere valid zip number")
 
  int zip;
  
@XmlElement
public int getRecruiterId() {
	return recruiterId;
}
public void setRecruiterId(int recruiterId) {
	this.recruiterId = recruiterId;
}
@XmlElement
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
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
@Override
public String toString() {
	return "RecruiterSignUp [email=" + email + ", password=" + password + ", name=" + name + ", contactNumber="
			+ contactNumber + ", country=" + country + ", state=" + state + ", city=" + city + ", zip=" + zip + "]";
}

  
  
  
}
