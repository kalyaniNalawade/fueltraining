package com.example.demomvcweb;

import java.util.List;

public class Student {
	private String fname;
	private String lname;
	private String email;
	private String gender;
	private List<String> plang;
	private String os;
	private List<String> city;
	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public List<String> getPlang() {
		return plang;
	}

	public void setPlang(List<String> plang) {
		this.plang = plang;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public List<String> getCity() {
		return city;
	}

	public void setCity(List<String> city) {
		this.city = city;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}
	

}
