package com.udemy.ToDoTaskApp.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.udemy.ToDoTaskApp.model.User;
import com.udemy.ToDoTaskApp.rep.UserRepository;

@Service
public class LoginService implements UserDetailsService{

	@Autowired
	UserRepository userRepository;
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = Optional.ofNullable(userRepository.findByAuthority(username))
				.orElseThrow(()-> new UsernameNotFoundException("対象ユーザーなし"));
		
		return user;
	}
	
	private Collection<GrantedAuthority> getAuthorities(User user) {
		return AuthorityUtils.createAuthorityList("ROLE_USER");
	}
}
