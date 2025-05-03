package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@RequestMapping("/StudentName")
	public String getName(@RequestParam("un") String un) {
		return un;
	}
	
	@RequestMapping("/StudentId")
	public String getId(@RequestParam("uid") int uid) {
		return ""+uid;
	}
}
