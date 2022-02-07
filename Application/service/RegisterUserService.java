package com.thoughtfocus.applicationform.service;

import com.thoughtfocus.applicationform.dto.RegisterUserDTO;

public interface RegisterUserService {

	 boolean ValidateRegisterData(RegisterUserDTO registerUserDTO);

}
