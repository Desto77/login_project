package com.flemming.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flemming.domain.Session;
import com.flemming.service.Service;

@RestController
@RequestMapping("/api")
public class Controller implements Service {

	public String test() {
		return "test";
	}

	public String login() {
		Session session = new Session();
		return session.getSessionId();
	}

}
