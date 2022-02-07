package com.thoughtfocus.applicationform.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.thoughtfocus.applicationform.dto.ForgotPasswordDTO;
import com.thoughtfocus.applicationform.entity.RegisterFormEntity;
import com.thoughtfocus.applicationform.repositary.ApplicationFormRepositary;

public class ForgotPasswordServiceImpl implements ForgotPasswordService {
	
	private static Logger logger = LoggerFactory.getLogger(ForgotPasswordServiceImpl.class);
	
	@Autowired
	ApplicationFormRepositary repositary;

	@Override
	public RegisterFormEntity validateUpdateDetails(ForgotPasswordDTO forgotPasswordDto) {

		RegisterFormEntity entity = null;
		try {
			if ((forgotPasswordDto.getEmail().endsWith("@gmail.com") && (forgotPasswordDto.getPassword().length() > 8))) {
				entity = repositary.getPasswordByEmail(forgotPasswordDto.getEmail());
				if (entity != null) {
					entity.setPassword(forgotPasswordDto.getPassword());
					repositary.save(entity);
					logger.info("Password Updated");
				} else {
					logger.info("Enter valid Email");
				}

			} else {
				logger.info("Invalid Details!!!! Email must ends with @gmail & Password must larger than 8 characters");

			}

		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return entity;
	}

}