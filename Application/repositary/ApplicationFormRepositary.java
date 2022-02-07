package com.thoughtfocus.applicationform.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thoughtfocus.applicationform.entity.RegisterFormEntity;

public interface ApplicationFormRepositary extends JpaRepository<RegisterFormEntity, Integer> {


public RegisterFormEntity getDetailsByUsernameAndPassword(String username,String password);

public RegisterFormEntity getPasswordByEmail(String email);
	
}
