package com.project.dreamjob.dao;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.dreamjob.domain.JobPosting;
import com.project.dreamjob.domain.JobSeekerDocument;
import com.project.dreamjob.domain.JobSeekerProfile;
import com.project.dreamjob.domain.JobSeekerSignUp;
import com.project.dreamjob.domain.RecruiterSignUp;
import com.project.dreamjob.domain.Skill;
import com.project.dreamjob.domain.Technology;
import com.project.dreamjob.exceptions.GivenJobSeekerIdNotExistInDbException;


public class DaoDemo {

	public static void main(String[] args) throws GivenJobSeekerIdNotExistInDbException  {
		//ApplicationContext ac = new ClassPathXmlApplicationContext("demo-root-context.xml");
	   AbstractApplicationContext container = new ClassPathXmlApplicationContext("demo-root-context.xml");
	   
	   JobSeekerDocumentDao dao = (JobSeekerDocumentDao) container.getBean("jobSeekerDocumentDao");
   //  JobSeekerSignUpDao dao1 = (JobSeekerSignUpDao) container.getBean("jobSeekerSignUpDao");
	   
	  List<JobSeekerDocument> list =  dao.findAllByJobSeekerId(3);
	  Iterator<JobSeekerDocument> it = list.iterator();
	  while(it.hasNext()){
		  System.out.println(it.next().getDescription());
	  }
	      
//	     JobSeekerDocument doc = new JobSeekerDocument();
//	     
//	       doc.setName("sravprofile1");
//	       
//	       doc.setDescription("this is sravya resume");
//	       
//	       String str="this is sravyas resume";
//	       byte[] byteArray =   str.getBytes();
//	       doc.setContent(byteArray);
//	       
//	       doc.setType("pdf");
//	       
//	       JobSeekerSignUp signUp =dao1.getJobSeekerSignUpInfoByEmailId("kttsravya@gmail.com"); 
	       
//	   	   JobSeekerSignUp signUp = new JobSeekerSignUp();
//			signUp.setEmail("kttsravya99@gmail.com");
//			signUp.setPassword("kttsravya99");
//			signUp.setName("sravya");
//			signUp.setContactNumber("987654321");
//			signUp.setCountry("india");
//			signUp.setState("andhra");
//			signUp.setCity("hyd");
//	        signUp.setZip(98765);
//	        dao1.saveJobSeekerSignUpInfo(signUp);
	       
	       
	       
//	       doc.setJobSeekerSignUp(signUp);
//	        
//	       
//	     JobSeekerDocument docc = dao.saveDocument(doc);
//	     
//	     System.out.println(docc.getDescription());
	   
//	test 1:    class:  JobSeekerSignUpDao  method: save
	   
//	   JobSeekerSignUp signUp = new JobSeekerSignUp();
//		signUp.setEmail("kttsravya@gmail.com");
//		signUp.setPassword("kttsravya");
//		signUp.setName("sravya");
//		signUp.setContactNumber("987654321");
//		signUp.setCountry("india");
//		signUp.setState("andhra");
//		signUp.setCity("hyd");
//        signUp.setZip(98765);
	   
	   // all DAO OBJECTS list here
	   
	   
    // JobSeekerSignUpDao dao  = (JobSeekerSignUpDao) container.getBean("jobSeekerSignUpDao");
     //  JobSeekerProfileDao profileDao = (JobSeekerProfileDao) container.getBean("jobSeekerProfileDao");
    
	  
//      JobSeekerSignUp returnValue = dao.saveJobSeekerSignUpInfo(signUp);
//	   System.out.println(returnValue.getEmail());
	   
	  // method: getby profileId
	   
	  
//	   JobSeekerSignUp returnValue = dao.getJobSeekerSignUpInfoByProfileId(1);
//	   System.out.println(returnValue.getEmail());
//	   
       // method: getby emailId
	   
	 
//	   JobSeekerSignUp returnValue1 = dao.getJobSeekerSignUpInfoByEmailId("kttsravya@gmail.com");
//	   System.out.println(returnValue1.getEmail());
	   
	   // method: get all list
	   
//	  ArrayList<JobSeekerSignUp> arrayList = (ArrayList<JobSeekerSignUp>) dao.getAllJobSeekerSignUpRecords();
//	  for(JobSeekerSignUp job : arrayList){
//		  System.out.println(job.getCity());
//	  }
	  
	  // method: remove by  jobSeekerId
	   
//	   JobSeekerSignUp returnValue2= dao.removeJobSeekerSignUpInfoByjobSeekerId(1);
//	   System.out.println(returnValue2.getEmail());
	   
	  // method : save 
	   
//	   JobSeekerSignUp returnValue3 = dao.saveJobSeekerSignUpInfo(signUp);
//	   System.out.println(returnValue3.getEmail());
	   
	  // method: remove by email 
	   
//	   JobSeekerSignUp returnValue2= dao.removeJobSeekerSignUpInfoByEmailId("kttsravya@gmail.com");
//	   System.out.println(returnValue2.getEmail());
	   
 // method: remove all records
	   
//	   ArrayList<JobSeekerSignUp> returnValue2= (ArrayList<JobSeekerSignUp>) dao.removeAllJobSeekerSignUpRecords();
//		  for(JobSeekerSignUp job : returnValue2){
//		  System.out.println(job.getCity());
//	  }
//	   
	   
	   
	   
// test 2 : class: JobSeekerProfileDao method: save
//	   
//	   JobSeekerProfile profile = new JobSeekerProfile();
//	   profile.setEmail("kttsravya1@gmail.com");
//	   profile.setDegree("Masters");
//	   profile.setFieldOfStudy("computerScience");
//	   profile.setJobTitle("developer");
//	   profile.setJobType("fullTime");
//	   profile.setExperience("entry-level");
//	   Skill s1 = new Skill();
//	   Skill s2 = new Skill();
//	   Skill s3 = new Skill();
//	 
//	   s1.setSkill("java");
//	   s2.setSkill("spring");
//	   s3.setSkill("web services");
//	   
//	   ArrayList<Skill> list = new ArrayList<Skill>();
//	   list.add(s1);
//	   list.add(s2);
//	   list.add(s3);
//	   
//	   profile.setSkills(list);
//	   
//         
//	    JobSeekerProfile p =  profileDao.save(profile);
//	    System.out.println(p.getEmail());
//	    
	 // method : getProfileByEmailId
	    
//	   JobSeekerProfile profile1 =  profileDao.getJobSeekerProfileByEmailId("kttsravya1@gmail.com");
//	   System.out.println(profile1.getExperience());
//	   Collection<Skill> c = profile1.getSkills();
//	   Iterator<Skill> it = c.iterator();
//	   while(it.hasNext()){
//		   System.out.println(it.next().getSkill());
//	   }
	   
//	   JobSeekerProfile profile2 =  profileDao.getJobSeekerProfileById(3);
//	   System.out.println(profile2.getExperience());
//	   
//	   
//	   List<JobSeekerProfile> list1 =  profileDao.getAllJobSeekersProfile();
//	   Iterator<JobSeekerProfile> ite = list1.iterator();
//	   while(ite.hasNext()){
//		   System.out.println(ite.next().getExperience());
//	   }
//	   List<JobSeekerProfile> list1 =  profileDao.getAllJobSeekersProfile();
//	   Iterator<JobSeekerProfile> ite = list1.iterator();
//	   while(ite.hasNext()){
//		   System.out.println(ite.next().getExperience());
//	   }
	   
//	   JobSeekerProfile profile3 =  profileDao.removeJobSeekerProfileById(5);
//	   System.out.println(profile3.getDegree());
////
		 //  profileDao.removeAllJobSeekersProfile();
		  
	  
	   
	   
	   
	   
	  
//	   Collection<Skill> list =  profile1.getSkills();
//	   Iterator<Skill> it =  list.iterator();
//	   while(it.hasNext()){
//		   System.out.println(it.next().getSkill());
//	   }
//	   ArrayList<Skill> skills =  (ArrayList<Skill>) profile1.getSkills();
//	   for(Skill s: skills){
//		  System.out.println(s.getSkill());
//	   }
       
       
	    
//	test 3:  class:recruiterSignUpDao method: save
//	    
//	    RecruiterSignUp recruiter = new RecruiterSignUp();
//	    recruiter.setEmail("recruiter1@gmail.com");
//	    recruiter.setPassword("recruiter1");
//	    recruiter.setName("recruiter1");
//	    recruiter.setContactNumber("987123456");
//	    recruiter.setCountry("united States");
//	    recruiter.setState("california");
//	    recruiter.setCity("sanJose");
//	    recruiter.setZip(12345);
//    
//	RecruiterSignUpDao recruiterDao = (RecruiterSignUpDao) container.getBean("recruiterSignUpDao");
//	
//	RecruiterSignUp rec = recruiterDao.saveRecruiterSignUpInfo(recruiter);
//	System.out.println(rec.getEmail());
	
	
//    RecruiterSignUp rec = recruiterDao.getRecruiterSignUpInfoByRecruiterId(1);
//    System.out.println(rec.getEmail());
//	RecruiterSignUp rec = recruiterDao.getRecruiterSignUpInfoByEmail("recruiter1@gmail.com");
//	 System.out.println(rec.getName());
	
//	List<RecruiterSignUp> list = recruiterDao.getAllRecruiterSignUpInfo();
//	Iterator<RecruiterSignUp> it = list.iterator();
//	while(it.hasNext()){
//		System.out.println(it.next().getCity());
//	}
	
//	RecruiterSignUp s = recruiterDao.removeRecruiterSignUpInfoByRecruiterId(1);
//	System.out.println(s.getCountry());
	
//	RecruiterSignUp s = recruiterDao.removeRecruiterSignUpInfoByEmail("recruiter1@gmail.com");
//	System.out.println(s.getContactNumber());
	
//	List<RecruiterSignUp> s =  recruiterDao.removeAllRecruiterSignUpInfo();
//	Iterator<RecruiterSignUp> it = s.iterator();
//	while(it.hasNext()){
//		System.out.println(it.next().getCity());
//	}
	
	   
// test 4: class: JobPostingDao method: save
//	   JobPosting post = new JobPosting();
//	   post.setCompanyName("google");
//	   post.setRecruiterEmail("recruiter1@gmail.com");
//	   post.setJobField("computerScience");
//	   post.setJobtitle("developer");
//	   post.setEmploymentType("fullTime");
//	   post.setSeniorityLevel("entry-level");
//	   post.setCountry("unitedStates");
//	   post.setState("california");
//	   post.setCity("sanJose");
//	   post.setZip(12345);
//	   Technology t1 = new Technology();
//	   t1.setTechnology("java");
//	   Technology t2 = new Technology();
//	   t2.setTechnology("webServices");
//	   Technology t3 = new Technology();
//	   t3.setTechnology("Spring");
//	  
//	   
//	  ArrayList<Technology> al = new ArrayList<Technology>();
//	  al.add(t1);
//	  al.add(t2);
//	  al.add(t3);
//	  post.setTechnologies(al);
////	   
////
//	  JobPostingDao postingDao = (JobPostingDao) container.getBean("jobPostingDao");
//	  
//	    JobPosting po =  postingDao.saveJobPosting(post);
//	    System.out.println(po.getRecruiterEmail());
//	 JobPosting posting =  postingDao.getJobPostingByJobId(2);
//	 System.out.println(posting.getCompanyName());
//	 List<Technology> tech = (List<Technology>) posting.getTechnologies();
//	 Iterator<Technology> it = tech.iterator();
//	 while(it.hasNext()){
//		 System.out.println(it.next().getTechnology());
//	 }
	 
//	 List<JobPosting> pos =  postingDao.getAllJobPostingsByEmailId("recruiter1@gmail.com");
//	  Iterator<JobPosting> it1 = pos.iterator();
//       while(it1.hasNext()){
//    	     JobPosting p = it1.next();
//    	   System.out.println(p.getCountry());
//    	        List<Technology> tec =   (List<Technology>) p.getTechnologies();
//    	        Iterator<Technology> it2 = tec.iterator();
//    	        while(it2.hasNext()){
//    	        	System.out.println(it2.next().getTechnology());
//    	        }
//       }
//      List<JobPosting> jobPosts =  postingDao.getAllJobPostings();
//      Iterator<JobPosting> it1 = jobPosts.iterator();
//      while(it1.hasNext()){
//    	  System.out.println(it1.next().getCompanyName());
//      }
//	 JobPosting po =  postingDao.removeJobPostingByProfileId(2);
//	 System.out.println(po.getCompanyName());
	//  postingDao.removeAllJobPostingByEmailId("recruiter1@gmail.com");
	   // postingDao.removeAllJobPosting();
       

}
}	
