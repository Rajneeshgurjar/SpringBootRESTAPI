package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
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
	public String getId(@RequestParam(required = false) String id) {
		List<String> al = new ArrayList<>();
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		al.add("5");
		al.add("6");
		al.add("7");
		if(id !=null) {
			for(String s:al) {
				if(s.equals(id)) return s;
		}
			return "";
		}	
		return al.toString();
	}    
	
	@RequestMapping("/Student/{id}/{name}")
	public String getStudentInfo(@PathVariable String id, @PathVariable String name) {	
		return "id = "+id+"  name = "+name;
	}
}
