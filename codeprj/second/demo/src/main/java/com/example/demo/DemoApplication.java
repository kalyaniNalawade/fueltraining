package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		ApplicationContext Context;
        Context = SpringApplication.run(DemoApplication.class, args);
        StudentRepository stud = Context.getBean(StudentRepository.class);
        //create row
        Student st = new Student(200, "ccc");
        stud.save(st);
        System.out.println("record saved");
       
	}
}


