package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.main.Cart;
import com.demo.mainService.CartService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class CartController {

	
	@Autowired
	private CartService service;

@PostMapping("/Cart")
	public Cart addCart(@RequestBody Cart cart) {
		return service.addCart(cart);
	}

@DeleteMapping("/Cart/{id}")
	public void deleteCartById(@PathVariable Long id) {
		service.deleteCartById(id);
	}

@GetMapping("/Carts")
	public List<Cart> getAllCart() {

		return service.getAllCart();
	}

}

