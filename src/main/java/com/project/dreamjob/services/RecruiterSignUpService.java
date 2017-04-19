package com.project.dreamjob.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.project.dreamjob.dao.RecruiterSignUpDao;
import com.project.dreamjob.domain.JobSeekerSignUp;
import com.project.dreamjob.domain.RecruiterSignUp;
import com.project.dreamjob.exceptions.DbEmptyException;
import com.project.dreamjob.exceptions.EmailAlreadyExistInDbException;
import com.project.dreamjob.exceptions.EmailNotExistInDbException;
import com.project.dreamjob.exceptions.EmptyPasswordFieldException;

@Service
@EnableTransactionManagement
@Transactional
public class RecruiterSignUpService {
	 @Autowired
     RecruiterSignUpDao signUpDao;
	// public static final String globalSalt = "$2a$10$rOWYY6uRASdVZDyw4GRYK.";
	 public String globalSalt;
	 
	 public RecruiterSignUp saveRecruiterInfo(RecruiterSignUp obj) throws EmailAlreadyExistInDbException, DbEmptyException, EmptyPasswordFieldException {
		  String hashCode = getHashCode(obj.getPassword());
		  obj.setPassword(hashCode);
		  System.out.println("recruitersignup in service layer LALSLSLSLSL");
			RecruiterSignUp signUp = signUpDao.saveRecruiterSignUpInfo(obj);
			return signUp;
	 }
	 
	 public RecruiterSignUp getRecruiterInfoByEmail(String email) throws EmailNotExistInDbException, DbEmptyException{
		 return signUpDao.getRecruiterSignUpInfoByEmail(email);
	 }

	public boolean checkEmailExistInDb(String emailId) throws DbEmptyException {
	   List<RecruiterSignUp> list = signUpDao.getAllRecruiterSignUpInfo();
	   Iterator<RecruiterSignUp> iterator = list.iterator();
	   while(iterator.hasNext()){
		   RecruiterSignUp rec = iterator.next();
		   String email = rec.getEmail();
		   if(email.equals(emailId)){
			   return true;
		   }
	   }
		return false;
	}
	
	public String getHashCode(String password) throws EmptyPasswordFieldException {
		if(password == null || password.isEmpty()){
			throw new EmptyPasswordFieldException();
		}
		System.out.println("global salt" + globalSalt);
		String pw_hash = BCrypt.hashpw(password, globalSalt); 
//		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//		String hashedPassword = passwordEncoder.encode(password);
//		System.out.println(hashedPassword);
		return pw_hash;
	}
	
	public List<String> getAllStates(){
		String[] states = { "California", "Alabama", "Arkansas", "Arizona", "Alaska", "Colorado", "Connecticut",
				"Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas",
				"Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota",
				"Mississippi,", "Missouri,", "Montana,", "Nebraska,", "Nevada,", "New Hampshire,", "New Jersey,",
				"New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon",
				"Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah",
				"Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming" };
		
		List<String> list = Arrays.asList(states);
		return list;
	}
	
	public List<String> getAllCountries() {
		String[] countries = { "United States","Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda",
				"Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh",
				"Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia and Herzegovina",
				"Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada",
				"Cape Verde", "Central African Republic", "Chad", "Chile", "China", "Colombi", "Comoros",
				"Congo (Brazzaville)", "Congo", "Costa Rica", "Cote d'Ivoire", "Croatia", "Cuba", "Cyprus",
				"Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor (Timor Timur)",
				"Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Fiji",
				"Finland", "France", "Gabon", "Gambia, The", "Georgia", "Germany", "Ghana", "Greece", "Grenada",
				"Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India",
				"Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan",
				"Kenya", "Kiribati", "Korea, North", "Korea, South", "Kuwait", "Kyrgyzstan", "Laos", "Latvia",
				"Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macedonia",
				"Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania",
				"Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Morocco", "Mozambique",
				"Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria",
				"Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines",
				"Poland", "Portugal", "Qatar", "Romania", "Russia", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia",
				"Saint Vincent", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal",
				"Serbia and Montenegro", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia",
				"Solomon Islands", "Somalia", "South Africa", "Spain", "Sri Lanka", "Sudan", "Suriname", "Swaziland",
				"Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Togo", "Tonga",
				"Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine",
				"United Arab Emirates", "United Kingdom",  "Uruguay", "Uzbekistan", "Vanuatu",
				"Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe" };

		List<String> list = Arrays.asList(countries);
		return list;
	}

	public String getGlobalSalt() {
		return globalSalt;
	}
	
	@Value("${globalValues.salt}")
	public void setGlobalSalt(String globalSalt1) {
		System.out.println( "accessing properties file " +globalSalt1);
		globalSalt = globalSalt1;
	}

	public List<String> getAllCities() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("San Jose");
		list.add("Santa Clara");
		list.add("Milpitas");
		list.add("Campbell");
		list.add("Cupertino");
		
		return list;
	}

	public List<String> getAllCompanies() {
		String[] companies = {"Google", "Facebook", "LinkedIn", "Twitter"};
		return Arrays.asList(companies);
		
	}
	
	public List<RecruiterSignUp> getAllRecruiterSignUp() throws DbEmptyException{
		return signUpDao.getAllRecruiterSignUpInfo();
	}

	
	
	
}
