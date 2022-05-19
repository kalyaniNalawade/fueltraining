package com.example.demomethods2;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employ {
	@Id
	private int emid;
	private String name;
	private String address;
	private String email;
	private long phone;
	private int salary;
	public Employ() {
		
	}
	public Employ(int emid, String name, String address, String email, long phone, int salary) {
		super();
		this.emid = emid;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.salary = salary;
	}
	public int getEmid() {
		return emid;
	}
	public void setEmid(int emid) {
		this.emid = emid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	

}
