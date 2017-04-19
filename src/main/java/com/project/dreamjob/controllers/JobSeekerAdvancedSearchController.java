package com.project.dreamjob.controllers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.dreamjob.RestClients.LocationClient;
import com.project.dreamjob.RestClients.SurroundZipCode;
import com.project.dreamjob.RestClients.SurroundZipCodes;
import com.project.dreamjob.domain.JobPosting;
import com.project.dreamjob.exceptions.ZipCodeInvalidException;
import com.project.dreamjob.services.JobPostingService;

@Controller
public class JobSeekerAdvancedSearchController {

	@Autowired
	JobPostingService service;

	@Autowired
	LocationClient locationClient;

	@Autowired
	SurroundZipCodes surround;

	@Autowired
	JobPostingService postService;

	@RequestMapping("/getResultsForJobSeekerAdvancedSearch")
	public String getResultsForJobSeekerAdvancedSearch(HttpServletRequest req, Model model) throws ZipCodeInvalidException {

		String jobType = req.getParameter("jobType");
		String fieldOfStudy = req.getParameter("FieldOfStudy");
		String jobTitle = req.getParameter("jobTitle");
		String experience = req.getParameter("experience");
		String zip = req.getParameter("zip");
		String radius = req.getParameter("radius");

		// getting list of job postings that met job seeker search requirement
		// for jobType, fieldOfstudy, jobTitle
		// experience
		List<JobPosting> list = service.getJobPostingListByRequirements(jobType, fieldOfStudy, jobTitle, experience);
		
		//throws NumberFormatException if zip cant be converted to int
		try{
			 int zipInt = Integer.parseInt(zip);
		}catch(NumberFormatException ex){
			throw new NumberFormatException("please enter number for zip value");
		}
		
		try{
			int radiusInt = Integer.parseInt(radius);
		}catch(NumberFormatException ex){
			throw new NumberFormatException("please enter number for radius value");
		}
		

		List<JobPosting> finalList = new ArrayList<JobPosting>();

		// calling rest client method that calls zip api
		locationClient.listAllUsers(zip, radius);

		// getting zip codes from rest client api method
		surround = locationClient.codes;
		
		

		// add fetched zip codes to hashset
		Iterator<SurroundZipCode> it1 = (surround.getZip_codes()).iterator();
		HashSet<String> zipSet = new HashSet<String>();
		while (it1.hasNext()) {
			zipSet.add(it1.next().getZip_code());
		}

		Iterator<JobPosting> listIt = list.iterator();

		// iterate through the listIt elements and put the elements in finalList
		// that also matches zip and radius
		// search criteria of job seekers
		while (listIt.hasNext()) {
			JobPosting p = listIt.next();

			int zipCode = p.getZip();
			String zip1 = String.valueOf(zipCode);

			if (zipSet.contains(zip1)) {
				finalList.add(p);
			}
		}
		
		Iterator<JobPosting> finalListIt = finalList.iterator();
		while(finalListIt.hasNext()){
			System.out.println("final list recruiter emails" +finalListIt.next().getRecruiterEmail());
		}

		// send final list to view
		model.addAttribute("list", finalList);

		return "jobSeekerAdvancedSearchResults";
	}

}
