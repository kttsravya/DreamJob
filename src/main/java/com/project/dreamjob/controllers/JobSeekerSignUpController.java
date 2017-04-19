package com.project.dreamjob.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import com.project.dreamjob.domain.JobSeekerSignUp;
import com.project.dreamjob.domain.RecruiterSignUp;
import com.project.dreamjob.exceptions.DbEmptyException;
import com.project.dreamjob.exceptions.EmailAlreadyExistInDbException;
import com.project.dreamjob.exceptions.EmailNotExistInDbException;
import com.project.dreamjob.services.JobSeekerSignUpService;

@Controller
public class JobSeekerSignUpController {

	@Autowired
	JobSeekerSignUpService service;

	@ModelAttribute("cities")
	public List<String> getAllCities(){
		return service.getAllCities();
	}
	
	@ModelAttribute("states")
	public List<String> getAllStates() {
		return service.getAllStates();
	}

	@ModelAttribute("countries")
	public List<String> getAllCountries() {
		return service.getAllCountries();
	}

	@RequestMapping(value = "/jobSeekerSignUpForm", method = RequestMethod.GET)
	public String getJobSeekerSignUpPage(Model model) {
		JobSeekerSignUp jobSeekerSignUpObj = new JobSeekerSignUp();
		model.addAttribute("jobSeekerSignUp", jobSeekerSignUpObj);
		return "jobSeekerSignUpForm";
	}

	@RequestMapping("/getJobSeekerSignInFormForHomePage")
	public String getJobSeekerSignInForm() {
		return "jobSeekerSignInForm";
	}
	
	@RequestMapping("/getJobSeekerHomePage")
	public String getJobSeekerHomePage() {
		return "JobSeekerHomePage";
	}

	// @ModelAttribute("jobSeekerSignUp") JobSeekerSignUp signUp contains all
	// the signup information filled in the
	// signup form.

	// this information is only saved in db only if password equals to conform
	// password

	@RequestMapping(value = "/jobSeekerSubmitForm")
	public String submitJobSeekerSignUpForm(HttpServletRequest req,
			@Valid @ModelAttribute("jobSeekerSignUp") JobSeekerSignUp jobSeekerSignUp, BindingResult result, Model model) throws DbEmptyException, EmailAlreadyExistInDbException {

		if (result.hasErrors()) {
			return "jobSeekerSignUpForm";
		}
		
		String password = jobSeekerSignUp.getPassword();
		String conformPassword = req.getParameter("ConformPassword");
		System.out.println("Password is" + password);
		System.out.println("conformPassword is" + conformPassword);

		if (password.equals(conformPassword)) {
			service.saveJobSeekerSignUpInfo(jobSeekerSignUp);
			return "jobSeekerSignInForm";
		}
		return "jobSeekerSignUpForm";
	}

	// this method is used for login validation

	// if user try to login whithout having account with dream job it throws
	// emailNotExistInDbException
	@RequestMapping("/validateJobSeekerSignInDetails")
	public String jobSeekerLoginValidation(HttpServletRequest req, Model model) throws EmailNotExistInDbException {

		String emailAddress = req.getParameter("EmailAddress");

		JobSeekerSignUp rec = service.getJobSeekerSignUpInfo(emailAddress);

		// saved password in db
		String savedPassword = rec.getPassword();

		// newly entered password to login
		String inPassword = req.getParameter("Password");

		// encrypt the newly entered password using same global salt and
		// compare with saved password in db
		// if the matches give the requested page by the user else dont..
		String encryptedPassword = service.getHashCode(inPassword);

		if (encryptedPassword.equals(savedPassword)) {
			model.addAttribute("jobSeekerSignUpObject", rec);
			//return "jobSeekerMenuPage";
			return "JobSeekerHomePage";
		} else {
			return "jobSeekerSignInForm";

		}

	}

}
