/**
 * 
 */
package com.hcl.medicalclaims.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author srinivas
 *
 */
@RestController
@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
public class ClaimController {
	private static final Logger LOGGER = LoggerFactory.getLogger(ClaimController.class);
	/*@Autowired
	private ClaimService claimService;
	@PostMapping("/claims")
	public AddClaimResponseDTO addClaim(@RequestBody AddClaimRequestDTO addClaimRequest) {
}*/
}