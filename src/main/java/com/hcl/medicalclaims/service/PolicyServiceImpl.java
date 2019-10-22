package com.hcl.medicalclaims.service;

import org.springframework.stereotype.Service;

import com.hcl.medicalclaims.dto.PolicyResponseDetailsDto;
import com.hcl.medicalclaims.exception.PolicyNotExistsException;

@Service
public interface PolicyServiceImpl {

	public PolicyResponseDetailsDto getPolicyDetails(Integer policyNo) throws PolicyNotExistsException;
	
}
