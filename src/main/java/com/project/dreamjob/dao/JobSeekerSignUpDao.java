package com.project.dreamjob.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import com.project.dreamjob.domain.JobSeekerSignUp;
import com.project.dreamjob.exceptions.DbEmptyException;
import com.project.dreamjob.exceptions.EmailAlreadyExistInDbException;
import com.project.dreamjob.exceptions.EmailNotExistInDbException;
import com.project.dreamjob.exceptions.GivenJobSeekerIdNotExistInDbException;

@Repository(value = "jobSeekerSignUpDao")
@EnableTransactionManagement
@Transactional(readOnly = false)
public class JobSeekerSignUpDao {

	@Autowired
	SessionFactory sessionFactory;

	// create
	public JobSeekerSignUp saveJobSeekerSignUpInfo(JobSeekerSignUp signupInfo) throws EmailAlreadyExistInDbException {
		Session session = sessionFactory.getCurrentSession();
		
		List<JobSeekerSignUp> list;
		try {
			list = getAllJobSeekerSignUpRecords();
		} catch (DbEmptyException e) {
			session.saveOrUpdate(signupInfo);
			return signupInfo;
		}
		Iterator<JobSeekerSignUp> it = list.iterator();
		while(it.hasNext()){
			JobSeekerSignUp signUp = it.next();
			if(signUp.getEmail().equals(signupInfo.getEmail())){
				throw new EmailAlreadyExistInDbException(signupInfo.getEmail());
			}
		}
		session.saveOrUpdate(signupInfo);
		return signupInfo;
		
	
	}

	// read by emaiId
	public JobSeekerSignUp getJobSeekerSignUpInfoByEmailId(String emailId) throws EmailNotExistInDbException {
		Session session = sessionFactory.getCurrentSession();
		Query<JobSeekerSignUp> query = session.createQuery(" from JobSeekerSignUp where email= :email ");
		query.setParameter("email", emailId);
         
		List<JobSeekerSignUp> arrayList = query.getResultList();
		
		if(arrayList == null ||arrayList.size() <= 0){
			throw new EmailNotExistInDbException(emailId);
		}
		for (JobSeekerSignUp signUp : arrayList) {
			System.out.println(signUp.getEmail());
		}
		return arrayList.get(0);

	}

	// read by profileId
	public JobSeekerSignUp getJobSeekerSignUpInfoByjobSeekerId(int jobSeekerId) throws GivenJobSeekerIdNotExistInDbException {
		Session session = sessionFactory.getCurrentSession();
		JobSeekerSignUp signUp = session.get(JobSeekerSignUp.class, jobSeekerId);
		  if(signUp == null){
			 throw new GivenJobSeekerIdNotExistInDbException(jobSeekerId);
		  }
		return signUp;
	}

	// read all records from table
	public List<JobSeekerSignUp> getAllJobSeekerSignUpRecords() throws DbEmptyException {
		Session session = sessionFactory.getCurrentSession();
		Query<JobSeekerSignUp> query = session.createQuery("from JobSeekerSignUp");
		List<JobSeekerSignUp> arrayList = query.getResultList();
		if(arrayList == null || arrayList.size() <= 0){
			throw new DbEmptyException();
		}
		return arrayList;
	}
  
	// not performing any exception checks for remove method , because not using these methods in our application
	public JobSeekerSignUp removeJobSeekerSignUpInfoByEmailId(String emailId) throws EmailNotExistInDbException {
		Session session = sessionFactory.getCurrentSession();
		JobSeekerSignUp obj = getJobSeekerSignUpInfoByEmailId(emailId);
		if (obj != null) {
			Query<JobSeekerSignUp> query = session.createQuery("delete JobSeekerSignUp where email = :email");
			query.setParameter("email", emailId);
			int result = query.executeUpdate();
		}
		return obj;

	}

	public JobSeekerSignUp removeJobSeekerSignUpInfoByjobSeekerId(int jobSeekerId) throws GivenJobSeekerIdNotExistInDbException {
		Session session = sessionFactory.getCurrentSession();
		JobSeekerSignUp obj = getJobSeekerSignUpInfoByjobSeekerId(jobSeekerId);
		if (obj != null) {
			Query<JobSeekerSignUp> query = session.createQuery("delete JobSeekerSignUp where jobSeekerId = :id");
			query.setParameter("id", jobSeekerId);
			int result = query.executeUpdate();
		}
		return obj;
	}

	public List<JobSeekerSignUp> removeAllJobSeekerSignUpRecords() throws DbEmptyException {
		Session session = sessionFactory.getCurrentSession();
		List<JobSeekerSignUp> list = getAllJobSeekerSignUpRecords();
		if (list != null) {
			Query<JobSeekerSignUp> query = session.createQuery("delete from JobSeekerSignUp ");
			int result = query.executeUpdate();
		}

		return list;
	}

}
