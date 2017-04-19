package com.project.dreamjob.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Technology {
  String technology;

public String getTechnology() {
	return technology;
}

public void setTechnology(String technology) {
	this.technology = technology;
}
  
}

