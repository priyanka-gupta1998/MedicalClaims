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
	private String mailId;
	private String password;
	private String approverRole;
	/**
	 * @return the mailId
	 */
	public String getMailId() {
		return mailId;
	}

	/**
	 * @param mailId the mailId to set
	 */
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

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
