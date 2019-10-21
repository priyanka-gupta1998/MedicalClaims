package com.hcl.medicalclaims.service;

import org.springframework.stereotype.Service;

import com.hcl.medicalclaims.dto.PolicyResponseDetailsDto;
import com.hcl.medicalclaims.exception.PolicyNotExistsException;

@Service
public interface PolicyServiceimpl {

	public PolicyResponseDetailsDto getPolicyDetails(String policyNo) throws PolicyNotExistsException;
	
}
