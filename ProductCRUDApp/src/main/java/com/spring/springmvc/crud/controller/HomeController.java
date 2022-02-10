package com.spring.springmvc.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.springmvc.crud.dao.ProductDao;
import com.spring.springmvc.crud.entity.Product;

@Controller
public class HomeController {
	@Autowired
	private ProductDao productDao;

	@RequestMapping("/")
	public String home(Model model) {
		List<Product> productList = productDao.getAllProducts();
		System.out.println(productList);
		model.addAttribute("productList", productList);
		return "home";
	}

	@RequestMapping("/addProduct")
	public String addProduct() {
		return "add_product";
	}

	@RequestMapping(path = "/saveOrUpdate", method = RequestMethod.POST)
	public String saveOrUpdateProductToList(@ModelAttribute("product") Product product) {
		System.out.println("Adding product to db");
		productDao.createOrUpdateProduct(product);
		return "redirect:/";
	}

	@RequestMapping("/updateProduct/{id}")
	public String updateProduct(@PathVariable("id") int id, Model model) {
		System.out.println("update product to db" + id);
		Product product = productDao.getSingleProducts(id);
		System.out.println("Product-->" + product);
		model.addAttribute("product", product);
		return "update_Product";
	}

	@RequestMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable("id") int id) {
		System.out.println("Delete product to db");
		productDao.deleteProduct(id);
		return "redirect:/";
	}

}
