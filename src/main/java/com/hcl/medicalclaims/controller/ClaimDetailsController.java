package com.hcl.medicalclaims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.medicalclaims.dto.ClaimDetailsResponseDto;
import com.hcl.medicalclaims.service.ClaimsDetailsService;
/* 
*@author priyanka
*/
@RestController
@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
@RequestMapping("/claims")
public class ClaimDetailsController {
	@Autowired
	ClaimsDetailsService claimsDetailsService;
	
	@GetMapping("/")
	public ClaimDetailsResponseDto getClaimDetails()
	{
		ClaimDetailsResponseDto claimDetailsResponseDto=claimsDetailsService.getClaimDetails();
		claimDetailsResponseDto.setMessage("Claim details");
		claimDetailsResponseDto.setStatusCode(201);
		return claimDetailsResponseDto;
		
	}

}
