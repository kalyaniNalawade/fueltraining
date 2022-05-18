package com.example.demoonetomany;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cart {
	@Id
	private int cart_id;
	private String name;
	@OneToMany(mappedBy = "Cartobj")
	private Set<Item> item;
	 
	public Cart()
	{
		
	}

	public Cart(int cart_id, String name) {
		super();
		this.cart_id = cart_id;
		this.name = name;
	}

	public int getCart_id() {
		return cart_id;
	}

	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Item> getItem() {
		return item;
	}

	public void setItem(Set<Item> item) {
		this.item = item;
	}

	
	
	
	

}
