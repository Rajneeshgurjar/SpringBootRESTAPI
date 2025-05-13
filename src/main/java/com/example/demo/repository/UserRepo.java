package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,String>{
	public List<User> findByName(String name);
	public User findByUserNameAndPassword(String userName, String password);
}
