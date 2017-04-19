package com.project.dreamjob.restcontrollers;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.dreamjob.domain.JobSeekerSignUp;
import com.project.dreamjob.domain.RecruiterSignUp;
import com.project.dreamjob.exceptions.DbEmptyException;
import com.project.dreamjob.exceptions.EmailAlreadyExistInDbException;
import com.project.dreamjob.exceptions.EmailNotExistInDbException;
import com.project.dreamjob.exceptions.EmptyPasswordFieldException;
import com.project.dreamjob.services.JobSeekerSignUpService;

@RestController
public class JobSeekerRestController {
	
	@Autowired
	JobSeekerSignUpService service;
	
	   // http://localhost:8080/dreamjob/jobseeker/kttsravya@gmail.com/email.xml
		@RequestMapping(value = "/jobseeker/{emailId}/email", method = RequestMethod.GET)
		public JobSeekerSignUp getRecruiterByEmailId(@PathVariable String emailId) throws EmailNotExistInDbException, DbEmptyException {
			
				return service.getJobSeekerSignUpInfo(emailId);
			
		}
		
		// http://localhost:8080/dreamjob/alljobseekers.xml
		@RequestMapping(value="/alljobseekers", method=RequestMethod.GET)
		public AllJobSeekers getAllJobSeekers() throws DbEmptyException{
			AllJobSeekers all = new AllJobSeekers();
			all.setList(service.getAllJobSeekers()); 
			 return all;
		}
		
		// http://localhost:8080/dreamjob/jobseeker/newjobseeker.xml
		@RequestMapping(value="/jobseeker/newjobseeker", method=RequestMethod.POST)
		public void saveNewJobSeeker(@RequestBody JobSeekerSignUp seeker) throws EmailAlreadyExistInDbException, DbEmptyException, EmptyPasswordFieldException{
			service.saveJobSeekerSignUpInfo(seeker);
		}
		
		// http://localhost:8080/dreamjob/jobseeker/newjobseekers.xml
		@RequestMapping(value="/jobseeker/newjobseekers", method=RequestMethod.POST)
		public void saveListOfJobSeekers(@RequestBody AllJobSeekers allrec) throws EmailAlreadyExistInDbException, DbEmptyException, EmptyPasswordFieldException{
			AllJobSeekers allrec1 = allrec;
			List<JobSeekerSignUp> recSignUpList = allrec1.getList();
		    Iterator<JobSeekerSignUp> it  =  recSignUpList.iterator();
		    while(it.hasNext()){
		    	JobSeekerSignUp rec = it.next();
		    	System.out.println(rec.getEmail());
		    	service.saveJobSeekerSignUpInfo(rec);
		    }
		}
		
		
}
