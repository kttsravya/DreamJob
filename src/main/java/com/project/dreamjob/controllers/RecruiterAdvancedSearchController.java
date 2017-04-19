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
import com.project.dreamjob.domain.JobSeekerDocument;
import com.project.dreamjob.domain.JobSeekerInfo;
import com.project.dreamjob.domain.JobSeekerProfile;
import com.project.dreamjob.domain.JobSeekerSignUp;
import com.project.dreamjob.exceptions.EmailNotExistInDbException;
import com.project.dreamjob.exceptions.GivenJobSeekerIdNotExistInDbException;
import com.project.dreamjob.exceptions.InvalidZipCodeException;
import com.project.dreamjob.exceptions.ZipCodeInvalidException;
import com.project.dreamjob.services.JobSeekerDocumentService;
import com.project.dreamjob.services.JobSeekerProfileService;
import com.project.dreamjob.services.JobSeekerSignUpService;

@Controller
public class RecruiterAdvancedSearchController {

	@Autowired
	JobSeekerProfileService profile;

	@Autowired
	LocationClient locationClient;

	@Autowired
	JobSeekerSignUpService signupService;

	@Autowired
	JobSeekerDocumentService docService;

	@Autowired
	SurroundZipCodes surround;

	// @Autowired
	JobSeekerInfo info;

	HashSet<String> zipSet = new HashSet<String>();

	@RequestMapping("/AdvancedSearchResults")
	public String getRecruiterAdvancedSearchResults(HttpServletRequest req, Model model) throws InvalidZipCodeException, ZipCodeInvalidException, EmailNotExistInDbException, GivenJobSeekerIdNotExistInDbException {
		String jobTitle = req.getParameter("jobTitle");
		System.out.println("job title is " +jobTitle);
		String jobType = req.getParameter("jobType");
		System.out.println("job type is " +jobType);
		String jobField = req.getParameter("jobField");
		System.out.println("job field is " +jobField);
		String experience = req.getParameter("experience");
		System.out.println("experience is " +experience);
		String degree = req.getParameter("degree");
		System.out.println("degree is " +degree);
		String zip = req.getParameter("zip");
		System.out.println("zip is " +zip);
		String radius = req.getParameter("radius");
		System.out.println("radius is " +radius);

		// step 1: get all jobSeekerProfiles who match jobTitle, jobType,
		// jobField, experience, degree
		List<JobSeekerProfile> profiles = profile.getJobSeekerProfileByGivenRequirements(jobTitle, jobType, jobField,
				experience, degree);
		
		 //throws NumberFormatException if zip cant be converted to int
		 int zipInt = Integer.parseInt(zip);
		 int radiusInt = Integer.parseInt(radius);
		 
	

		// step 2: get all zip codes when zip code and radius is given as input
		locationClient.listAllUsers(zip, radius);
		surround = locationClient.codes;
		
		if(surround == null){
			throw new InvalidZipCodeException();
		}
		
		List<SurroundZipCode> list = surround.getZip_codes();

		// stpe 3: create hash set and add all zips to hash set
		Iterator<SurroundZipCode> it = list.iterator();
		while (it.hasNext()) {
			SurroundZipCode code = it.next();
			System.out.println(code.getZip_code());
			zipSet.add(code.getZip_code());
		}

		// step 4: iterate through the all profile (result of step 1) and check
		// the zip code in profile is present in zipset
		// (which is result of step 3), if present put it in the newly created
		// list (finalList) if not present ignore it..
		List<JobSeekerProfile> finalList = new ArrayList<JobSeekerProfile>();
		Iterator<JobSeekerProfile> iterator = profiles.iterator();
		while (iterator.hasNext()) {
			JobSeekerProfile p = iterator.next();
			String email = p.getEmail();
			JobSeekerSignUp signUp = signupService.getJobSeekerSignUpInfo(email);
			int jobseekerZip = signUp.getZip();
			String jobZip = String.valueOf(jobseekerZip);
			if (zipSet.contains(jobZip)) {
				finalList.add(p);
			}

		}

		// step 5: create a model class(called JobSeekerInfo) that has these
		// three objects jobSeekerProfile, jobSeekerSignUpObject,
		// jobSeekerDocument and corresping getters and setters .
		// create list of objects of jobSeekerInfo class.

		List<JobSeekerInfo> jobSeekerInfoList = new ArrayList<JobSeekerInfo>();

		// stpe 6: iterate through the final list (which is list of
		// jobSeekerProfile) get jobSeekerSignUpObject and
		// jobSeekerDocument Object correspinding to jobSeekerProfile
		// and create a new list called jobSeekerInfo list.

		Iterator<JobSeekerProfile> finalListIterator = finalList.iterator();
		while (finalListIterator.hasNext()) {
			JobSeekerProfile pro = finalListIterator.next();
			System.out.println("from final list iterator" +pro.getEmail());

			JobSeekerSignUp signUp = signupService.getJobSeekerSignUpInfo(pro.getEmail());
			System.out.println("from final list iterator" +signUp.getCity());

			List<JobSeekerDocument> doc = docService.findAllByJobSeekerId(signUp.getJobSeekerId());
			System.out.println(doc.get(0).getDescription());

			info = new JobSeekerInfo();

			info.setProfile(pro);
			info.setSignUp(signUp);
			info.setDoc(doc.get(0));

			System.out.println("info doc object " + info.getDoc().getDescription());
			System.out.println("info sing up " + info.getSignUp().getCity());
			System.out.println("info profile object " + info.getProfile().getEmail());

			jobSeekerInfoList.add(info);

		}

		// stpe 7: send that to recruiterAdvancedSearchResults page

		model.addAttribute("jobSeekerInfoList", jobSeekerInfoList);

		// step 8: in recruiterAdvancedSearchResult page iterate through the all
		// elements in the list and create links for
		// email and resume . step 91: in the email link call the correct
		// controller and give emailholder name
		// to the controller, it sends preconfigured email to them step 92: in
		// the resume link give resume holder email id
		// to the resume it should download that resume when click on that link

		// model.addAttribute("profilesList", finalList);

		return "recruiterAdvancedSearchResults";
	}

}
