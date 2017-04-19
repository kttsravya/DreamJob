package com.project.dreamjob.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.dreamjob.domain.JobPosting;

import com.project.dreamjob.domain.Technology;
import com.project.dreamjob.exceptions.DbEmptyException;
import com.project.dreamjob.exceptions.RecruiterNotInSignUpListException;
import com.project.dreamjob.services.JobPostingService;
import com.project.dreamjob.services.RecruiterSignUpService;

@Controller
public class JobPostingController {

	@Autowired
	JobPostingService service;

	@Autowired
	RecruiterSignUpService recservice;

	@ModelAttribute("companies")
	public List<String> getAllCompanies() {
		return recservice.getAllCompanies();
	}

	@ModelAttribute("cities")
	public List<String> getAllCities() {
		return recservice.getAllCities();
	}

	@ModelAttribute("states")
	public List<String> getAllStates() {
		return recservice.getAllStates();
	}

	@ModelAttribute("countries")
	public List<String> getAllCountries() {
		return recservice.getAllCountries();
	}

	@ModelAttribute("jobtypes")
	public List<String> getAllJobTypes() {
		return service.getAllJobTypes();
	}

	@ModelAttribute("jobtitles")
	public List<String> getAllJobTitles() {
		return service.getAllJobTitles();
	}

	@ModelAttribute("jobFields")
	public List<String> getAllJobFields() {
		return service.getAllJobFields();
	}

	@ModelAttribute("seniorityLevel")
	public List<String> getSeneriotyLevels() {
		return service.getAllSeneriotyLevels();
	}

	@RequestMapping(value = "/getJobPostingForm", method = RequestMethod.GET)
	public String getJobPostingForm(HttpServletRequest req, Model model) {
		System.out.println("from get Job Posting method " +req.getParameter("city"));
		System.out.println("from get Job Posting method " +req.getParameter("companyName"));
		System.out.println("from get Job Posting method " +req.getParameter("country"));
		System.out.println("from get Job Posting method " +req.getParameter("employmentType"));
		System.out.println("from get Job Posting method " +req.getParameter("jobField"));
		System.out.println("from get Job Posting method " +req.getParameter("jobtitle"));
		System.out.println("from get Job Posting method " +req.getParameter("recruiterEmail"));
		System.out.println("from get Job Posting method " +req.getParameter("seniorityLevel"));
		System.out.println("from get Job Posting method " +req.getParameter("state"));
		System.out.println("from get Job Posting method " +req.getParameter("zip"));
		
		if(req.getParameter("city")!= null && req.getParameter("companyName") != null &&
				req.getParameter("country") !=null && req.getParameter("employmentType")!= null && 
				req.getParameter("jobField") != null && req.getParameter("jobtitle") != null && 
				req.getParameter("recruiterEmail") != null && req.getParameter("seniorityLevel") != null && 
				req.getParameter("state")!=null && req.getParameter("zip") != null ){
			JobPosting posting = new JobPosting();
			posting.setCity(req.getParameter("city"));
			posting.setCompanyName(req.getParameter("companyName"));
			posting.setCountry(req.getParameter("country"));
			posting.setEmploymentType(req.getParameter("employmentType"));
			posting.setJobField(req.getParameter("jobField"));
			posting.setJobtitle(req.getParameter("jobtitle"));
			posting.setRecruiterEmail(req.getParameter("recruiterEmail"));
			posting.setSeniorityLevel(req.getParameter("seniorityLevel"));
			posting.setState(req.getParameter("state"));
			posting.setZip(Integer.parseInt(req.getParameter("zip")));
			
			String technologies = req.getParameter("technologies");
			
			String[] stringArray = technologies.split(",");
			List<Technology> list = new ArrayList<Technology>();
			for (int i = 0; i < stringArray.length; i++) {
				Technology tech1 = new Technology();
				tech1.setTechnology(stringArray[i].trim());
				list.add(tech1);
			}
			
			posting.setTechnologies(list);
			
			model.addAttribute("postingObject",posting);
			return "PostAJobPage";
		}
		
		String email = req.getParameter("recemail");
		System.out.println("email in job posting from signin validation " +email);
		JobPosting posting = new JobPosting();
		posting.setRecruiterEmail(email);
		model.addAttribute("postingObject", posting);
		return "PostAJobPage";
	}

