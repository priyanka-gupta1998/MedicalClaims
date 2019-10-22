/**
 * 
 */
package com.hcl.medicalclaims.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.medicalclaims.constants.MedicalClaimsConstants;
import com.hcl.medicalclaims.dto.AddClaimRequestDTO;
import com.hcl.medicalclaims.dto.AddClaimResponseDTO;
import com.hcl.medicalclaims.entity.ClaimDetails;
import com.hcl.medicalclaims.exception.HospitalNotFoundException;
import com.hcl.medicalclaims.exception.PolicyNotFoundException;
import com.hcl.medicalclaims.service.ClaimService;

/**
 * @author srinivas
 *
 */
@RestController
@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
public class ClaimController {
	private static final Logger LOGGER = LoggerFactory.getLogger(ClaimController.class);
	@Autowired
	private ClaimService claimService;

	@PostMapping("/claims")
	public AddClaimResponseDTO addClaim(@RequestBody AddClaimRequestDTO addClaimRequest)
			throws PolicyNotFoundException, HospitalNotFoundException {
		LOGGER.info("In addClaim method of ClaimController class-----");
		ClaimDetails addClaim = claimService.addClaim(addClaimRequest);
		AddClaimResponseDTO AddClaimResponse = new AddClaimResponseDTO();
		AddClaimResponse.setClaimNo(addClaim.getClaimNo());
		AddClaimResponse.setMessage(MedicalClaimsConstants.ADD_CLAIM_SUCCESS);
		AddClaimResponse.setStatusCode(MedicalClaimsConstants.POST_STATUS_CODE);
		return AddClaimResponse;
	}
}