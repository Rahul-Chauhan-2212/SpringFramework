package com.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/custom")
public class CustomLoginController {

	@GetMapping("/login")
	public String login() {
		return "login";
	}

}
