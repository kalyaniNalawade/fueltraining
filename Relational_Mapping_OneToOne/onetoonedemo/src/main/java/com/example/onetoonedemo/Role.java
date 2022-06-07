package com.example.onetoonedemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="role")
public class Role {
	@Id
	private int role_id;
	private String roll_desc;
	@OneToOne(mappedBy = "rollobj")
	private Emp emp;
	public Role()
	{
		
	}
	public Role(int role_id, String roll_desc) {
		super();
		this.role_id = role_id;
		this.roll_desc = roll_desc;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public String getRoll_desc() {
		return roll_desc;
	}
	public void setRoll_desc(String roll_desc) {
		this.roll_desc = roll_desc;
	}
	public Emp getEmp() {
		return emp;
	}
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	
	
}
