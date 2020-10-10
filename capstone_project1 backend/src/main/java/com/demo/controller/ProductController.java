package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.main.Product;
import com.demo.mainService.ProductService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	@GetMapping("/Product/{id}")
	public Product getProductById(@PathVariable long id) {

		return productService.getProductById(id);
	}

	@PutMapping("/Product")
	public Product updateProduct(@RequestBody Product product) {
		
		return productService.updateProduct(product);
	}

	@DeleteMapping("/Product/{id}")
	public void deleteProduct(@PathVariable long id) {
		productService.deleteProduct(id);
		
	}

	@GetMapping("/Products")
	public List<Product> getAllProducts() {
		
		return productService.getAllProducts();
	}

	@PostMapping("/Product")
	public Product addProduct(@RequestBody Product product) {
		
		return productService.addProduct(product);
	} 



}
