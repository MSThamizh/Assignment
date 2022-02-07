package com.thoughtfocus.applicationform.service;


import com.thoughtfocus.applicationform.dto.ForgotPasswordDTO;
import com.thoughtfocus.applicationform.entity.RegisterFormEntity;

public interface ForgotPasswordService {
	
	public RegisterFormEntity validateUpdateDetails(ForgotPasswordDTO forgotPasswordDto);	
}
