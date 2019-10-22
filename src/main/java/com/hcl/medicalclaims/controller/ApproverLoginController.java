package com.hcl.medicalclaims.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.medicalclaims.dto.ApproverLoginRequestDto;
import com.hcl.medicalclaims.dto.ApproverLoginResponseDto;
import com.hcl.medicalclaims.exception.CommonException;
import com.hcl.medicalclaims.service.ApproverLoginService;
import com.hcl.medicalclaims.util.ExceptionConstants;


/* 
*@author priyanka
*/

@RestController
@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
@RequestMapping("/approver")
public class ApproverLoginController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ApproverLoginController.class);
	@Autowired
	ApproverLoginService approverLoginService;
	/**
	 * @apiNote emailId and password we need to pass for login
	 * @return Response for login .
	 */
    @PostMapping("/login")
	public ApproverLoginResponseDto approverLogin(@RequestBody ApproverLoginRequestDto approverLoginRequestDto)
	{
    	LOGGER.info("inside approverlogin controller");
    	ApproverLoginResponseDto approverLoginResponseDto=approverLoginService.approverLogin(approverLoginRequestDto);
    	if(approverLoginResponseDto!=null)
    	{
    	 approverLoginResponseDto.setMessage("Login Successful!!");
    	 approverLoginResponseDto.setStatusCode(201);
    	 return approverLoginResponseDto;
    	}
    	else
    	{
    		throw new CommonException(ExceptionConstants.INVALID_CREDENTIALS);
    	}
	}
}
