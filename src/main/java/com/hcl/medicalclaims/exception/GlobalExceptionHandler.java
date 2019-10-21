package com.hcl.medicalclaims.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author srinivas Used to throw global exceptions
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	/**
	 * @param Exception
	 * @return ResponseEntity
	 */
	@ExceptionHandler(CommonException.class)
	public ResponseEntity<ResponseError> commonException(Exception e) {
		ResponseError error = new ResponseError(e.getMessage(), HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}

	/**
	 * @param exception
	 * @param request
	 * @return ResponseEntity
	 *//*
		 * @ExceptionHandler(UserExistException.class) public
		 * ResponseEntity<ResponseError> globalExceptionHandler(UserExistException
		 * exception, WebRequest request) { ResponseError errorResponse = new
		 * ResponseError(); errorResponse.setMessage(exception.getMessage());
		 * errorResponse.setStatusCode(HttpStatus.NOT_FOUND.value()); return new
		 * ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND); }
		 */
	
	@ExceptionHandler(PolicyNotExistsException.class)
	public ResponseEntity<ResponseError> policyNotExists(Exception e) {
		ResponseError error = new ResponseError(e.getMessage(), HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}

}
