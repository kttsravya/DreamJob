package com.project.dreamjob.RestClients;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class SurroundZipCodes {
	List<SurroundZipCode> zip_codes;

	public List<SurroundZipCode> getZip_codes() {
		return zip_codes;
	}

	public void setZip_codes(List<SurroundZipCode> zip_codes) {
		this.zip_codes = zip_codes;
	}

	
}
