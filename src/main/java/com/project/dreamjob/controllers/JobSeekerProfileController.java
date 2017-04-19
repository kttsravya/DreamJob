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

import com.project.dreamjob.domain.JobSeekerProfile;
import com.project.dreamjob.domain.Skill;
import com.project.dreamjob.services.JobPostingService;
import com.project.dreamjob.services.JobSeekerProfileService;

@Controller
public class JobSeekerProfileController {

	@Autowired
	JobSeekerProfileService service;

	@Autowired
	JobPostingService postingService;

	// theses are global model objects, can access from any views returned from
	// this class without explicitly sending to the view using
	// model.addAttribute() method

	@ModelAttribute("allJobTypes")
	public List<String> getAllJobTypes() {
		return postingService.getAllJobTypes();
	}

	@ModelAttribute("allDegreeTypes")
	public List<String> getAllDegreeTypes() {
		return service.getAllDegreeTypes();
	}

	@ModelAttribute("allFieldOfStudy")
	public List<String> getAllFieldsOfStudy() {
		return postingService.getAllJobFields();
	}

	@ModelAttribute("allJobTitles")
	public List<String> getAllJobTitles() {
		return postingService.getAllJobTitles();
	}

	@ModelAttribute("allExperiences")
	public List<String> getAllExperiences() {
		return postingService.getAllSeneriotyLevels();
	}

	// returns job seeker menu page
	@RequestMapping(value = "/getJobSeekerMenuPage", method = RequestMethod.GET)
	public String getJobSeekerMenuPage() {
		return "jobSeekerMenuPage";
	}

	// returns jobSeekerProfileForm
	@RequestMapping(value = "/getJobSeekerProfileForm", method = RequestMethod.GET)
	public String getJobSeekerProfileForm(HttpServletRequest req, Model model) {
		String email = req.getParameter("email");
		JobSeekerProfile profile = new JobSeekerProfile();
		profile.setEmail(email);
		model.addAttribute("jobSeekerProfile", profile);
		return "jobSeekerProfileForm";
	}

	// get all the submitted data form form and save job seeker profile
	// information in db
	@RequestMapping(value = "/submitJobSeekerProfileForm")
	public String submitJobSeekerProfileForm(HttpServletRequest req, Model model) {

		JobSeekerProfile p = new JobSeekerProfile();

		String email = req.getParameter("email");
		System.out.println("from controller " +email);
		String degree = req.getParameter("degree");
		System.out.println(degree);
		String experience = req.getParameter("experience");
		System.out.println(experience);
		String fieldOfStudy = req.getParameter("fieldOfStudy");
		System.out.println(fieldOfStudy);
		String jobTitle = req.getParameter("jobTitle");
		System.out.println(jobTitle);
		String jobType = req.getParameter("jobType");
		System.out.println(jobType);
		String skills = req.getParameter("skills");
		System.out.println(skills);

		String[] stringArray = skills.split(",");
		List<Skill> list = new ArrayList<Skill>();
		for (int i = 0; i < stringArray.length; i++) {
			Skill skill1 = new Skill();
			skill1.setSkill(stringArray[i]);
			list.add(skill1);
		}

		p.setEmail(email);
		p.setDegree(degree);
		p.setExperience(experience);
		p.setFieldOfStudy(fieldOfStudy);
		p.setJobTitle(jobTitle);
		p.setJobType(jobType);
		p.setSkills(list);

		service.saveJobSeekerProfile(p);

		model.addAttribute("jobSeekerProfile", p);

		// profile conformation page is also used as step 2 for profile filling
		// form
		return "profileConformationPage";

	}

}