	@RequestMapping(value = "/getRecruiterMenuPage")
	public String getRecruiterMenuPage(Model model) {
		return "recruiterMenuPage";
	}
	
	@RequestMapping(value = "/SucessfullyJobPosted")
	public String getSuccessfullyJobPostedPage() {
		return "SuccesfullyPostedJob";
	}
	
	@RequestMapping(value="/getJobPostingConformationPage")
	public String getJobPostingConformationPate(HttpServletRequest req, Model model){
		JobPosting post = new JobPosting();
		
		String email = req.getParameter("recruiterEmail");
		System.out.println(email);

		String city = req.getParameter("city");
		System.out.println(city);

		String companyName = req.getParameter("companyName");
		System.out.println(companyName);

		String country = req.getParameter("country");
		System.out.println(country);

		String employmentType = req.getParameter("employmentType");
		System.out.println(employmentType);

		String jobField = req.getParameter("jobField");
		System.out.println(jobField);

		String jobTitle = req.getParameter("jobtitle");
		System.out.println(jobTitle);

		String seniorityLevel = req.getParameter("seniorityLevel");
		System.out.println(seniorityLevel);

		String state = req.getParameter("state");
		System.out.println(state);

		String technologies = req.getParameter("technologies");
		System.out.println(technologies);

		int zip = Integer.parseInt(req.getParameter("zip"));
		System.out.println(zip);

		String[] stringArray = technologies.split(",");
		List<Technology> list = new ArrayList<Technology>();
		for (int i = 0; i < stringArray.length; i++) {
			Technology tech1 = new Technology();
			tech1.setTechnology(stringArray[i]);
			list.add(tech1);
		}

		post.setRecruiterEmail(email);
		post.setCity(city);
		post.setCompanyName(companyName);
		post.setCountry(country);
		post.setEmploymentType(employmentType);
		post.setJobField(jobField);
		post.setJobtitle(jobTitle);
		post.setTechnologies(list);
		post.setSeniorityLevel(seniorityLevel);
		post.setState(state);
		post.setZip(zip);
		
		model.addAttribute("jobPosted", post);
		return "jobPostingConformationPage";
	}
	

	@RequestMapping(value = "/submitJobPostingForm")
	public String submitJobPostingForm(HttpServletRequest req, Model model)
			throws DbEmptyException, RecruiterNotInSignUpListException {

		JobPosting post = new JobPosting();

		String email = req.getParameter("recruiterEmail");
		System.out.println("rec email from submit job posting " +email);

		String city = req.getParameter("city");
		System.out.println(city);

		String companyName = req.getParameter("companyName");
		System.out.println(companyName);

		String country = req.getParameter("country");
		System.out.println(country);

		String employmentType = req.getParameter("employmentType");
		System.out.println(employmentType);

		String jobField = req.getParameter("jobField");
		System.out.println(jobField);

		String jobTitle = req.getParameter("jobtitle");
		System.out.println(jobTitle);

		String seniorityLevel = req.getParameter("seniorityLevel");
		System.out.println(seniorityLevel);

		String state = req.getParameter("state");
		System.out.println(state);

		String technologies = req.getParameter("technologies");
		System.out.println(technologies);

		int zip = Integer.parseInt(req.getParameter("zip"));
		System.out.println(zip);

		String[] stringArray = technologies.split(",");
		List<Technology> list = new ArrayList<Technology>();
		for (int i = 0; i < stringArray.length; i++) {
			Technology tech1 = new Technology();
			String str = stringArray[i];
			//System.out.println("string" +str.trim()+"string");
			
			tech1.setTechnology(str.trim());
			//System.out.println("i is " + i +str);
			list.add(tech1);
		}

		post.setRecruiterEmail(email);
		post.setCity(city);
		post.setCompanyName(companyName);
		post.setCountry(country);
		post.setEmploymentType(employmentType);
		post.setJobField(jobField);
		post.setJobtitle(jobTitle);
		post.setTechnologies(list);
		post.setSeniorityLevel(seniorityLevel);
		post.setState(state);
		post.setZip(zip);

		JobPosting p = service.saveJobPosting(post);
		//System.out.println("job posting id is " + p.getJobId());

		model.addAttribute("jobPosted", post);
		

		return "SuccesfullyPostedJob";
	}

}
