package com.demo.mainServiceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.main.Cart;
import com.demo.mainService.CartService;
import com.demo.maindao.CartDao;
@Service
public class CartServiceimpl implements CartService{

	@Autowired
	private  CartDao dao;

	@Override
	public Cart addCart(Cart cart) {
		
		return dao.save(cart);
	}

	@Override
	public void deleteCartById(Long id) {
	 dao.deleteById(id);
		
	}

	@Override
	public List<Cart> getAllCart() {
		
		return dao.findAll();
	}
	}