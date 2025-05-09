package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.repository.UserRepo;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;

	@Override
	public User createUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public List<User> getAllUser() {
		return userRepo.findAll();
	}

	@Override
	public User updateUser(String id, User user) {

		
		 User user1=userRepo.findById(id).get(); 
		 if(user1 != null) {
			 user1.setUserName(user.getUserName());
			 return userRepo.save(user1); 
		 }
		 
		throw new UserNotFoundException("Please Provide Valid User for Update");
	}

	@Override
	public User deleteUser(String id) {
		User user = userRepo.findById(id).get();
		if (user != null) {
			userRepo.delete(user);
			return user;
		}
		throw new UserNotFoundException("Please Provide Valid id for delete");
	}

}
