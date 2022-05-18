package com.example.demoweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class DemowebApplication {

	public static void main(String[] args) {

		ApplicationContext context;
		context=SpringApplication.run(DemowebApplication.class, args);
		MyController m1;
		m1=context.getBean(MyController.class);
		
	} 

}
