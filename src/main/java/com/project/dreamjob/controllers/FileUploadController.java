package com.project.dreamjob.controllers;

import java.io.IOException;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.project.dreamjob.customAnnotatedValidators.FileValidator;
import com.project.dreamjob.domain.JobSeekerDocument;
import com.project.dreamjob.domain.JobSeekerSignUp;
import com.project.dreamjob.exceptions.EmailNotExistInDbException;
import com.project.dreamjob.exceptions.GivenJobSeekerIdNotExistInDbException;
import com.project.dreamjob.model.FileBucket;
import com.project.dreamjob.services.JobSeekerDocumentService;
import com.project.dreamjob.services.JobSeekerSignUpService;

@Controller
public class FileUploadController {

	String email;

	@Autowired
	FileValidator fileValidator;

	@Autowired
	JobSeekerDocumentService document;

	@Autowired
	JobSeekerSignUpService signUp;

	@InitBinder("fileBucket")
	protected void initBinderFileBucket(WebDataBinder binder) {
		binder.setValidator(fileValidator);
	}

	// this method returns upload view page
	@RequestMapping(value = "/singleUpload", method = RequestMethod.GET)
	public String getSingleUploadPage(HttpServletRequest req, ModelMap model) {

		// get email address form request parameter, this will be usefull to
		// know which user uploaded file
		// when saving file in db(singleFileUpload method)

		String email1 = req.getParameter("email");
		email = email1;

		FileBucket fileModel = new FileBucket();
		model.addAttribute("fileBucket", fileModel);
		return "singleFileUploader";
	}

	// this method saves uploaded file into database and returns success page
	@RequestMapping(value = "/singleUpload", method = RequestMethod.POST)
	public String singleFileUpload(@Valid FileBucket fileBucket, BindingResult result, ModelMap model)
			throws IOException, EmailNotExistInDbException, GivenJobSeekerIdNotExistInDbException {

		// validating the model object filebucket, if no errors, fetch data from
		// filebucket and save it in db.
		if (result.hasErrors()) {
			System.out.println("validation errors");
			return "singleFileUploader";
		} else {

			System.out.println("Fetching file");
			MultipartFile multipartFile = fileBucket.getFile();

			String fileName = multipartFile.getOriginalFilename();

			JobSeekerDocument jsdoc = new JobSeekerDocument();

			JobSeekerSignUp signU = signUp.getJobSeekerSignUpInfo(email);

			byte[] byteStream = fileBucket.getFile().getBytes();

			jsdoc.setContent(byteStream);
			jsdoc.setName(fileName);
			jsdoc.setDescription("resumeUpload");
			jsdoc.setType(multipartFile.getContentType());
			jsdoc.setJobSeekerSignUp(signU);

			// saving document in db
			document.save(jsdoc);

			model.addAttribute("fileName", fileName);
			return "successFileUploadedPage";
		}
	}

	// @RequestMapping("/getDocumentContent")
	// public void getDocumentFromDatabaseUsingDocumentId(ModelMap model) {
	// JobSeekerDocument doc = document.findById(6);
	// byte[] by = doc.getContent();
	// String str = new String(by);
	// System.out.println("sring is " + str);
	//
	// }

	// returns download page view
	@RequestMapping(value = "/getDownloadPage")
	public String getDownloadPage() {
		return "downloadPage";
	}

	// fetch the document form db and downloads into your system
	@RequestMapping(value = "/download.do", method = RequestMethod.GET)
	public void doDownload(HttpServletRequest req, HttpServletResponse res) throws GivenJobSeekerIdNotExistInDbException {

		String id = req.getParameter("jobSeekerId");
		int jobSeekerId = Integer.parseInt(id);
		List<JobSeekerDocument> documents = document.findAllByJobSeekerId(jobSeekerId);
		JobSeekerDocument doc = documents.get(0);

		byte[] byteStreamy = doc.getContent();
		res.setContentType(doc.getType());
		res.setHeader("content-Disposition", "attachment;filename=" + doc.getName());
		try {
			res.getOutputStream().write(byteStreamy);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
