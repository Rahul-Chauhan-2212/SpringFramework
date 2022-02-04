package com.spring.framework.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {
	
	/*
	 * @RequestMapping("/one") public String One() {
	 * System.out.println("This is one handler"); return "redirect:/two"; }
	 */
	@RequestMapping("/one")
	public RedirectView One() {
		System.out.println("This is one handler");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("two");
		return redirectView;
	}
	
	@RequestMapping("/two")
	public String Two() {
		System.out.println("This is second handler");
		return "form";
	}

}
