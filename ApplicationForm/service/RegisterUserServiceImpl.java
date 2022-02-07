package com.thoughtfocus.applicationform.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.thoughtfocus.applicationform.ApplicationFormApplication;
import com.thoughtfocus.applicationform.dto.RegisterUserDTO;
import com.thoughtfocus.applicationform.entity.RegisterFormEntity;
import com.thoughtfocus.applicationform.exception.PasswordNotMatchedException;
import com.thoughtfocus.applicationform.repositary.ApplicationFormRepositary;


@Service
public class RegisterUserServiceImpl implements RegisterUserService {
		
	private static Logger logger=LoggerFactory.getLogger(RegisterUserServiceImpl.class);
	
	@Autowired
	ApplicationFormRepositary repositary;
		
	public boolean ValidateRegisterData(RegisterUserDTO registerUserDTO) {
			
			try {
				if(registerUserDTO.getPassword().equals(registerUserDTO.getConfirmpassword())) {
					
					RegisterFormEntity entity=new RegisterFormEntity();
					BeanUtils.copyProperties(registerUserDTO, entity);
					repositary.save(entity);
					logger.info("User Data Saved Sucessfully");
					return true;
				}
				else{
					logger.info("Password-Not Matched");
					throw new PasswordNotMatchedException("Password-Not Matched");
				}
	
			}catch (Exception e) {
				logger.error(e.getMessage());
				logger.error(e.getStackTrace().getClass().getSimpleName());
			}
			return false;
		}

}
