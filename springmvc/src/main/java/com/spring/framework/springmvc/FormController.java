package com.spring.framework.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/form")
public class FormController {

	@RequestMapping("/loginform")
	public String loginForm() {
		System.out.println("Inside loginForm method");
		return "form";
	}

	@RequestMapping(path = "/submit", method = RequestMethod.POST)
	public ModelAndView submit(@RequestParam String email, @RequestParam String password, @RequestParam Boolean check,
			ModelAndView model) {

		System.out.println("Inside submit method");
		System.out.println("The email is " + email);
		System.out.println("The password is " + password);
		System.out.println("The checkbox is " + check);
		model.addObject("email", email);
		model.addObject("password", password);
		model.addObject("check", check);
		model.setViewName("formdata");
		return model;

	}

}
