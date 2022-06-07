package com.example.demomoviesports;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {
	@GetMapping("/mainpage")
	public String mainPage()
	{
		return"main";
	}
	
	@GetMapping("/moviepage")
	public String MoviePage()
	{
		return "movie";
	}
	
	@GetMapping("/sportspage")
	public String sportsPage()
	{
		return "sports";
	}

}
