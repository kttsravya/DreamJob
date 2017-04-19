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

import com.project.dreamjob.domain.RecruiterSignUp;
import com.project.dreamjob.exceptions.DbEmptyException;
import com.project.dreamjob.exceptions.EmailAlreadyExistInDbException;
import com.project.dreamjob.exceptions.EmailNotExistInDbException;
import com.project.dreamjob.exceptions.EmptyPasswordFieldException;
import com.project.dreamjob.services.RecruiterSignUpService;

@Controller
public class RecruiterSignUpController {

	@Autowired
	RecruiterSignUpService service;
	
	

	@RequestMapping(value = "/getRecruiterSignInFormForHomePage", method = RequestMethod.GET)
	public String getRecruiterSignInFormForHomePage() {
		return "recruiterSignInForm";
	}
	
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

	@RequestMapping(value = "/getRecruiterMenuPage", method = RequestMethod.GET)
	public String getRecruiterMenuPage() {
		return "recruiterMenuPage";
	}
	
	@RequestMapping(value = "/getRecruiterHomePage", method = RequestMethod.GET)
	public String getRecruiterHomePage() {
		return "RecruiterHomePage";
	}

	@RequestMapping(value = "/recruiterSignUpForm", method = RequestMethod.GET)
	public String getRecruiterSignUpPage(Model model) {
		RecruiterSignUp recruiter = new RecruiterSignUp();
		model.addAttribute("recruiterSignUp", recruiter);
		return "recruiterSignUpForm";
	}

	// submits the recruiter signup information if password and conformpassword
	// fields are same
	// and recruiter signup information is valid (we check validation using
	// validator classes and some annotations
	// on domain variables)
	@RequestMapping(value = "/recruiterSubmitForm", method = RequestMethod.POST)
	public String submitSignUpFormData(HttpServletRequest req,
			@Valid @ModelAttribute("recruiterSignUp") RecruiterSignUp recruiterSignUp, BindingResult result,
			Model model) throws EmailAlreadyExistInDbException, DbEmptyException, EmptyPasswordFieldException {
		
		System.out.println("city" +recruiterSignUp.getCity());
		System.out.println(recruiterSignUp.getContactNumber());
		System.out.println(recruiterSignUp.getCountry());
		System.out.println(recruiterSignUp.getEmail());
		System.out.println(recruiterSignUp.getName());
		System.out.println(recruiterSignUp.getPassword());
		System.out.println(recruiterSignUp.getState());
		System.out.println("zip " +recruiterSignUp.getZip());
		

		if (result.hasErrors()) {
			return "recruiterSignUpForm";
		}

		
		String password = recruiterSignUp.getPassword();
		String conformPassword = req.getParameter("ConformPassword");
		System.out.println("conformPassword is" +conformPassword);
		
//		if(conformPassword == null){
//			throw new EmptyConformPasswordFieldException();
//		}

		
		if (conformPassword.equals(password)) {
			service.saveRecruiterInfo(recruiterSignUp);
			return "recruiterSignInForm";
		}

		return "recruiterSignUpForm";
	}

	
	
	// signIn validation

	@RequestMapping(value = "/recruiterSignInValidation")
	public String validateRecruiterLogIn(HttpServletRequest req, Model model) throws EmailNotExistInDbException, DbEmptyException, EmptyPasswordFieldException {
		String emailAddress = req.getParameter("EmailAddress");
		
		//publicEmail = emailAddress;
//		
		
		RecruiterSignUp rec = service.getRecruiterInfoByEmail(emailAddress);
		// saved password in db
		String savedPassword = rec.getPassword();
		// new entered password to login
		String inPassword = req.getParameter("Password");
		String encryptedPassword = service.getHashCode(inPassword);
		
		if (encryptedPassword.equals(savedPassword)) {
			// added new line
			model.addAttribute("recSignUp",rec );
			//return "recruiterMenuPage";
			return "RecruiterHomePage";
		} else {
			return "recruiterSignInForm";

		}

	}

}
