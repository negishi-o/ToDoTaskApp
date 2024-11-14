package com.udemy.ToDoTaskApp.form;

import jakarta.validation.constraints.Size;

public class LoginForm {


	private String password;
	

	@Size(min=1, max=50, message="50文字以下で入力して下さい")
	private String authority;

	public LoginForm() {
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
}
