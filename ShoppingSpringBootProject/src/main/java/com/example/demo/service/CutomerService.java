package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.CustormerRepository.CustomerRepository;
import com.example.demo.ItemRepository.ItemRepository;
import com.example.demo.OrderDetailsRepository.OrderDetailsRepository;
import com.example.demo.entity.CustomerEntity;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CutomerService 
	{
	@Autowired
	private CustomerRepository cus_repo;
	
	@Autowired   // dependency injection , no need to 
	private ItemRepository item_repo;
	
	private OrderDetailsRepository orderdetails_repo;
	
	public List<CustomerEntity> listAll(){
		return cus_repo.findAll();
	}
	//add customer
	public CustomerEntity addCustomer(CustomerEntity customer) {
		return cus_repo.save(customer);
	}
	
	//update customer
	@Transactional
	public Optional<CustomerEntity> updateCustomerById(Integer cus_Id, CustomerEntity updatedCustomer)
	{
		Optional<CustomerEntity> OptionalCustomer=cus_repo.findById(cus_Id);
		if(OptionalCustomer.isPresent()){
			CustomerEntity existingCustomer= OptionalCustomer.get();
			
			existingCustomer.setCus_name(updatedCustomer.getCus_name());
			existingCustomer.setCus_phone(updatedCustomer.getCus_phone());
			existingCustomer.setCus_email(updatedCustomer.getCus_email());
//			existingCustomer.setCus_name(updatedCusto/mer.getCus_name());
		}
		return cus_repo.findById(cus_Id);
	}
	
	//search customer
	 public CustomerEntity searchCustomerById(Integer cus_id) {
	        Optional<CustomerEntity> optionalCustomer = cus_repo.findById(cus_id);
	        return optionalCustomer.orElse(null);
	    }
	 
	 //delete customer
	 public Boolean deleteCustomer(Integer cus_id) {
		 if(cus_repo.existsById(cus_id)) {
		 cus_repo.deleteById(cus_id);
		 return true;
		 }
		return false; 
	 }
	 
	
	
	//searchItem
	/*public List<CustomerEntity> listAll(){
		return cus_repo.findAll();
	}

	public void orderItem(Item item) {
		repo.orderItem(item);
	}
		
	public void searchMall(Integer id) {
		repo.findById(id);
		
	}
	
	public void cancleOrder(Integer id) {
		repo.findById(id);
		
	}*/
	
	
}
