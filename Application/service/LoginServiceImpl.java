package com.thoughtfocus.applicationform.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.thoughtfocus.applicationform.entity.RegisterFormEntity;
import com.thoughtfocus.applicationform.repositary.ApplicationFormRepositary;

public class LoginServiceImpl implements LoginService {

	private static Logger logger= LoggerFactory.getLogger(LoginServiceImpl.class);
	
	@Autowired
	ApplicationFormRepositary repositary;
	
	@Override
	public RegisterFormEntity logindetails(String username, String password) {
		
		RegisterFormEntity entity=null;
		try {
		if ((username!=null && username!="") && (password!=null)) {
			entity=repositary.getDetailsByUsernameAndPassword(username, password);
			if (entity!=null) {
				logger.info("Logging in...");
			}
		}else {
				logger.info("Invalid Username");
				
			} 
		}catch (Exception e) {
				logger.error(e.getMessage());
				return null;
		}
		return entity;
	}
}
