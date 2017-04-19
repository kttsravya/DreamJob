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

import com.project.dreamjob.domain.JobSeekerSignUp;
import com.project.dreamjob.domain.RecruiterSignUp;
import com.project.dreamjob.exceptions.DbEmptyException;
import com.project.dreamjob.exceptions.EmailAlreadyExistInDbException;
import com.project.dreamjob.exceptions.EmailNotExistInDbException;
import com.project.dreamjob.exceptions.RecruiterIdDosentExistInDbException;


@Repository(value = "recruiterSignUpDao")
@EnableTransactionManagement
@Transactional(readOnly = false)
public class RecruiterSignUpDao {

	@Autowired
	SessionFactory sessionFactory;

	public RecruiterSignUp saveRecruiterSignUpInfo(RecruiterSignUp recruiterSignUp) throws EmailAlreadyExistInDbException {
		System.out.println("recruiter signup in dao Lalalal before get all recruiter singup");
		Session session = sessionFactory.getCurrentSession();
		List<RecruiterSignUp> allSignUp;
		try {
			allSignUp = getAllRecruiterSignUpInfo();
		} catch (DbEmptyException e) {
			session.save(recruiterSignUp);
			return recruiterSignUp;
		}
		Iterator<RecruiterSignUp> iterator = allSignUp.iterator();
		while(iterator.hasNext()){
			RecruiterSignUp rec = iterator.next();
			if(rec.getEmail().equals(recruiterSignUp.getEmail())){
				throw new EmailAlreadyExistInDbException(recruiterSignUp.getEmail());
			}
		}
		System.out.println("recruiter signup in dao lalal before recruiter save signup");
		
		session.save(recruiterSignUp);
		System.out.println("recruiter signup in dao lalal after recruiter save signup");
		return recruiterSignUp;
	}

	public RecruiterSignUp getRecruiterSignUpInfoByRecruiterId(int recruiterId)  throws RecruiterIdDosentExistInDbException, DbEmptyException{
		List<RecruiterSignUp> allSignUp = getAllRecruiterSignUpInfo();
		Iterator<RecruiterSignUp> iterator = allSignUp.iterator();
		while(iterator.hasNext()){
			RecruiterSignUp rec = iterator.next();
			if(rec.getRecruiterId() == recruiterId){
				return rec;
			}
		}
		 throw new RecruiterIdDosentExistInDbException(recruiterId);
//		Session session = sessionFactory.getCurrentSession();
//		RecruiterSignUp signUp = session.get(RecruiterSignUp.class, recruiterId);
	
	}

	public RecruiterSignUp getRecruiterSignUpInfoByEmail(String emailId) throws EmailNotExistInDbException, DbEmptyException {
		
		List<RecruiterSignUp> allSignUp = getAllRecruiterSignUpInfo();
		Iterator<RecruiterSignUp> iterator = allSignUp.iterator();
		while(iterator.hasNext()){
			RecruiterSignUp rec = iterator.next();
			if(rec.getEmail().equals(emailId)){
				return rec;
			}
		}
		throw new EmailNotExistInDbException(emailId);

//		Session session = sessionFactory.getCurrentSession();
//		Query<RecruiterSignUp> query = session.createQuery(" from RecruiterSignUp where email= :email ");
//		query.setParameter("email", emailId);

//		List<RecruiterSignUp> list = query.getResultList();
//
//		if (list.size() <= 0) {
//			throw new EmailNotExistInDbException(emailId);
//		}
//
//		// for( RecruiterSignUp signUp : list){
//		// System.out.println(signUp.getEmail());
//		// }
//		return list.get(0);

	}

	public List<RecruiterSignUp> getAllRecruiterSignUpInfo() throws DbEmptyException {
		Session session = sessionFactory.getCurrentSession();
		Query<RecruiterSignUp> query = session.createQuery("from RecruiterSignUp");
		List<RecruiterSignUp> arrayList = query.getResultList();
		if(arrayList == null){
			throw new DbEmptyException();
		}
		return arrayList;
	}

	public RecruiterSignUp removeRecruiterSignUpInfoByEmail(String emailId) throws EmailNotExistInDbException, DbEmptyException {
		Session session = sessionFactory.getCurrentSession();
		List<RecruiterSignUp> allSignUp = getAllRecruiterSignUpInfo();
		Iterator<RecruiterSignUp> iterator = allSignUp.iterator();
		while(iterator.hasNext()){
			RecruiterSignUp rec = iterator.next();
			if(rec.getEmail().equals(emailId)){
				Query<RecruiterSignUp> query = session.createQuery("delete RecruiterSignUp where email = :email");
				query.setParameter("email", emailId);
				int result = query.executeUpdate();
				return rec;
			}
		}
		throw new EmailNotExistInDbException(emailId);
		
	}

	public RecruiterSignUp removeRecruiterSignUpInfoByRecruiterId(int recruiterId) throws DbEmptyException, RecruiterIdDosentExistInDbException {
		Session session = sessionFactory.getCurrentSession();
		List<RecruiterSignUp> allSignUp = getAllRecruiterSignUpInfo();
		Iterator<RecruiterSignUp> iterator = allSignUp.iterator();
		while(iterator.hasNext()){
			RecruiterSignUp rec = iterator.next();
			if(rec.getRecruiterId() == recruiterId){
				Query<RecruiterSignUp> query = session.createQuery("delete RecruiterSignUp where recruiterId = :id");
				query.setParameter("id", recruiterId);
				int result = query.executeUpdate();
				return rec;
			}
		}
		 throw new RecruiterIdDosentExistInDbException(recruiterId);
	

	}

	public List<RecruiterSignUp> removeAllRecruiterSignUpInfo() throws DbEmptyException {
		Session session = sessionFactory.getCurrentSession();
		List<RecruiterSignUp> list = getAllRecruiterSignUpInfo();
		if (list != null) {
			Query<RecruiterSignUp> query = session.createQuery("delete from RecruiterSignUp ");
			int result = query.executeUpdate();
		}
		return list;

	}

}
