/**
 * 
 */
package com.hcl.medicalclaims.exception;

/**
 * @author srinivas
 *
 */
public class HospitalNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param message
	 */
	public HospitalNotFoundException(String message) {
		super(message);
	}
}
