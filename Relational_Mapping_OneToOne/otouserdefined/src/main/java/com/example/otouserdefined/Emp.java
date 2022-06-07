package com.example.otouserdefined;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Emp {
	@Id
	private int emp_id;
	private String name;
	@OneToOne
	@JoinColumn(name="roll_id")
	private Role roll_obj;
	public Emp()
	{
		
	}
	public Emp(int emp_id, String name, Role roll_obj) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.roll_obj = roll_obj;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Role getRoll_obj() {
		return roll_obj;
	}
	public void setRoll_obj(Role roll_obj) {
		this.roll_obj = roll_obj;
	}
}
