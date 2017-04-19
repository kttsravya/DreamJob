package com.project.dreamjob.restcontrollers;

import java.util.Iterator;
import java.util.List;

import javax.enterprise.inject.Produces;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.dreamjob.domain.RecruiterSignUp;
import com.project.dreamjob.exceptions.DbEmptyException;
import com.project.dreamjob.exceptions.EmailAlreadyExistInDbException;
import com.project.dreamjob.exceptions.EmailNotExistInDbException;
import com.project.dreamjob.exceptions.EmptyPasswordFieldException;
import com.project.dreamjob.services.RecruiterSignUpService;

@RestController
public class RecruiterRestController {
	
	@Autowired
	RecruiterSignUpService service;
	

	// http://localhost:8080/dreamjob/recruiter/kttsravya@gmail.com/email.xml
	
	@RequestMapping(value = "/recruiter/{emailId}/email", method = RequestMethod.GET)
	public RecruiterSignUp getRecruiterByEmailId(@PathVariable String emailId) throws EmailNotExistInDbException, DbEmptyException {
		
			return service.getRecruiterInfoByEmail(emailId);
		
	}
	
	// http://localhost:8080/dreamjob/allrecruiters.xml
	@RequestMapping(value="/allrecruiters", method=RequestMethod.GET)
	public AllRecruiters getAllRecruiters() throws DbEmptyException{
		AllRecruiters allrec = new AllRecruiters();
		 allrec.setList(service.getAllRecruiterSignUp()); 
		 return allrec;
	}
	
	// http://localhost:8080/dreamjob/recruiter/newrecruiter
	@RequestMapping(value="/recruiter/newrecruiter", method=RequestMethod.POST)
	public void saveNewRecruiter(@RequestBody RecruiterSignUp rec) throws EmailAlreadyExistInDbException, DbEmptyException, EmptyPasswordFieldException{
		RecruiterSignUp rec1 = rec;
		System.out.println(rec1.getEmail());
		System.out.println(rec1.getPassword());
		service.saveRecruiterInfo(rec);
	}
	
	// http://localhost:8080/dreamjob/recruiter/newrecruiters
	@RequestMapping(value="/recruiter/newrecruiters", method=RequestMethod.POST)
	public void saveListOfRecruiters(@RequestBody AllRecruiters allrec) throws EmailAlreadyExistInDbException, DbEmptyException, EmptyPasswordFieldException{
		AllRecruiters allrec1 = allrec;
		List<RecruiterSignUp> recSignUpList = allrec1.getList();
	    Iterator<RecruiterSignUp> it  =  recSignUpList.iterator();
	    while(it.hasNext()){
	    	RecruiterSignUp rec = it.next();
	    	System.out.println(rec.getEmail());
	    	service.saveRecruiterInfo(rec);
	    }
	}
	

}
