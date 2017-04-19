package com.project.dreamjob.domain;
import javax.persistence.Embeddable;

@Embeddable
public class Skill {
  String skill;

public String getSkill() {
	return skill;
}

public void setSkill(String skill) {
	this.skill = skill;
}

@Override
public String toString() {
	return "Skill [skill=" + skill + "]";
}

  
}

