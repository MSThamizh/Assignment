package com.thoughtfocus.applicationform.service;

import com.thoughtfocus.applicationform.entity.RegisterFormEntity;

public interface LoginService {

		public RegisterFormEntity logindetails(String username, String password);
}