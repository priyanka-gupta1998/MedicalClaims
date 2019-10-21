package com.hcl.medicalclaims.service;

import org.springframework.stereotype.Service;

import com.hcl.medicalclaims.dto.ApproveRequestDto;
import com.hcl.medicalclaims.dto.ApproveResponseDto;
import com.hcl.medicalclaims.exception.ApproverNotExistsException;
import com.hcl.medicalclaims.exception.ClaimNumberNotExistsException;

@Service
public interface ApproverService {

	
	public ApproveResponseDto claimApproved(ApproveRequestDto approveRequest) throws ApproverNotExistsException, ClaimNumberNotExistsException;
}
