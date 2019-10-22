package com.hcl.medicalclaims.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import com.hcl.medicalclaims.dto.PolicyResponseDetailsDto;
import com.hcl.medicalclaims.exception.PolicyNotExistsException;
import com.hcl.medicalclaims.service.PolicyServiceImpl;
import com.hcl.medicalclaims.util.MedicalUtils;

/**
 * Test cases for policy controller
 * @author Sharath G S
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class PolicyControllerTest {

	@Mock
	PolicyServiceImpl policyService;
	
	@InjectMocks
	PolicyController policyController;
	
	
	PolicyResponseDetailsDto policyResponse = null;
	
	
	@Before
	public void setUp()
	{
		policyResponse = new PolicyResponseDetailsDto();
		policyResponse.setClaimedAmount((double) 50000);
		policyResponse.setEligibleAmount((double) 30000);
		policyResponse.setPolicyHolderName("Sharath");
		policyResponse.setPolicyType("DENTAL");
		policyResponse.setStatusCode(MedicalUtils.POLICY_HTTP_SUCCESS);
		policyResponse.setMessage(MedicalUtils.POLICY_DETAILS_EXISTS);
	}
	
	/**
	 * Positive test cases for policy controller
	 * @author Sharath G S
	 * @throws PolicyNotExistsException
	 */
	@Test
	public void policyControllerTest() throws PolicyNotExistsException
	{
		Mockito.when(policyService.getPolicyDetails("QWE1234")).thenReturn(policyResponse);
		ResponseEntity<PolicyResponseDetailsDto> policyResponseDetails = policyController.getPolicyDetails("QWE1234");
		PolicyResponseDetailsDto policy = policyResponseDetails.getBody();
		Assert.assertEquals(policy.getMessage(), policyResponse.getMessage());
	}
}
