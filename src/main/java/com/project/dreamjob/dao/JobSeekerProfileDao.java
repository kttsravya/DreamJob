package com.project.dreamjob.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.project.dreamjob.domain.JobSeekerProfile;
import com.project.dreamjob.exceptions.EmailNotExistInDbException;

@Repository(value = "jobSeekerProfileDao")
@EnableTransactionManagement
@Transactional(readOnly = false)
public class JobSeekerProfileDao {

	@Autowired
	SessionFactory sessionFactory;

	// create
	public JobSeekerProfile saveProfile(JobSeekerProfile profile)  {
		Session session = sessionFactory.getCurrentSession();
		JobSeekerProfile existingProfile;

		try {
			JobSeekerProfile profile1 = getJobSeekerProfileByEmailId(profile.getEmail());
			existingProfile = profile1;
		} catch (EmailNotExistInDbException e) {
			session.save(profile);
			return profile;
		}
     
		//JobSeekerProfile profile1 = getJobSeekerProfileByEmailId(profile.getEmail());
		
		System.out.println("in dao" +existingProfile.getEmail());
		System.out.println(existingProfile.getDegree());
		System.out.println(existingProfile.getExperience());
		System.out.println(existingProfile.getFieldOfStudy());
		System.out.println(existingProfile.getJobTitle());
		System.out.println(existingProfile.getJobType());
		
	

		try {
			removeJobSeekerProfileByEmailId(existingProfile.getEmail());
		} catch (EmailNotExistInDbException e) {
			session.save(profile);
			return profile;
		}
		
		//JobSeekerProfile pro = saveProfileSecondary(profile);
         
		//session.save(profile);

		return profile;
	}

//	private JobSeekerProfile saveProfileSecondary(JobSeekerProfile profile) {
//		Session session = sessionFactory.getCurrentSession();
//		session.save(profile);
//		return profile;
//		
//	}

	// read by email
	public JobSeekerProfile getJobSeekerProfileByEmailId(String email) throws EmailNotExistInDbException {

		Session session = sessionFactory.getCurrentSession();
		JobSeekerProfile p;
		try {
			Query<JobSeekerProfile> query = session.createQuery("from JobSeekerProfile where email = :emailId ");
			query.setParameter("emailId", email);
			List<JobSeekerProfile> list = query.getResultList();
			p = list.get(0);
		} catch (Exception ex) {
			throw new EmailNotExistInDbException("form jobseeker profile dao");
		}

		return p;

		// method 2 for getting skill values using native query

		// SQLQuery sqlquery = session.createSQLQuery("select skill from Skill
		// where profile_id =:id");
		// sqlquery.setParameter("id", p.getProfileId());
		// List<String> rows = sqlquery.list();
		// Iterator<String> it = rows.iterator();

		/*
		 * Collection<Skill> c = profile1.getSkills(); Iterator<Skill> it =
		 * c.iterator(); while(it.hasNext()){
		 * System.out.println(it.next().getSkill()); }
		 */

	}

	// read by profileId
	public JobSeekerProfile getJobSeekerProfileById(int profileId) {
		Session session = sessionFactory.getCurrentSession();
		Query<JobSeekerProfile> query = session.createQuery("from JobSeekerProfile where profileId= :id");
		query.setParameter("id", profileId);
		List<JobSeekerProfile> list = query.getResultList();
		return list.get(0);
	}

	public List<JobSeekerProfile> getJobSeekerProfileByGivenRequirements(String jobTitle, String jobType,
			String jobField, String experience, String degree) {
		Session session = sessionFactory.getCurrentSession();
		Query<JobSeekerProfile> query = session.createQuery(
				"from JobSeekerProfile where jobTitle=:title and jobType=:type  and fieldOfStudy =:field  and experience=:exp and  degree=:deg");

		query.setParameter("title", jobTitle);
		query.setParameter("type", jobType);
		query.setParameter("field", jobField);
		query.setParameter("exp", experience);
		query.setParameter("deg", degree);
		List<JobSeekerProfile> profiles = query.getResultList();

		return profiles;
	}

	// read all profiles
	public List<JobSeekerProfile> getAllJobSeekersProfile() {
		Session session = sessionFactory.getCurrentSession();
		Query<JobSeekerProfile> query = session.createQuery("from JobSeekerProfile");
		List<JobSeekerProfile> list = query.getResultList();
		return list;
	}

	// remove profile by id
	public JobSeekerProfile removeJobSeekerProfileById(int profileId) {
		Session session = sessionFactory.getCurrentSession();
		// using hql to delete only delets profile not embedded object so using
		// another way with hibernate api
		JobSeekerProfile p = getJobSeekerProfileById(profileId);
		System.out.println("removing"+p.getEmail());
		System.out.println("removing" + p.getExperience());
		System.out.println("removing" + p.getFieldOfStudy());
		System.out.println("removing" + p.getJobTitle());
		System.out.println("removing" + p.getJobType());
		Object persistentInstance = session.load(JobSeekerProfile.class, profileId);
		if (persistentInstance != null) {
			session.delete(persistentInstance);

		}
		System.out.println("removed");

		return p;
	}

	// remove profile by emailId
	public JobSeekerProfile removeJobSeekerProfileByEmailId(String emailId) throws EmailNotExistInDbException {
		// Session session = sessionFactory.getCurrentSession();
		JobSeekerProfile p = getJobSeekerProfileByEmailId(emailId);
		System.out.println("in remove method of dao " + p.getEmail() +" " + p.getFieldOfStudy());
		return removeJobSeekerProfileById(p.getProfileId());
		//System.out.println("removed " + emailId);
		//return p;

	}

	// remove all profiles
	public List<JobSeekerProfile> removeAllJobSeekersProfile() {
		List<JobSeekerProfile> all = getAllJobSeekersProfile();
		Iterator<JobSeekerProfile> it = all.iterator();
		while (it.hasNext()) {
			JobSeekerProfile j = it.next();
			int profileId = j.getProfileId();
			removeJobSeekerProfileById(profileId);
		}

		return all;
	}

}
