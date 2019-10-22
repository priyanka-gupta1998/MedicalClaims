package com.hcl.medicalclaims.controller;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.hcl.medicalclaims.dto.ApproverLoginRequestDto;
import com.hcl.medicalclaims.dto.ApproverLoginResponseDto;
import com.hcl.medicalclaims.entity.ApproverDetails;
import com.hcl.medicalclaims.service.ApproverLoginServiceImpl;
/* 
*@author priyanka
*/
@RunWith(MockitoJUnitRunner.class)
public class ApproverLoginControllerTest {

	@Mock
	ApproverLoginServiceImpl approverLoginServiceImpl;
	
	@InjectMocks
	ApproverLoginController approverLoginController;
	ApproverLoginRequestDto approverLoginRequestDto;
	ApproverLoginResponseDto approverLoginResponseDto;
	ApproverDetails approverDetails;
	@Test
	public void approverLoginTest()
	{
		 approverLoginRequestDto=new ApproverLoginRequestDto();
		 approverLoginRequestDto.setMailId("priyag@hcl.com");
		 approverLoginRequestDto.setPassword("asd@123");
        approverDetails=new ApproverDetails();
		
		  
		  
		  approverLoginResponseDto=new ApproverLoginResponseDto();
		  approverLoginResponseDto.setApprovarId(1);
		  approverLoginResponseDto.setApproverName("Priyanka"); 
		  approverLoginResponseDto.setApproverRole("Manager");
		  
		  Mockito.when(approverLoginServiceImpl.approverLogin(approverLoginRequestDto)).thenReturn(approverLoginResponseDto);
		  approverLoginResponseDto=  approverLoginController.approverLogin(approverLoginRequestDto);
		  assertNotNull(approverLoginResponseDto);
	}
}
