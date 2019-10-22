package com.hcl.medicalclaims.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.medicalclaims.controller.ClaimDetailsController;
import com.hcl.medicalclaims.dto.ClaimDetailsResponseDto;
import com.hcl.medicalclaims.dto.ClaimDto;
import com.hcl.medicalclaims.dto.PolicyDto;
import com.hcl.medicalclaims.entity.ClaimDetails;
import com.hcl.medicalclaims.entity.PolicyDetails;
import com.hcl.medicalclaims.repository.ClaimDetailsRepository;
import com.hcl.medicalclaims.repository.PolicyRepository;
/* 
*@author priyanka
*/
@Service
public class ClaimDetailsServiceImpl implements ClaimsDetailsService {
	private static final Logger LOGGER = LoggerFactory.getLogger(ClaimDetailsServiceImpl.class);
	@Autowired
	PolicyRepository policyRepository;
	@Autowired
	ClaimDetailsRepository claimDetailsRepository;
	/**
	 * @apiNote on the basis of policy_id
	 * @return claim details
	 */
	@Override
	public ClaimDetailsResponseDto getClaimDetails() {
		LOGGER.info("service for getting claim details");
	 	List<ClaimDto> claimDetailss = new ArrayList<>();
	 	ClaimDetailsResponseDto claimDetailsResponseDto = new ClaimDetailsResponseDto();
		List<PolicyDetails> polictDetails = policyRepository.findAll();
		polictDetails.stream().forEach(policy -> {
			Optional<List<ClaimDetails>> claimDetailsOptional = claimDetailsRepository.findByPolicyDetails(policy);
			if(claimDetailsOptional.isPresent())
			{
			 List<ClaimDetails> claimDetails = claimDetailsOptional.get();
			 claimDetails.stream().forEach(claim -> {
				ClaimDto claimDto = new ClaimDto();
				BeanUtils.copyProperties(claim, claimDto);
				claimDto.setPolicyId(policy.getPolicyId());
				claimDetailss.add(claimDto);

			});
			}
			
			claimDetailsResponseDto.setClaimDetails(claimDetailss);
			
			
		});
		return claimDetailsResponseDto;
		
	

	}

}
