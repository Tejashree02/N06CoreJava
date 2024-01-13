package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CustomerEntity;
import com.example.demo.service.CutomerService;

@RestController
//@RequestMapping("/customers")
public class CustomerController {
	@Autowired 
	private CutomerService customerservice;
	@GetMapping("/customers")
	public List<CustomerEntity> list()
	{
		return customerservice.listAll();
	}
	@PostMapping("/customers/add")
	public CustomerEntity add()
	{
		return customerservice.addCustomer(null);
	}	
}