package com.project.dreamjob.services;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.project.dreamjob.dao.JobSeekerDocumentDao;
import com.project.dreamjob.domain.JobSeekerDocument;
import com.project.dreamjob.exceptions.GivenJobSeekerIdNotExistInDbException;

@Service("jobSeekerDocumentService")
@EnableTransactionManagement
@Transactional
public class JobSeekerDocumentService {
	
	@Autowired
	JobSeekerDocumentDao dao;
	
	public JobSeekerDocument findById(int documentId){
		return dao.findById(documentId);
	}
	
	public List<JobSeekerDocument> findAll(){
		return dao.getAllDocuments();
	}
	
	public List<JobSeekerDocument> findAllByJobSeekerId(int jobSeekerId) throws GivenJobSeekerIdNotExistInDbException{
		return dao.findAllByJobSeekerId(jobSeekerId);
	}
	
	public JobSeekerDocument save(JobSeekerDocument doc) throws GivenJobSeekerIdNotExistInDbException{
		int id = doc.getJobSeekerId();
		List<JobSeekerDocument> list =  dao.findAllByJobSeekerId(id);
		Iterator<JobSeekerDocument> it = list.iterator();
		while(it.hasNext()){
			System.out.println("in loop");
			JobSeekerDocument doc1 = it.next();
			dao.deleteByDocumentId(doc1.getDocumentId());
		}
		return dao.saveDocument(doc);
		//return dao.deleteByDocumentId(2);
	}
	
	public JobSeekerDocument deleteByDocumentId(int docId){
		return dao.deleteByDocumentId(docId);
	}
	
	
  
}
