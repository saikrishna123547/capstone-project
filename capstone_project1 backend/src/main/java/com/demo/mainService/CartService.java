package com.demo.mainService;

import java.util.List;

import com.demo.main.Cart;

public interface CartService {

	
	public Cart addCart(Cart cart);
	public void deleteCartById(Long id);
	public List<Cart> getAllCart();
}
