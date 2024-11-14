package com.udemy.ToDoTaskApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.udemy.ToDoTaskApp.form.LoginForm;

@Controller
@RequestMapping("/login")
public class LoginController {

	@GetMapping("/top")
	public String index(LoginForm loginForm,
			Model model) {
		return "/login/top";
	}
	
	@PostMapping("/auth")
	public String auth(@Validated LoginForm loginForm,
			BindingResult result,
			Model model) {
		
			if(result.hasErrors()) {
				return "/login/top";
			}
		return "redirect:/task/index";
	}
}
