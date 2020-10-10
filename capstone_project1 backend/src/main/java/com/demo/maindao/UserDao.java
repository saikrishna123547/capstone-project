package com.demo.maindao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.main.User;

public interface UserDao extends JpaRepository<User, Long>{
	
	public User findByName(String name);
	public User findByPwd(String pwd);
	public User findByEmailid(String emailid);
	public User findByEmailidAndPwd(String emailid,String pwd);
}

