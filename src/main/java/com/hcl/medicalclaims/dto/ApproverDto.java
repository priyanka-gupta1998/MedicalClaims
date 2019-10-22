package com.hcl.medicalclaims.dto;

public class ApproverDto {
	private Integer approverId;
	private String approverName;
	private String mailId;
	private String password;
	private String approverRole;
	public Integer getApproverId() {
		return approverId;
	}
	public void setApproverId(Integer approverId) {
		this.approverId = approverId;
	}
	public String getApproverName() {
		return approverName;
	}
	public void setApproverName(String approverName) {
		this.approverName = approverName;
	}
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
	public String getApproverRole() {
		return approverRole;
	}
	public void setApproverRole(String approverRole) {
		this.approverRole = approverRole;
	}
	
	
}
