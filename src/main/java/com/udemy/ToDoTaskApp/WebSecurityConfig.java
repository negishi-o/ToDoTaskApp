package com.udemy.ToDoTaskApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.udemy.ToDoTaskApp.service.LoginService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Autowired
    private LoginService loginService;
    
    @Autowired
    public void configureAuthenticationManager(AuthenticationManagerBuilder auth) throws Exception {
    	auth.userDetailsService(loginService)
    		.passwordEncoder(passwordEncoder());
    }
    @Bean
    public PasswordEncoder passwordEncoder() {
    	return new BCryptPasswordEncoder();
    }
        
	@Bean
	protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http
			.authorizeHttpRequests(request -> request
				.requestMatchers("/login/**").permitAll()
				.anyRequest().authenticated()
			)
			.formLogin(login -> login
					.loginPage("/login/top")
					.defaultSuccessUrl("/task/index")
					.failureUrl("/login/top")
					.permitAll());
		return http.build();
	}
}
