package com.hcl.medicalclaims.service;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.hcl.medicalclaims.dto.ApproveRequestDto;
import com.hcl.medicalclaims.entity.ApproverDetails;
import com.hcl.medicalclaims.entity.ApproverSummary;
import com.hcl.medicalclaims.entity.ClaimDetails;
import com.hcl.medicalclaims.entity.PolicyDetails;
import com.hcl.medicalclaims.repository.ApproveSummaryRepository;
import com.hcl.medicalclaims.repository.ApproverRepository;
import com.hcl.medicalclaims.repository.ClaimRepository;
import com.hcl.medicalclaims.repository.PolicyRepository;

/**
 * The TestApproveService is used for test cases for approve request accept or reject
 * @author Sharath G S
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class ApproveServiceTest {

	@Mock
	ApproverRepository approverRepository;
	
	@Mock
	ApproveSummaryRepository approveSummaryRepo;
	
	@Mock
	ClaimRepository claimRepository;
	
	@Mock
	PolicyRepository policyRepository;
	
	@InjectMocks
	ApproverServiceImpl approveService;
	
	ApproveRequestDto approveRequest = null;
	ApproverDetails approverDetails = null;
	ClaimDetails claimDetails = null;
	PolicyDetails policyDetails = null;
	ApproverSummary approveSummary = null;
	
	@Before
	public void setUp()
	{
		policyDetails = new PolicyDetails();
		policyDetails.setClaimedAmount((double) 30000);
		policyDetails.setEligibleAmount((double) 200000);
		policyDetails.setPolicyHolderName("Sharath");
		policyDetails.setPolicyId(1);
		policyDetails.setPolicyNo(1234);
		policyDetails.setPolicyType("DENTAL");
		
		approveRequest = new ApproveRequestDto();
		approveRequest.setApproverId(1);
		approveRequest.setClaimId(1);
		approveRequest.setClaimStatus("APPROVED");
		approveRequest.setPolicyId(1);
		approveRequest.setRemarks("Approved for this claim");
		
		approverDetails = new ApproverDetails();
		approverDetails.setApproverId(1);
		approverDetails.setMailId("sharathgs777@gmail.com");
		approverDetails.setApproverName("Sharath");
		approverDetails.setPassword("test@123");
		approverDetails.setApproverRole("MANAGER");
		
		claimDetails = new ClaimDetails();
		claimDetails.setApproverSummaryId(1);
		claimDetails.setClaimAmount((double) 50000);
		claimDetails.setClaimId(1);
		claimDetails.setClaimNo(1234);
		claimDetails.setClaimStatus("PENDING");
		claimDetails.setDiagnosis("FULL BODY");
		claimDetails.setDischargeSummary("heart operation done and need to take rest");
		claimDetails.setHospitalName("APPOLLO");
		claimDetails.setNatureOfAilment("HEART");
		claimDetails.setPolicyDetails(policyDetails);
		
		approveSummary = new ApproverSummary();
		approveSummary.setApproverId(1);
		approveSummary.setApproverRole("MANAGER");
		approveSummary.setApproverSummaryId(1);
	}
	
	/**
	 * The positive test case for approve request
	 * @author Sharath G S
	 */
	@Test
	public void testApproveRequest()
	{
		Mockito.when(approverRepository.findByapproverId(approverDetails.getApproverId())).thenReturn(Optional.of(approverDetails));
		Mockito.when(claimRepository.findByclaimId(claimDetails.getClaimId())).thenReturn(Optional.of(claimDetails));
		Mockito.when(policyRepository.findById(policyDetails.getPolicyId())).thenReturn(Optional.of(policyDetails));
		Mockito.when(approveSummaryRepo.save(approveSummary)).thenReturn(approveSummary);
	}
	
}
