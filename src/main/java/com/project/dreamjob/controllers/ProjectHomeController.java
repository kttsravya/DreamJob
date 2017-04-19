package com.project.dreamjob.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class ProjectHomeController {
    // this shows project home page
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String viewHomePage() {
		//return "homePage";
		return "mainhomepage";
	}
	
	@RequestMapping("/aboutus")
	public String getAboutUsPage(){
		return "AboutUs";
	}
	
	@RequestMapping("/mainhomepage")
	public String getHomePage(){
		return "mainhomepage";
	}
}
