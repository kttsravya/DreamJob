package com.project.dreamjob.dao;

import javax.validation.ConstraintViolation;
import javax.validation.Path;
import javax.validation.metadata.ConstraintDescriptor;

public class EmailExistExc implements ConstraintViolation<Object> {
   
	public String getConstraintName(){
    	return "email already exist exception";
    }
	
	@Override
	public String getMessage() {
		return "emailAreadyExistInCostriantViolation";
		
	}

	@Override
	public String getMessageTemplate() {
		// TODO Auto-generated method stub
		return "emailAreadyExistInCostriantViolation";
	}

	@Override
	public Object getRootBean() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class getRootBeanClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getLeafBean() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] getExecutableParameters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getExecutableReturnValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Path getPropertyPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getInvalidValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConstraintDescriptor getConstraintDescriptor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object unwrap(Class type) {
		// TODO Auto-generated method stub
		return null;
	}

}
