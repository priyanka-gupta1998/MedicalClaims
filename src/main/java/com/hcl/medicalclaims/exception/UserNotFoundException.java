package com.hcl.medicalclaims.exception;

/**
 * @author priyanka
 * used to send UserNotFoundException
 */
public class UserNotFoundException extends Exception
{
	/**
	 *  default serialVersionUID
	 */
	private static final long serialVersionUID = -6782010313316599660L;
	
	/**
	 * @param arg0
	 */
	public UserNotFoundException(String arg0) {
		super(arg0);
	}

}
