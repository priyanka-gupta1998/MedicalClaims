package com.hcl.medicalclaims.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.medicalclaims.dto.ClaimDetailsResponseDto;
import com.hcl.medicalclaims.dto.ClaimDto;
import com.hcl.medicalclaims.dto.PolicyDto;
import com.hcl.medicalclaims.entity.ClaimDetails;
import com.hcl.medicalclaims.entity.PolicyDetails;
import com.hcl.medicalclaims.repository.ClaimDetailsRepository;
import com.hcl.medicalclaims.repository.PolicyRepository;

@Service
public class ClaimDetailsServiceImpl implements ClaimsDetailsService {

	@Autowired
	PolicyRepository policyRepository;
	@Autowired
	ClaimDetailsRepository claimDetailsRepository;

	@Override
	public ClaimDetailsResponseDto getClaimDetails() {
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
