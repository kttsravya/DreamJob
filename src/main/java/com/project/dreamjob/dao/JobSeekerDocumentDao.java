package com.project.dreamjob.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.project.dreamjob.domain.JobSeekerDocument;
import com.project.dreamjob.domain.JobSeekerSignUp;
import com.project.dreamjob.exceptions.GivenJobSeekerIdNotExistInDbException;

@Repository(value="jobSeekerDocumentDao")
@EnableTransactionManagement
@Transactional(readOnly = false)
public class JobSeekerDocumentDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	JobSeekerSignUpDao dao;
	
	public List<JobSeekerDocument> getAllDocuments(){
		Session session= sessionFactory.getCurrentSession();
		Query<JobSeekerDocument> query = session.createQuery("from JobSeekerDocument");
		List<JobSeekerDocument> list = query.getResultList();
		return list;
		
	}
	
	public JobSeekerDocument saveDocument(JobSeekerDocument doc){
		Session session =sessionFactory.getCurrentSession();
		session.save(doc);
		return doc;
	}
	
	public JobSeekerDocument findById(int documentId){
		Session session = sessionFactory.getCurrentSession();
		return session.get(JobSeekerDocument.class, documentId);
	}
	
	// check working or not following method
	
	public List<JobSeekerDocument> findAllByJobSeekerId(int jobSeekerId) throws GivenJobSeekerIdNotExistInDbException{
		Session session = sessionFactory.getCurrentSession();
		JobSeekerSignUp seeker = dao.getJobSeekerSignUpInfoByjobSeekerId(jobSeekerId);
		Query<JobSeekerDocument> query = session.createQuery("from JobSeekerDocument where jobSeekerSignUp = :id ");
		query.setParameter("id", seeker);
		List<JobSeekerDocument> list = query.getResultList();
		return list;
	}
	
	public JobSeekerDocument deleteByDocumentId(int documentId){
		System.out.println("in delete by documentid method start point");
		Session session = sessionFactory.getCurrentSession();
		JobSeekerDocument doc = findById(documentId);
		if(doc != null){
			System.out.println("if condition entered");
			Query<JobSeekerDocument> query = session.createQuery("delete from JobSeekerDocument where documentId = :id");
			query.setParameter("id", documentId);
			int result = query.executeUpdate();
			System.out.println("if condition ended");
		}
		System.out.println("end point : deleted with document" +documentId);
	
		return doc;
	}

}
