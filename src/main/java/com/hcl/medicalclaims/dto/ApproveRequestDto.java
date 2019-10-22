package com.hcl.medicalclaims.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class ApproveRequestDto {

	
	private Integer approverId;
	
	
	private Integer policyId;
	
	private Integer claimId;
	
	@NotNull
	@NotEmpty
	private String remarks;
	
	@NotNull
	@NotEmpty
	private String claimStatus;
	
	
	
	
	public Integer getPolicyId() {
		return policyId;
	}
	public Integer getClaimId() {
		return claimId;
	}
	public void setClaimId(Integer claimId) {
		this.claimId = claimId;
	}
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}
	public Integer getApproverId() {
		return approverId;
	}
	public void setApproverId(Integer approverId) {
		this.approverId = approverId;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getClaimStatus() {
		return claimStatus;
	}
	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}
	
	
	
}
