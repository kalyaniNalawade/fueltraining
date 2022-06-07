package com.example.demovaliduser;

import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {
	@Autowired
	UsersRepository userrepo;
	
	@PostMapping("createuser")
	public String createUser(@ModelAttribute Users users)
	{
		userrepo.save(users);
		return"index";
	}
	@GetMapping("/showall")
//	public String show(Model model)
//	{
//		List<Users> user=userrepo.findAll();
//		model.addAttribute("users", user);
//		return "result";
//	}
	public String get (Model model)
	{
		
		List<Users> user=userrepo.findAll();
		ListIterator<Users> ls=
		Users id1=user.get(0);
		
		return"";
	}

}
