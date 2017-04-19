package com.project.dreamjob.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmailController {
    
	// mailSender is instantiated by declaring bean in root-context.xml
	@Autowired
	private JavaMailSender mailSender;

	// this method returns email Form 
	@RequestMapping(value = "/email", method = RequestMethod.GET)
	public String getEmailForm(HttpServletRequest req, Model model) {
		String em = req.getParameter("emailId");
		model.addAttribute("emailId", em);

		return "EmailForm";
	}
	
    // this method send email and gives mail sent conformation page
	@RequestMapping(value = "/sendEmail.do", method = RequestMethod.POST)
	public String doSendEmail(HttpServletRequest request) {
		
		// step1: takes input from e-mail form
		String recipientAddress = request.getParameter("recipient");
		String subject = request.getParameter("subject");
		String message = request.getParameter("message");

		// prints debug info
		System.out.println("To: " + recipientAddress);
		System.out.println("Subject: " + subject);
		System.out.println("Message: " + message);

		// creates a simple e-mail object which is used as parameter for send method in mailSender Class
		SimpleMailMessage email = new SimpleMailMessage();
		email.setTo(recipientAddress);
		email.setSubject(subject);
		email.setText(message);

		// sends the e-mail
		mailSender.send(email);

		// forwards to the view named "Result"
		return "EmailResult";
	}

}
