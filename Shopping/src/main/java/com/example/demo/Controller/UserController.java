package com.example.demo.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Customer;
import com.example.demo.Entity.User;
import com.example.demo.Service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userservice;
	@PostMapping
	public User addNewUser(@RequestBody User user) {
		return userservice.addNewUser(user);
		
	}
	@PutMapping("/user/{id}")
	public Optional<User> updateUser(@RequestBody User user, @PathVariable Integer Id) {
		return userservice.updateUser(Id, user);
		
	}
	
	@DeleteMapping("/user/{id}")
	public Boolean deleteUser(@PathVariable Integer userId) {
		return userservice.deleteUser(userId);
	}

}
