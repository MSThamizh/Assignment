package com.thoughtfocus.applicationform.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thoughtfocus.applicationform.entity.RegisterFormEntity;
import com.thoughtfocus.applicationform.exception.LoginDetailsRequiredNullException;
import com.thoughtfocus.applicationform.service.LoginService;


public class LoginContoller {

	private static Logger logger = LoggerFactory.getLogger(LoginContoller.class);
	
	@Autowired
	LoginService loginservice;
	
	@GetMapping("/login")
	public RegisterFormEntity getLoginDetails(@RequestParam String username, @RequestParam String password) {
		RegisterFormEntity entity=null;
		try {
		if ((username!=null && username!="") && (password!=null)) {
			entity=loginservice.logindetails(username, password);
			if (entity!=null) {
				logger.info("Welcome.....");
			}
			else {
				logger.info("User-Not Found");
			}	
		}else {
				logger.info("Username & Password required");
				throw new LoginDetailsRequiredNullException("Username & Password required");
			}
		}catch (Exception e) {
			logger.error(e.getMessage());
			
		}
		return entity;
	}
}
