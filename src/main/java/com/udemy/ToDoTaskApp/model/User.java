package com.udemy.ToDoTaskApp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable=false, columnDefinition="varchar(50)")
	private String username;
	@Column(nullable=false, columnDefinition="varchar(70)")
	private String email;
	@Column(nullable=false, columnDefinition="varchar(60)")
	private String password;
	@Column(nullable=false, columnDefinition="tinyint(1)")
	private Integer enabled;
	@Column(nullable=false, columnDefinition="varchar(50)")
	private String authority;
	@Column(columnDefinition="varchar(255)")
	private String tempkey;
	
	public User() {
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getEnabled() {
		return enabled;
	}
	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	public String getTempkey() {
		return tempkey;
	}
	public void setTempkey(String tempkey) {
		this.tempkey = tempkey;
	}
	
	
}
