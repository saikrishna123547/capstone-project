package com.demo.maindao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.main.Admin;


public interface AdminDao extends JpaRepository<Admin, Long>{

	Admin findByName(String name);

	Admin findByPwd(String pwd);

	Admin findByNameAndPwd(String name, String pwd);
	
	
}

