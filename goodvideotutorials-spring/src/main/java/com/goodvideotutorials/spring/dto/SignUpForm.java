package com.goodvideotutorials.spring.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class SignUpForm {
	
	@NotNull
	@Size(min=1, max=255)
	@Pattern(regexp="[A-Za-z0-9._%-+]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}",message="Please provide a valid email address")
	
	private String email;
	@NotNull(message="{nameError}")
	@Size(min=1, max=20,message="Characters must be a minimum of 1 and maximum of 20")
	private String name;
	@NotNull(message="Please enter a password")
	@Size(min=6, max=20,message="Characters must be a minimum of 1 and maximum of 20")
	private String password;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "SignUpForm [email=" + email + ", name=" + name + ", password=" + password + "]";
	}
	
	

}
