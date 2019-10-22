package com.hcl.medicalclaims.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.medicalclaims.dto.ApproverLoginRequestDto;
import com.hcl.medicalclaims.dto.ApproverLoginResponseDto;
import com.hcl.medicalclaims.entity.ApproverDetails;
import com.hcl.medicalclaims.exception.CommonException;
import com.hcl.medicalclaims.repository.ApproverRepository;
import com.hcl.medicalclaims.util.ExceptionConstants;

 /*
 * @author priyanka
 */

@Service
public class ApproverLoginServiceImpl implements ApproverLoginService {
	
	/**
	 * @apiNote emailId and password we need to pass
	 * @return role and name of the approver
	 */
	@Autowired
	ApproverRepository approverRepository;
	
	public ApproverLoginResponseDto approverLogin(ApproverLoginRequestDto approverLoginRequestDto)
	{     
		Optional<ApproverDetails> approverDetailss=approverRepository.findByMailIdAndPassword(approverLoginRequestDto.getMailId(),
				approverLoginRequestDto.getPassword());
		if(approverDetailss.isPresent())
		{
			ApproverDetails approverDetails=approverDetailss.get();
			
			Integer approverId=approverDetails.getApproverId();
			String approverName=approverDetails.getApproverName();
			String approverRole=approverDetails.getApproverRole();
			ApproverLoginResponseDto approverLoginResponseDto=new ApproverLoginResponseDto();
			approverLoginResponseDto.setApprovarId(approverId);
			approverLoginResponseDto.setApproverName(approverName);
			approverLoginResponseDto.setApproverRole(approverRole);
			return approverLoginResponseDto;
		}
		
		 else
		  {
			  throw new CommonException(ExceptionConstants.APPROVER_NOT_FOUND);
		  }	
	}

}
