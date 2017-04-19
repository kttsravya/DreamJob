package com.project.dreamjob.restcontrollers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.project.dreamjob.exceptions.DbEmptyException;
import com.project.dreamjob.exceptions.EmailAlreadyExistInDbException;
import com.project.dreamjob.exceptions.EmailNotExistInDbException;
import com.project.dreamjob.exceptions.GivenJobSeekerIdNotExistInDbException;
import com.project.dreamjob.exceptions.InvalidZipCodeException;
import com.project.dreamjob.exceptions.JobPostingWithJobIdNotExistException;
import com.project.dreamjob.exceptions.RecruiterIdDosentExistInDbException;
import com.project.dreamjob.exceptions.RecruiterNotInSignUpListException;
import com.project.dreamjob.exceptions.ZipCodeInvalidException;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value={EmailNotExistInDbException.class, EmailAlreadyExistInDbException.class,
			DbEmptyException.class, GivenJobSeekerIdNotExistInDbException.class,InvalidZipCodeException.class,
			JobPostingWithJobIdNotExistException.class, RecruiterIdDosentExistInDbException.class,
			RecruiterNotInSignUpListException.class, ZipCodeInvalidException.class})
	  public ModelAndView myError(Exception exception) {
	    System.out.println("----Caught EmailNotExistInDbException----");
	    ModelAndView mav = new ModelAndView();
	    mav.addObject("exception", exception);
	    mav.setViewName("globalerror");
	    return mav;
	  }
}
