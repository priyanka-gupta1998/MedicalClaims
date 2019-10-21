package com.hcl.medicalclaims.dto;

public class PolicyResponseDetailsDto {

	private String message;
	private Integer statusCode;
	private String policyHolderName;
	private String policyType;
	private Double eligibleAmount;
	private Double claimedAmount;
	
	public Double getClaimedAmount() {
		return claimedAmount;
	}
	public void setClaimedAmount(Double claimedAmount) {
		this.claimedAmount = claimedAmount;
	}
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
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	public String getPolicyType() {
		return policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	public Double getEligibleAmount() {
		return eligibleAmount;
	}
	public void setEligibleAmount(Double eligibleAmount) {
		this.eligibleAmount = eligibleAmount;
	}
	
	
}
