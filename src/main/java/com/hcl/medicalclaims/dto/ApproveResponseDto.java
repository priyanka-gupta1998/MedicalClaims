package com.hcl.medicalclaims.dto;

public class ApproveResponseDto {

	private String message;
	private Integer statusCode;
	private Integer policyNo;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Integer getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	public Integer getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(Integer policyNo) {
		this.policyNo = policyNo;
	}
	
}
