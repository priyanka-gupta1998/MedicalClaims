package com.hcl.medicalclaims.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hcl.medicalclaims.dto.PolicyResponseDetailsDto;
import com.hcl.medicalclaims.entity.PolicyDetails;
import com.hcl.medicalclaims.exception.PolicyNotExistsException;
import com.hcl.medicalclaims.repository.PolicyRepository;
import com.hcl.medicalclaims.util.MedicalUtils;

/**
 * The policy service method is for calling the policy details of each user
 * @author Sharath G S
 *
 */
@Service
public class PolicyService implements PolicyServiceimpl {

	private static final Logger LOGGER = LoggerFactory.getLogger(PolicyService.class);
	
	@Autowired
	PolicyRepository policyRepository;
	/**
	 * This method is called for displaying the policy details of the user or 
	 * does not exists the policy Number
	 * @author Sharath G S
	 * @return PolicyResponseDetailsDto
	 * @throws PolicyNotExistsException 
	 */
	@Override
	public PolicyResponseDetailsDto getPolicyDetails(String policyNo) throws PolicyNotExistsException {
		LOGGER.info("event for policy service is called");
		
		Optional<PolicyDetails> policyDetail = policyRepository.findBypolicyNo(policyNo);
		
		if(!policyDetail.isPresent())
		{
			throw new PolicyNotExistsException(MedicalUtils.POLICY_DETAILS_NOT_EXISTS);
		}
		
		PolicyResponseDetailsDto policyResponse = new PolicyResponseDetailsDto();
		policyDetail.ifPresent(Policy -> {
		
			BeanUtils.copyProperties(policyDetail.get(), policyResponse);
			policyResponse.setMessage(MedicalUtils.POLICY_DETAILS_EXISTS);
			policyResponse.setStatusCode(MedicalUtils.POLICY_HTTP_SUCCESS);
		});
		
		return policyResponse;
	}

}
