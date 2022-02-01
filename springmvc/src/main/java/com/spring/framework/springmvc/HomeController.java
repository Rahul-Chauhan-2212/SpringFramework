package com.spring.framework.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("Home Url method");
		return "home";	
	}
	
	
	@RequestMapping("/about")
	public String about(Model model) {
		System.out.println("About Url method");
		model.addAttribute("name", "Rahul Chauhan");
		return "about";	
	}

}
