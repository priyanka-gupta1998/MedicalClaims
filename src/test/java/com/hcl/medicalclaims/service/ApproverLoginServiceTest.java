package com.hcl.medicalclaims.service;

import static org.junit.Assert.assertNotNull;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.hcl.medicalclaims.dto.ApproverLoginRequestDto;
import com.hcl.medicalclaims.dto.ApproverLoginResponseDto;
import com.hcl.medicalclaims.entity.ApproverDetails;
import com.hcl.medicalclaims.repository.ApproverRepository;
/**
 * @author priyanka
 *
 */
@RunWith(MockitoJUnitRunner.class) 
public class ApproverLoginServiceTest {

	@InjectMocks
	ApproverLoginServiceImpl approverLoginServiceImpl;
	@Mock
	ApproverRepository approverRepository;
	ApproverLoginRequestDto approverLoginRequestDto;
	ApproverDetails approverDetails;
	ApproverLoginResponseDto approverLoginResponseDto;
	Optional<ApproverDetails> approverDetailss;
	@Before
	public void setup()
	{
		 approverDetails=new ApproverDetails();
		 approverDetails.setApproverId(1);
		 approverDetails.setApproverName("Priyanka");
		 approverDetails.setApproverRole("Manager");
		 approverDetails.setMailId("priyag@gmail.com");
		 approverDetails.setPassword("abc@123");
		 approverDetailss=Optional.of(approverDetails);
		approverLoginRequestDto=new ApproverLoginRequestDto();
		approverLoginRequestDto.setMailId("priyag@gmail.com");
		approverLoginRequestDto.setPassword("abc@123");
		
		 approverLoginResponseDto=new ApproverLoginResponseDto();
		 approverLoginResponseDto.setApprovarId(1);
		 approverLoginResponseDto.setApproverName("Priyanka");
		 approverLoginResponseDto.setApproverRole("Manager");
				
		
	}
	
	@Test
	public void approverLoginTest()
	{
		Mockito.when(approverRepository.findByMailIdAndPassword(Mockito.anyString(),Mockito.anyString())).thenReturn(approverDetailss);
		approverLoginResponseDto=approverLoginServiceImpl.approverLogin(approverLoginRequestDto);
		assertNotNull(approverLoginResponseDto);
	}
}
