package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Customer;
import com.example.demo.Service.CustomerService;

@Controller
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	private CustomerService  customerservice;
	
	@PostMapping("/customers/save")
    public Customer save(@RequestBody Customer customer) {
        return customerservice.save(customer);
    }
	
	@PostMapping("/add")
	public ResponseEntity<Customer> addCustomer(Customer customer) {
		Customer addedCustomer = customerservice.save(customer);
		return new ResponseEntity<Customer>(addedCustomer, HttpStatus.CREATED);
	}
	
	@PutMapping("/update/{id}")
	public Optional<Customer> updateCustomerById(@RequestBody Customer customer, @PathVariable Integer Id) {
		return customerservice.updateCustomerById(Id,customer);
		
	}
	@DeleteMapping("/delete/{id}")
	public Boolean deleteCustomer(@PathVariable Integer id) {
		return customerservice.deleteCustomer(id);
	}
	
	 @GetMapping("/search")
	    public List<Customer> listAll() {
	        return customerservice.listAll();
	    }
}
