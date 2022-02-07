package com.thoughtfocus.applicationform.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RegisterUserDTO {
	private String username;
	private String email;
	private String password;
	private String confirmpassword;
	private long mobileno;
}
