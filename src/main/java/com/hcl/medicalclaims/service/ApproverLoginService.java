package com.hcl.medicalclaims.service;

import com.hcl.medicalclaims.dto.ApproverLoginRequestDto;
import com.hcl.medicalclaims.dto.ApproverLoginResponseDto;
/**
 * @author priyanka
 *
 */
public interface ApproverLoginService {
public ApproverLoginResponseDto approverLogin(ApproverLoginRequestDto approverLoginRequestDto);
}
