package com.spring.security;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

@Entity
public class AppUser implements Authentication {

	@Id
	@GeneratedValue
	private Long id;

	private String userName;

	private String password;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return getUserName();
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getCredentials() {
		// TODO Auto-generated method stub
		return getPassword();
	}

	@Override
	public Object getDetails() {
		// TODO Auto-generated method stub
		return getUserName();
	}

	@Override
	public Object getPrincipal() {
		// TODO Auto-generated method stub
		return getUserName();
	}

	@Override
	public boolean isAuthenticated() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException {
		// TODO Auto-generated method stub

	}

}
