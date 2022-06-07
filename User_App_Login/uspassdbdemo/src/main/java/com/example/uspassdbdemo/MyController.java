package com.example.uspassdbdemo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {
	@Autowired
	UsersRepository userrepo;
	
	@PostMapping("/registeruser")
	public String Registeruser(@ModelAttribute Users user)
	{
		userrepo.save(user);
		return "index";
		
	}
	@PostMapping("/check")
	public String Loginuser(@ModelAttribute Users user)
	{
		String path="invalid";
		List<Users> list1=userrepo.findAll();
		String uname=user.getUname();
		String passw=user.getPass();
		for(Users ob:list1)
		{
			if(ob.getUname().equals(uname)&& ob.getPass().equals(passw))
			{
				path="valid";
				break;
			}
		}
		return path;
	
	}
	
	@GetMapping("/newuser")
	public String goToRegister()
	{
		return"register";
	}
}
