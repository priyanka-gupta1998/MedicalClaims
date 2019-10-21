package com.hcl.medicalclaims.exception;

public class ClaimNumberNotExistsException extends Exception {

private static final long serialVersionUID = 1L;
	
	
	public ClaimNumberNotExistsException(String message) {
		super(message);
	}
}
