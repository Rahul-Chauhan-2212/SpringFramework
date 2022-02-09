package com.spring.springmvc.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.springmvc.crud.dao.ProductDao;
import com.spring.springmvc.crud.entity.Product;

@Controller
public class HomeController {
	@Autowired
	private ProductDao productDao;

	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@RequestMapping("/addProduct")
	public String addProduct() {
		return "add_product";
	}
	
	@RequestMapping("/productAdd")
	public String addProductToList(@ModelAttribute("product") Product product) {
		System.out.println("Adding product to db");
		productDao.createProduct(product);
		return "redirect:/";
	}

}
