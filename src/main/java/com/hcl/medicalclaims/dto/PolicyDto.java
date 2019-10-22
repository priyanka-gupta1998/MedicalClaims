package com.hcl.medicalclaims.dto;
/**
 * @author priyanka
 *
 */
public class PolicyDto {
	private Integer policyId;
	private String policyNo;
	private String policyHolderName;
	private String policyType;
	private Double eligibleAmount;
	private Double claimedAmount;
	public Integer getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
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
	public Double getClaimedAmount() {
		return claimedAmount;
	}
	public void setClaimedAmount(Double claimedAmount) {
		this.claimedAmount = claimedAmount;
	}
	
}
