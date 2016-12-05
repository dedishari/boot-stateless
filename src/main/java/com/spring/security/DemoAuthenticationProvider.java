package com.spring.security;

import org.omg.CORBA.UnknownUserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class DemoAuthenticationProvider implements AuthenticationProvider {

	private final UserRepository userRepository;

	@Autowired
	public DemoAuthenticationProvider(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		DemoAuthenticationToken demoAuthentication = (DemoAuthenticationToken) authentication;
		AppUser user = userRepository.findOne(demoAuthentication.getUid());

		if (user == null) {
			try {
				throw new UnknownUserException();
			} catch (UnknownUserException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return user;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return DemoAuthenticationToken.class.isAssignableFrom(authentication);
	}

}
