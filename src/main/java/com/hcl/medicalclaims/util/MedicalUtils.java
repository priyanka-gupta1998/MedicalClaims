package com.hcl.medicalclaims.util;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class MedicalUtils {

	public static final String POLICY_DETAILS_NOT_EXISTS = "Policy number is not valid";
	public static final String POLICY_DETAILS_EXISTS = "Policy number exists";
	public static final Integer POLICY_HTTP_SUCCESS = HttpStatus.OK.value();
	
}
