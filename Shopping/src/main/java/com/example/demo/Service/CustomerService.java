package com.example.demo.Service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Customer;
import com.example.demo.Repository.CustomerRepository;
import com.example.demo.Repository.OrderDetailsRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepo;
	
	@Autowired
	private OrderDetailsRepository orderDetailsRepo;
	
	//save
	public Customer save(Customer customer) {
        return customerRepo.save(customer);
    } 
	
	//list
	public List<Customer> listAll(){
		return customerRepo.findAll();
	}
	
	//add customer
		public Customer addCustomer(Customer customer) {
		try {
            // Additional logic if needed
			return customerRepo.save(customer);		            
        } catch (Exception e) {
            // Log the exception for debugging
            e.printStackTrace();
            throw e; // Re-throw the exception to be handled by the controller
        }
		}

		//update customer
		@Transactional
		public Optional<Customer> updateCustomerById(Integer customerId, Customer updatedCustomer)
		{
			Optional<Customer> OptionalCustomer=customerRepo.findById(customerId);
			if(OptionalCustomer.isPresent()){
				Customer existingCustomer= OptionalCustomer.get();
				existingCustomer.setCustomerId(updatedCustomer.getCustomerId());
				existingCustomer.setCustomerName(updatedCustomer.getCustomerName());
				existingCustomer.setCustomerPhone(updatedCustomer.getCustomerPhone());
				existingCustomer.setCustomeremail(updatedCustomer.getCustomeremail());
			}
			return customerRepo.findById(customerId);
		}
		
		//Search Customer
		public Customer searchCustomerById(Integer customerId) {
	        Optional<Customer> optionalCustomer = customerRepo.findById(customerId);
	        return optionalCustomer.orElse(null);
	    }
		
		
		//delete customer
		public Boolean deleteCustomer(Integer customerId) {
			 if(customerRepo.existsById(customerId)) {
			 customerRepo.deleteById(customerId);
			 return true;
			 }
			return false; 
		 }
	

}
