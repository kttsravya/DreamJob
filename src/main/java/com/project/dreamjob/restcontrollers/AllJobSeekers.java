package com.project.dreamjob.restcontrollers;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.project.dreamjob.domain.JobSeekerSignUp;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AllJobSeekers {
	@XmlElement(type = JobSeekerSignUp.class)
	public List<JobSeekerSignUp> list;

	public List<JobSeekerSignUp> getList() {
		return list;
	}

	public void setList(List<JobSeekerSignUp> list) {
		this.list = list;
	}
	
	
}
