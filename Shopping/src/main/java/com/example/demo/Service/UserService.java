package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Customer;
import com.example.demo.Entity.OrderDetails;
import com.example.demo.Entity.User;
import com.example.demo.Repository.CustomerRepository;
import com.example.demo.Repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	private CustomerRepository customerRepo;
	
	//add customer
			public User addNewUser(User user) {
				return userRepo.save(user);
			}
		//update user	
			@Transactional
			public Optional<User> updateUser(Integer userId, User updatedUser)
			{
				Optional<User> OptionalUser=userRepo.findById(userId);
				if(OptionalUser.isPresent()){
					User existingUser= OptionalUser.get();
					
					existingUser.setUserUserName(updatedUser.getUserUserName());
					existingUser.setUserPassword(updatedUser.getUserPassword());
					existingUser.setUserType(updatedUser.getUserType());
					
				}
				return userRepo.findById(userId);
			}
			
			//delete User
		
			public Boolean deleteUser(Integer userId) {
				if(userRepo.existsById(userId))
				{
					userRepo.deleteById(userId);
					return true;
				}
				return false;
			}
			
}
