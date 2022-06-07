package com.example.demowebdiioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;


@Controller
public class StudentDetails {

	private Student stud;
	@Autowired
	public StudentDetails(Student stud) {
		this.stud=stud;
		
	}
	void setData() {
		stud.setId(100);
		stud.setName("BAC");
	}
	void shoData() {
		System.out.println(stud.getId());
		System.out.println(stud.getName());
		
	}


}
