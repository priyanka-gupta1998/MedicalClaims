/**
 * 
 */
package com.hcl.medicalclaims.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author User1
 *
 */
@Entity
public class ApproverSummary {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer approverSummaryId;
	private String approverRole;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "approverId", referencedColumnName = "approverId")
	private ApproverDetails approverDetails;

	/**
	 * @return the approverSummaryId
	 */
	public Integer getApproverSummaryId() {
		return approverSummaryId;
	}

	/**
	 * @param approverSummaryId the approverSummaryId to set
	 */
	public void setApproverSummaryId(Integer approverSummaryId) {
		this.approverSummaryId = approverSummaryId;
	}

	/**
	 * @return the approverRole
	 */
	public String getApproverRole() {
		return approverRole;
	}

	/**
	 * @param approverRole the approverRole to set
	 */
	public void setApproverRole(String approverRole) {
		this.approverRole = approverRole;
	}

	/**
	 * @return the approverDetails
	 */
	public ApproverDetails getApproverDetails() {
		return approverDetails;
	}

	/**
	 * @param approverDetails the approverDetails to set
	 */
	public void setApproverDetails(ApproverDetails approverDetails) {
		this.approverDetails = approverDetails;
	}

}
