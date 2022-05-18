package com.example.demoweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/")
	public String sayHello() {
		return "Hello from spring boot";
	}
@GetMapping("/hello")
      public String getMSg() {
	  return "Hello World";
	
}
}
