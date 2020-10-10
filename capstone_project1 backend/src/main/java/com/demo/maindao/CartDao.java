package com.demo.maindao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.main.Cart;


public interface CartDao extends JpaRepository<Cart, Long> {

}
