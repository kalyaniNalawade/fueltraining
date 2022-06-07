package com.example.demomoviesportssession;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsersController {
	@GetMapping("/mainpage")
	public String mainPage(@RequestParam String uname,HttpSession session)
	{
		session.setAttribute("fname", uname);
		return"main";
	}
	
	@GetMapping("/moviepage")
	public String MoviePage(HttpSession session)
	{
		String n=(String)session.getAttribute("fname");
		System.out.println("Name of the user watching movie is: "+n);
		return "movie";
	}
	
	@GetMapping("/sportspage")
	public String sportsPage(HttpSession session)
	{
		String n=(String)session.getAttribute("fname");
		System.out.println("Name of the user watching Sports is: "+n);
		return "sports";
	}

}
