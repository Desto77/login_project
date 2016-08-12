package com.flemming.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface Service {

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test();
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login();
}
