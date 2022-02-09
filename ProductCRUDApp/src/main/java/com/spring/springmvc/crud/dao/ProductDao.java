package com.spring.springmvc.crud.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.spring.springmvc.crud.entity.Product;

@Component
public class ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public void createProduct(Product product) {
		this.hibernateTemplate.save(product);
	}

	public List<Product> getAllProducts() {
		List<Product> list = this.hibernateTemplate.loadAll(Product.class);
		return list;

	}

	public Product getSingleProducts(int id) {
		Product product = this.hibernateTemplate.load(Product.class, id);
		return product;

	}

	@Transactional
	public void deleteProduct(int id) {
		Product product = this.hibernateTemplate.load(Product.class, id);
		this.hibernateTemplate.delete(product);
	} 

	@Transactional
	public void updateProduct(Product product) {
		this.hibernateTemplate.update(product);
		;
	}

}
