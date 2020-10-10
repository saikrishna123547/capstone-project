package com.demo.main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Cart")
@Setter
@Getter
@AllArgsConstructor
@ToString
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	@ManyToOne(fetch =FetchType.EAGER)
	private Product product;
	
	
	public Cart() {
		// TODO Auto-generated constructor stub
	}
}

