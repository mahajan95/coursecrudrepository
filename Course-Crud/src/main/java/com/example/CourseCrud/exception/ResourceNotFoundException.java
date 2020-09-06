package com.example.CourseCrud.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 2892265014549458053L;
	
	private String resourcename;
	
	private String fieldvalue;
	
	private Long fieldname;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getResourcename() {
		return resourcename;
	}

	public String getFieldvalue() {
		return fieldvalue;
	}

	public Long getFieldname() {
		return fieldname;
	}

	public ResourceNotFoundException(String resourcename, String fieldvalue, Long courseId) {
		super(String.format("%s not found with %s:'%s'", resourcename,fieldvalue,courseId));
		this.resourcename = resourcename;
		this.fieldvalue = fieldvalue;
		this.fieldname = courseId;
	}
	
	
	
	
	
}


