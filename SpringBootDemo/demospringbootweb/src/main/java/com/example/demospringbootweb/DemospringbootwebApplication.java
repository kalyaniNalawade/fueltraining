package com.example.demospringbootweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemospringbootwebApplication {

	public static void main(String[] args) {
		ApplicationContext context;
		context=SpringApplication.run(DemospringbootwebApplication.class, args);
		MyController m1;
		m1=context.getBean(MyController.class);
		
		
	}

}
