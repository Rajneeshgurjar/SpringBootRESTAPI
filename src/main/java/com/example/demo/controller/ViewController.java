package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

	@RequestMapping("/home")
	public String homePage() {
		return "index";
	}
	
	@RequestMapping("/Registration")
	public String ab() {
		return "index";
	}
	
}
