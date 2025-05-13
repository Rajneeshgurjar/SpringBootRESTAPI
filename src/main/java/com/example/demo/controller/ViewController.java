package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Controller
public class ViewController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/index")
	public String indexPage() {
		return "index";
	}
	
	@RequestMapping("/Registration")
	public String userRegistration(){
		
		return "UserRegistration";
	}
	
	@PostMapping("/register")
	public String createUser(@RequestParam String id,@RequestParam String name,@RequestParam String userName,@RequestParam String password) {
		User user=new User(id,name,userName,password);
		userService.createUser(user);
		return "redirect:/login";
	}
	
	@GetMapping("/authenticate")
	public String authenticate(@RequestParam String userName,@RequestParam String password) {
		User user=userService.getByUserNameAndPassword(userName, password);
		if(user !=null) {
		return "Home";
		}
		return "login";
	}
	
	@RequestMapping("/login")
	public String userLogin() {
		return "UserLogin";
	}
	
	@RequestMapping("/home")
	public String homePage() {
		return "Home";
	}
	
}
