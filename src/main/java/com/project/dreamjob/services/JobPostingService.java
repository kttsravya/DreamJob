package com.project.dreamjob.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.project.dreamjob.dao.JobPostingDao;
import com.project.dreamjob.dao.JobSeekerProfileDao;
import com.project.dreamjob.domain.JobPosting;
import com.project.dreamjob.domain.JobSeekerProfile;
import com.project.dreamjob.exceptions.DbEmptyException;
import com.project.dreamjob.exceptions.RecruiterNotInSignUpListException;

@Service
@EnableTransactionManagement
@Transactional
public class JobPostingService {
   
   @Autowired
   JobPostingDao postingDao;
   
   
	
	public JobPosting saveJobPosting(JobPosting p) throws DbEmptyException, RecruiterNotInSignUpListException{
		JobPosting p1 = postingDao.saveJobPosting(p);
		return p1;
	}
	
	public List<JobPosting> getJobPostingListByRequirements(String jobType, String jobField, String jobTitle, String exp){
		List<JobPosting> list =  postingDao.getJobPostingListByRequirements(jobType, jobField, jobTitle, exp);
		return list;
	}

	public List<String> getAllJobTypes() {
		String[] array = {"FullTime","Intern","Contracting"};
		List<String> jobList = Arrays.asList(array);
		return jobList;
	}

	public List<String> getAllJobTitles() {
		String[] array = {"Developer","Designer","Tester","Manager"};
		List<String> jobTitles = Arrays.asList(array);
		return jobTitles;
	}

	public List<String> getAllJobFields() {
		String[] array = {"ComputerScience","Electrical","Mechanical","InformationTechnology"};
		List<String> jobFields = Arrays.asList(array);
		return jobFields;
	}

	public List<String> getAllSeneriotyLevels() {
		String[] array = {"NewGrad","Mid-Level","Senior-Level"};
		List<String> jobFields = Arrays.asList(array);
		return jobFields;
	}

	
}
