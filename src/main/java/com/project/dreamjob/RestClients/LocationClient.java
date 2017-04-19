package com.project.dreamjob.RestClients;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.project.dreamjob.exceptions.ZipCodeInvalidException;

@Component
public class LocationClient {

//	@Autowired
	public SurroundZipCodes codes;

	@Autowired
	RestTemplate restTemplate;

	public void listAllUsers(String zip, String radius) throws ZipCodeInvalidException {

		 HashMap<String,String> vars = new HashMap<String,String>();
		 vars.put("zip", zip);
		 vars.put("radius", radius);

		String REST_SERVICE_URI = "https://www.zipcodeapi.com/rest/"
				+ "0kf3W61RUSphOK0SE5lVZIzMgAS1rNAr8Qu5WvWQnm8c694LfpHe8g1oRTpiH0JQ/radius.json/{zip}/{radius}/mile";
          try{
        	  SurroundZipCodes usersMap = restTemplate.getForObject(REST_SERVICE_URI, SurroundZipCodes.class, vars);
        	  codes = usersMap;
          }catch(Exception ex){
        	  throw new ZipCodeInvalidException(vars.get("zip"));
          }
		
		//System.out.println(usersMap.toString());
		
		

		
//		Iterator<SurroundZipCode> it1 = (usersMap.getZip_codes()).iterator();
//
//		while (it1.hasNext()) {
//			System.out.println("from location local var: " + it1.next().getZip_code());
//		}

		
	}
}
