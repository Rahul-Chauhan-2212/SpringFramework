package com.spring.mvc.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerClass {

	@ExceptionHandler({ NullPointerException.class, NumberFormatException.class })
	public String exceptionHandlerMethod(Model model, Exception e) {
		String msg = "";
		if (e.getClass().getSimpleName().compareTo(NullPointerException.class.getSimpleName()) == 0) {
			msg = "Null Pointer Exception Occured";
		} else if (e.getClass().getSimpleName().compareTo(NumberFormatException.class.getSimpleName()) == 0) {
			msg = "Number Format Exception Occured";
		}
		model.addAttribute("msg", msg);
		return "error";
	}

}