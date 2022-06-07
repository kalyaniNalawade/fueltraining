package com.example.demoemppostman;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id 
	private int emid;
	private String name;
	private String add;
	private String email;
	private long phone;
	private int sal;
	
	public Employee()
	{
		
	}

	public Employee(int emid, String name, String add, String email, long phone, int sal) {
		super();
		this.emid = emid;
		this.name = name;
		this.add = add;
		this.email = email;
		this.phone = phone;
		this.sal = sal;
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

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
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

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	
	

}
