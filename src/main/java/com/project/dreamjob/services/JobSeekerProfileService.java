package com.project.dreamjob.services;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.project.dreamjob.dao.JobSeekerProfileDao;
import com.project.dreamjob.domain.JobSeekerProfile;
import com.project.dreamjob.exceptions.EmailNotExistInDbException;

@Service
@EnableTransactionManagement
@Transactional
public class JobSeekerProfileService {
	
	@Autowired
    JobSeekerProfileDao profileDao;
	
	public JobSeekerProfile saveJobSeekerProfile(JobSeekerProfile p){
		JobSeekerProfile p1;
		
        try {
			JobSeekerProfile p2 = profileDao.getJobSeekerProfileByEmailId(p.getEmail());
		} catch (EmailNotExistInDbException e) {
			return profileDao.saveProfile(p);
		}
        System.out.println(" about to do save second save form service layer");
		p1 = profileDao.saveProfile(p);
		System.out.println("saved second save form service layer");
		profileDao.saveProfile(p);
		
		//JobSeekerProfile p1 = profile
		return p1;
	}
	
	public List<JobSeekerProfile> getJobSeekerProfileByGivenRequirements(String jobTitle, String jobType, String jobField,
			String experience, String degree) {
		
		List<JobSeekerProfile> profiles = profileDao.getJobSeekerProfileByGivenRequirements(jobTitle, jobType, jobField, experience, degree);
		
		return profiles;
	}

	public List<String> getAllDegreeTypes() {
		String[] array = {"Masters","Bachelors","ph.d"};
		
		return Arrays.asList(array);
	}
}
