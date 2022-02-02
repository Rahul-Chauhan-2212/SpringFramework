package com.spring.framework.springmvc.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
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
	
	@RequestMapping("/modelview")
	public ModelAndView modelview(ModelAndView modelView) {
		System.out.println("modelview Url method");
		modelView.addObject("name", "Rahul Chauhan");
		modelView.addObject("age", 26);
		List<String> tech = Arrays.asList("Java","SpringBoot","Hibernate","Angular");
		modelView.addObject("tech", tech);
		modelView.setViewName("modelview");
		return modelView;	
	}


}
