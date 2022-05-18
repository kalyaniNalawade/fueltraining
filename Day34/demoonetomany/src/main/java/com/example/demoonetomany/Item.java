package com.example.demoonetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Item {
	@Id
	private int item_id;
	private String item_desc;
	private int item_cost;
	@ManyToOne
	@JoinColumn(name = "cart_id")
	private Cart cart_obj;

	public Item() {
		
	}
	public Item(int item_id, String item_desc, int item_cost, Cart cart_obj) {
		super();
		this.item_id = item_id;
		this.item_desc = item_desc;
		this.item_cost = item_cost;
		this.cart_obj = cart_obj;
		
	}
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public String getItem_desc() {
		return item_desc;
	}
	public void setItem_desc(String item_desc) {
		this.item_desc = item_desc;
	}
	public int getItem_cost() {
		return item_cost;
	}
	public void setItem_cost(int item_cost) {
		this.item_cost = item_cost;
	}
	public Cart getCart_obj() {
		return cart_obj;
	}
	public void setCart_obj(Cart cart_obj) {
		this.cart_obj = cart_obj;
	}
	
	
	

}
