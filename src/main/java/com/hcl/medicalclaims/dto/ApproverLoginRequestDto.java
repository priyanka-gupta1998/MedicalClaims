package com.hcl.medicalclaims.dto;

/**
 * @author priyanka
 *
 */
public class ApproverLoginRequestDto {

	private String mailId;
	private String password;
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
