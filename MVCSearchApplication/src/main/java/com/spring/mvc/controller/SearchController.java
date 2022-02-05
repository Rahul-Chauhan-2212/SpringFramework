package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/home")
	public String home() {
		System.out.println("Going to home view");
		return "home";
	}

	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String querybox) {
		System.out.println("Going to Google search");
		RedirectView redirectView = new RedirectView();
		if (querybox == null || querybox.isBlank()) {
			redirectView.setUrl("home");
			return redirectView;
		}
		String url = "https://www.google.com/search?q=" + querybox;
		redirectView.setUrl(url);
		return redirectView;
	}
}
