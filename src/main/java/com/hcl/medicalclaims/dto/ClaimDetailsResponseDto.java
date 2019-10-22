package com.hcl.medicalclaims.dto;

import java.time.LocalDate;
import java.util.List;

import com.hcl.medicalclaims.entity.ClaimDetails;

public class ClaimDetailsResponseDto {
	
	private Integer statusCode;
	private String message;
	private List<ClaimDto> claimDetails;
	
	
	
	
	public Integer getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<ClaimDto> getClaimDetails() {
		return claimDetails;
	}
	public void setClaimDetails(List<ClaimDto> claimDetails) {
		this.claimDetails = claimDetails;
	}


}
