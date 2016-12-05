package com.spring.security;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secure")
public class SecureController {

	@RequestMapping(value = "/hel", method = RequestMethod.GET)
	public String helloSecure() {
		return "this is secure";
	}
}
