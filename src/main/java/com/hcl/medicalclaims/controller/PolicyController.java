package com.hcl.medicalclaims.controller;

import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.medicalclaims.dto.PolicyResponseDetailsDto;
import com.hcl.medicalclaims.exception.PolicyNotExistsException;
import com.hcl.medicalclaims.service.PolicyServiceImpl;

/**
 * The controller for policy details to view
 * @author Sharath G S
 *
 */
@RequestMapping("/policy")
@RestController
@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
public class PolicyController {

	
	private static final Logger LOGGER = LoggerFactory.getLogger(PolicyController.class);
	
	
	@Autowired
	PolicyServiceImpl policyService;
	/**
	 * The policy details will be sending the policy details of the policy Number
	 * @param policyNo
	 * @author Sharath G S
	 * @return policy details
	 * @throws PolicyNotExistsException 
	 */
	@GetMapping("/{policyNo}")
	public ResponseEntity<PolicyResponseDetailsDto> getPolicyDetails(@NotNull @PathVariable(value = "policyNo", required = true) String policyNo) throws PolicyNotExistsException
	{
		LOGGER.info("events for controller for policy details is called");
		return new ResponseEntity<>(policyService.getPolicyDetails(policyNo),HttpStatus.OK);
	}
}
