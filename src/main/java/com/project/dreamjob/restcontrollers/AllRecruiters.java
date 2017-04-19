package com.project.dreamjob.restcontrollers;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.project.dreamjob.domain.RecruiterSignUp;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AllRecruiters {

	@XmlElement(type = RecruiterSignUp.class)
	public List<RecruiterSignUp> list;

	public List<RecruiterSignUp> getList() {
		return list;
	}

	public void setList(List<RecruiterSignUp> list) {
		this.list = list;
	}
}
