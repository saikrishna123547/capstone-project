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
@Table(name= "Admin") 
@Setter
@Getter
@AllArgsConstructor
@ToString
public class Admin {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private long id;
	@Column(name="Admin_Name")
	private String name;
	@Column(name="Admin_Pwd")
	private String pwd;
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}
	
	
}
    

