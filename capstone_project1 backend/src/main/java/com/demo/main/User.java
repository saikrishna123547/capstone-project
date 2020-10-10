package com.demo.main;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name= "users") 
@Setter
@Getter
@AllArgsConstructor
@ToString
public class User {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="emailid")
	private String emailid;
	
	@Column(name="pwd")
	private String pwd;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
}
    

