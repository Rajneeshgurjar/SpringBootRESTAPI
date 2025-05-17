package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.serviceImpl.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserServiceImpl userService;

	@PostMapping("/register")
	public User createUser(@RequestBody User user) {

		return userService.createUser(user);
	}

	@GetMapping("/all")
	public List<User> getAllUser() {
		return userService.getAllUser();
	}

	@PutMapping("/update/{id}")
	public User updateUser(@PathVariable String id, @RequestBody User user) {
		return userService.updateUser(id, user);
	}

	@DeleteMapping("/delete/{id}")
	public User deleteUser(@PathVariable String id) {
		return userService.deleteUser(id);
	}

	@GetMapping("/find")
	public List<User> getUserByName(@RequestParam String name) {
		return userService.getUserByName(name);
	}

	@GetMapping("/login")
	public User getUserByUserNameAndPassword(@RequestParam String userName, @RequestParam String password) {
		return userService.getByUserNameAndPassword(userName, password);
	}
}
