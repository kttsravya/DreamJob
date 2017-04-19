package com.project.dreamjob.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.project.dreamjob.domain.JobPosting;
import com.project.dreamjob.domain.JobSeekerProfile;
import com.project.dreamjob.domain.RecruiterSignUp;
import com.project.dreamjob.exceptions.DbEmptyException;
import com.project.dreamjob.exceptions.JobPostingWithJobIdNotExistException;
import com.project.dreamjob.exceptions.RecruiterNotInSignUpListException;

@Repository(value = "jobPostingDao")
@EnableTransactionManagement
@Transactional(readOnly = false)
public class JobPostingDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	RecruiterSignUpDao signUpDao;

	public JobPosting saveJobPosting(JobPosting job) throws DbEmptyException, RecruiterNotInSignUpListException {
		
		List<RecruiterSignUp> list = signUpDao.getAllRecruiterSignUpInfo();
		Iterator<RecruiterSignUp> iterator = list.iterator();
		while(iterator.hasNext()){
			RecruiterSignUp signUp = iterator.next();
			String email = signUp.getEmail();
			
			if(email.equals(job.getRecruiterEmail())){
				Session session = sessionFactory.getCurrentSession();
				session.save(job);
				return job;
			}
		}
		throw new RecruiterNotInSignUpListException(job.getRecruiterEmail());
		
	}

	public JobPosting getJobPostingByJobId(int jobId) throws JobPostingWithJobIdNotExistException {
	    List<JobPosting> jobPosting =    getAllJobPostings();
	    Iterator<JobPosting> iterator = jobPosting.iterator();
	    while(iterator.hasNext()){
	    	JobPosting j = iterator.next();
	    	 int id = j.getJobId();
	    	 if(id==jobId){
	    		 return j;
	    	 }
	    }
	    throw new JobPostingWithJobIdNotExistException(jobId);
		
		
//		Session session = sessionFactory.getCurrentSession();
//		Query<JobPosting> query = session.createQuery("from JobPosting where jobId= :id");
//		query.setParameter("id", jobId);
//		List<JobPosting> list = query.getResultList();
//		return list.get(0);
	}

	public List<JobPosting> getAllJobPostingsByEmailId(String recruiterEmailId) throws DbEmptyException, RecruiterNotInSignUpListException {
		
		List<RecruiterSignUp> list = signUpDao.getAllRecruiterSignUpInfo();
		Iterator<RecruiterSignUp> iterator = list.iterator();
		while(iterator.hasNext()){
			RecruiterSignUp signUp = iterator.next();
			String email = signUp.getEmail();
			
			if(email.equals(recruiterEmailId)){
				Session session = sessionFactory.getCurrentSession();
				Query<JobPosting> query = session.createQuery("from JobPosting where recruiterEmail = :emailId ");
				query.setParameter("emailId", recruiterEmailId);
				List<JobPosting> list1 = query.getResultList();
				return list1;
			}
		}
		
		throw new RecruiterNotInSignUpListException(recruiterEmailId);
		
//		Session session = sessionFactory.getCurrentSession();
//		Query<JobPosting> query = session.createQuery("from JobPosting where recruiterEmail = :emailId ");
//		query.setParameter("emailId", recruiterEmailId);
//		List<JobPosting> list = query.getResultList();
		// JobPosting p = list.get(0);

		//return list;

	}

	public List<JobPosting> getAllJobPostings() {
		Session session = sessionFactory.getCurrentSession();
		Query<JobPosting> query = session.createQuery("from JobPosting");
		List<JobPosting> list = query.getResultList();
		return list;

	}

	public List<JobPosting> getJobPostingListByRequirements(String jobType, String jobField, String jobTitle, String exp) {
		Session session = sessionFactory.getCurrentSession();
		Query<JobPosting> query = session.createQuery(
				"from JobPosting where employmentType=:type and jobField=:field and jobtitle=:title and seniorityLevel=:exp");
		query.setParameter("type", jobType);
		query.setParameter("field", jobField);
		query.setParameter("title", jobTitle);
		query.setParameter("exp", exp);
		List<JobPosting> list = query.getResultList();
		return list;
	}

	// delets one specific job posted by that recruiter with given Jobid
	// didnt change the following remove methods,because we wont use them in project working
	public JobPosting removeJobPostingByJobId(int jobId) throws JobPostingWithJobIdNotExistException {
		
		Session session = sessionFactory.getCurrentSession();
		JobPosting p = getJobPostingByJobId(jobId);
		Object persistentInstance = session.load(JobPosting.class, jobId);
		if (persistentInstance != null) {
			session.delete(persistentInstance);

		}

		return p;
	}

	// delete all jobpostings from jobposting table posted by particular
	// recruiter
	public List<JobPosting> removeAllJobPostingByEmailId(String recruiterEmailId) throws DbEmptyException, RecruiterNotInSignUpListException, JobPostingWithJobIdNotExistException {
		List<JobPosting> posts = getAllJobPostingsByEmailId(recruiterEmailId);
		Iterator<JobPosting> it = posts.iterator();
		while (it.hasNext()) {
			JobPosting p = it.next();
			int jobId = p.getJobId();
			removeJobPostingByJobId(jobId);
		}

		return posts;
	}

	public List<JobPosting> removeAllJobPosting() throws JobPostingWithJobIdNotExistException {
		List<JobPosting> al = getAllJobPostings();
		Iterator<JobPosting> it = al.iterator();
		while (it.hasNext()) {
			JobPosting p = it.next();
			int jobId = p.getJobId();
			removeJobPostingByJobId(jobId);
		}
		return al;

	}
}
