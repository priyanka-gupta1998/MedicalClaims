package com.hcl.medicalclaims.controller;

import static org.junit.Assert.assertNotNull;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.BeanUtils;

import com.hcl.medicalclaims.dto.AddClaimRequestDTO;
import com.hcl.medicalclaims.dto.AddClaimResponseDTO;
import com.hcl.medicalclaims.entity.ClaimDetails;
import com.hcl.medicalclaims.exception.HospitalNotFoundException;
import com.hcl.medicalclaims.exception.PolicyNotFoundException;
import com.hcl.medicalclaims.service.ClaimServiceImpl;

/**
 * @author srinivas Used to test ClaimControlle
 */
@RunWith(MockitoJUnitRunner.class)
public class ClaimControllerTest {

	@InjectMocks
	ClaimController claimController;

	@Mock
	ClaimServiceImpl claimServiceImpl;
	private ClaimDetails claimDetails;
	private AddClaimRequestDTO addClaimRequest;

	@Before
	public void setUp() {
		claimDetails = new ClaimDetails();
		claimDetails.setClaimNo(12345);
		addClaimRequest = new AddClaimRequestDTO();
		addClaimRequest.setClaimAmount(120.00);
		addClaimRequest.setPolicyNo(12345);
		addClaimRequest.setHospitalName("narayana");
		addClaimRequest.setAdmittedDate(LocalDate.now());
		addClaimRequest.setClaimUploadFilePath("fgjhj");
		addClaimRequest.setDiagnosis("wfhg");
		addClaimRequest.setDischargeDate(LocalDate.now());
		addClaimRequest.setDischargeSummary("fJHFG");
		addClaimRequest.setHospitalName("narayana");
		addClaimRequest.setNatureOfAilment("abcdef");
		addClaimRequest.setPolicyNo(12345);
		BeanUtils.copyProperties(addClaimRequest, claimDetails);
	}

	/**
	 * test case to add Claim
	 * 
	 * @throws HospitalNotFoundException
	 * @throws PolicyNotFoundException
	 */
	@Test
	public void testAddClaim() throws PolicyNotFoundException, HospitalNotFoundException {
		Mockito.when(claimServiceImpl.addClaim(addClaimRequest)).thenReturn(claimDetails);
		AddClaimResponseDTO addClaim = claimController.addClaim(addClaimRequest);
		assertNotNull(addClaim);
	}
}
