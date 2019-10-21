/**
 * 
 */
package com.hcl.medicalclaims.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author srinivas
 *
 */
@Entity
public class ApproverDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer approverId;
	private String approverName;
	private String approverMailId;
	private String approverPassword;
	private String approverRole;

	/**
	 * @return the approverId
	 */
	public Integer getApproverId() {
		return approverId;
	}

	/**
	 * @param approverId the approverId to set
	 */
	public void setApproverId(Integer approverId) {
		this.approverId = approverId;
	}

	/**
	 * @return the approverName
	 */
	public String getApproverName() {
		return approverName;
	}

	/**
	 * @param approverName the approverName to set
	 */
	public void setApproverName(String approverName) {
		this.approverName = approverName;
	}

	/**
	 * @return the approverMailId
	 */
	public String getApproverMailId() {
		return approverMailId;
	}

	/**
	 * @param approverMailId the approverMailId to set
	 */
	public void setApproverMailId(String approverMailId) {
		this.approverMailId = approverMailId;
	}

	/**
	 * @return the approverPassword
	 */
	public String getApproverPassword() {
		return approverPassword;
	}

	/**
	 * @param approverPassword the approverPassword to set
	 */
	public void setApproverPassword(String approverPassword) {
		this.approverPassword = approverPassword;
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

}
