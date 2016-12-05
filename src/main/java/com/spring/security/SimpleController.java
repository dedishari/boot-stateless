package com.spring.security;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class SimpleController {

	@RequestMapping(value = "/hw", method = RequestMethod.GET)
	public String hello() {
		return "Hello World";
	}
}
