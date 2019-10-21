package com.hcl.medicalclaims.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ApproverSummary {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer approverSummaryId;
	private Integer approverId;
	private String approverRole;
	public Integer getApproverSummaryId() {
		return approverSummaryId;
	}
	public void setApproverSummaryId(Integer approverSummaryId) {
		this.approverSummaryId = approverSummaryId;
	}
	public Integer getApproverId() {
		return approverId;
	}
	public void setApproverId(Integer approverId) {
		this.approverId = approverId;
	}
	public String getApproverRole() {
		return approverRole;
	}
	public void setApproverRole(String approverRole) {
		this.approverRole = approverRole;
	}
}
