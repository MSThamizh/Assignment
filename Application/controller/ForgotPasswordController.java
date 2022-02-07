package com.thoughtfocus.applicationform.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thoughtfocus.applicationform.dto.ForgotPasswordDTO;
import com.thoughtfocus.applicationform.entity.RegisterFormEntity;
import com.thoughtfocus.applicationform.service.ForgotPasswordService;

@RestController
public class ForgotPasswordController {

	private static Logger logger = LoggerFactory.getLogger(ForgotPasswordController.class);

	
	private  ForgotPasswordService forgotPasswordService;

	@PostMapping("/forgotpassword")
	public String getUpdateDetails(@RequestBody ForgotPasswordDTO forgotPasswordDto) {

		try {
			if (forgotPasswordDto.getEmail() != null && forgotPasswordDto.getPassword() != null) {

				RegisterFormEntity entity = forgotPasswordService.validateUpdateDetails(forgotPasswordDto);
				if (entity != null) {
					logger.info("Password Updated Sucessfully");
				} else {
					logger.info("Enter valid Email");
					return "Password Not Updated";
				}

			} else {
				logger.info("Enter the required details");
			}
		} catch (NullPointerException e) {
			e.printStackTrace();

		}
		return "Password Updated";

	}

}