package com.example.demowebdiioc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
@GetMapping("/")
public String greetings()
{
	return "Greetings from Vandu";
}
@GetMapping("/v")
public String greetToWorld()
	{
		return"Hello World!!!!";
	}


}
