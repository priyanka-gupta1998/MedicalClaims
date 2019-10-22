package com.hcl.medicalclaims.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.hcl.medicalclaims.constants.MedicalClaimsConstants;
import com.hcl.medicalclaims.dto.FileUploadResponseDTO;
import com.hcl.medicalclaims.exception.FileUploadfailedException;

/**
 * @author srinivas
 *
 */
@RestController
@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
public class FileUploadController {

	@SuppressWarnings("resource")
	@RequestMapping(value = "/upload", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public FileUploadResponseDTO fileUpload(@RequestParam("file") MultipartFile file)
			throws IOException, FileUploadfailedException {
		String path = MedicalClaimsConstants.FILE_PATH;
		String fileName = path + file.getOriginalFilename();
		File convertFile = new File(fileName);
		convertFile.createNewFile();
		FileOutputStream fileOut = new FileOutputStream(convertFile);
		if (!file.isEmpty()) {
			fileOut.write(file.getBytes());
			FileUploadResponseDTO fileUploadResponse = new FileUploadResponseDTO();
			fileUploadResponse.setStatusCode(201);
			fileUploadResponse.setMessage(MedicalClaimsConstants.FILE_SUCCESSFUL_UPLOAD_MSG);
			fileUploadResponse.setFilePath(fileName);
			return fileUploadResponse;
		} else {
			throw new FileUploadfailedException(MedicalClaimsConstants.FILE_UPLOAD_FAILED_EXCEPTION);
		}
	}

}
