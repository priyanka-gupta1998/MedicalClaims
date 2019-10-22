package com.hcl.medicalclaims.constants;

/**
 * @author srinivas 
 * used to maintain constants
 */
public class MedicalClaimsConstants {
	public static final int POST_STATUS_CODE = 201;
	public static final String CLAIM_STATUS = "submitted";

	public static final String FILE_SUCCESSFUL_UPLOAD_MSG = "File has been uploaded successfully";
	public static final String FILE_PATH = "C:/Users/User1/Srinivasa/Work/git-projects/medical-claims/MedicalClaims/src/main/resources/uploaded-files/";

	public static final String ADD_CLAIM_SUCCESS = "Claim has been submitted successfully";
	public static final String FILE_UPLOAD_FAILED_EXCEPTION = "File upload failed";
	public static final String POLICY_NOT_FOUND_EXCEPTION = "Policy not available";
	public static final String HOSPITAL_NOT_FOUND_EXCEPTION = "Hospital is not in the Network list";

	/**
	 * private constructor
	 */
	private MedicalClaimsConstants() {
		super();
	}

}
