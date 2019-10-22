/**
 * 
 */
package com.hcl.medicalclaims.dto;

/**
 * @author srinivas
 *
 */
public class AddClaimResponseDTO {
	private int statusCode;
	private String message;
	private Integer claimNo;

	/**
	 * @return the statusCode
	 */
	public int getStatusCode() {
		return statusCode;
	}

	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the claimNo
	 */
	public Integer getClaimNo() {
		return claimNo;
	}

	/**
	 * @param claimNo the claimNo to set
	 */
	public void setClaimNo(Integer claimNo) {
		this.claimNo = claimNo;
	}

}
