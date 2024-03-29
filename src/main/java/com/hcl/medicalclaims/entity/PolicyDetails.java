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
public class PolicyDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer policyId;
	private Integer policyNo;
	private String policyHolderName;
	private String policyType;
	private Double eligibleAmount;
	private Double claimedAmount;
	
	/**
	 * @return the claimedAmount
	 */

	public Double getClaimedAmount() {
		return claimedAmount;
	}

	/**
	 * @param claimedAmount the claimedAmount to set
	 */

	public void setClaimedAmount(Double claimedAmount) {
		this.claimedAmount = claimedAmount;
	}

	/**
	 * @return the policyId
	 */
	public Integer getPolicyId() {
		return policyId;
	}

	/**
	 * @param policyId the policyId to set
	 */
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}

	/**
	 * @return the policyNo
	 */
	public Integer getPolicyNo() {
		return policyNo;
	}

	/**
	 * @param policyNo the policyNo to set
	 */
	public void setPolicyNo(Integer policyNo) {
		this.policyNo = policyNo;
	}

	/**
	 * @return the policyHolderName
	 */
	public String getPolicyHolderName() {
		return policyHolderName;
	}

	/**
	 * @param policyHolderName the policyHolderName to set
	 */
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}

	/**
	 * @return the policyType
	 */
	public String getPolicyType() {
		return policyType;
	}

	/**
	 * @param policyType the policyType to set
	 */
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	/**
	 * @return the eligibleAmount
	 */
	public Double getEligibleAmount() {
		return eligibleAmount;
	}

	/**
	 * @param eligibleAmount the eligibleAmount to set
	 */
	public void setEligibleAmount(Double eligibleAmount) {
		this.eligibleAmount = eligibleAmount;
	}

}
