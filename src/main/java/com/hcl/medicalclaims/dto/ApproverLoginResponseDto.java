package com.hcl.medicalclaims.dto;

/**
 * @author priyanka
 *
 */
public class ApproverLoginResponseDto {

	private Integer approvarId;
	private String approverName;
	private String approverRole;
	private String message;
	private Integer statusCode;
	
	
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
	public Integer getApprovarId() {
		return approvarId;
	}
	public void setApprovarId(Integer approvarId) {
		this.approvarId = approvarId;
	}
	public String getApproverName() {
		return approverName;
	}
	public void setApproverName(String approverName) {
		this.approverName = approverName;
	}
	public String getApproverRole() {
		return approverRole;
	}
	public void setApproverRole(String approverRole) {
		this.approverRole = approverRole;
	}
	
	
	
}

