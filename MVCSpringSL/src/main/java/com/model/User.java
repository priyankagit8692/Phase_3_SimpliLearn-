package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class User {
	
	@Id
	private String name;
	private String password;
	private String email;
	private String mo;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(String name, String password, String email, String mo) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.mo = mo;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMo() {
		return mo;
	}


	public void setMo(String mo) {
		this.mo = mo;
	}
	
	
	

}
