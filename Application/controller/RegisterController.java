package com.thoughtfocus.applicationform.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thoughtfocus.applicationform.ApplicationFormApplication;
import com.thoughtfocus.applicationform.dto.RegisterUserDTO;
import com.thoughtfocus.applicationform.entity.RegisterFormEntity;
import com.thoughtfocus.applicationform.service.RegisterUserService;

@RestController
public class RegisterController {
	
	private static Logger logger=LoggerFactory.getLogger(RegisterController.class);
	
	@Autowired
	RegisterUserService registerUserService;
	
	@PostMapping("/register")
	public String getRegisterDetails(@RequestBody RegisterUserDTO registerDto) {
		
		try {
			if(registerDto!=null) {
			boolean data=registerUserService.ValidateRegisterData(registerDto);
				if(data) {
					logger.info("Data is saved");
					return "Data is saved";
				}
				else {
					logger.info("Data is not Saved");
					return "Data is not saved";
				}
			}
		}
		catch(NullPointerException e) {
			 e.getStackTrace();
		}
		return "Data not found";
		
	}
}
