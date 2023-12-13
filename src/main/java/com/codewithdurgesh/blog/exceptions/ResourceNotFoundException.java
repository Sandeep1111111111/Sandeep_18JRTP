package com.codewithdurgesh.blog.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	String sourceName;
	String fieldName;
	long fieldValue;

	public ResourceNotFoundException(String sourceName, String fieldName, long fieldValue) {
		super(String.format("%s not found with %s : %l" ,sourceName,fieldName,fieldValue ));
		this.sourceName = sourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

}
