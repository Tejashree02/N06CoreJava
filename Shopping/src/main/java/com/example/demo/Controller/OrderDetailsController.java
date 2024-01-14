package com.example.demo.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Customer;
import com.example.demo.Entity.OrderDetails;
import com.example.demo.Service.OrderDetailsService;

@RestController
@RequestMapping("/orderdetails")
public class OrderDetailsController {

	@Autowired
	private OrderDetailsService orderdetailsservice;
	
	@GetMapping
	public OrderDetails addOrder(OrderDetails orderdetails) {
		return orderdetailsservice.addOrder(orderdetails);
	}

	@PutMapping("/orderdetails/{id}")
	public Optional<OrderDetails> updateOrderById(@RequestBody OrderDetails updatedOrder, @PathVariable Integer Id) {
		return orderdetailsservice.updateOrderById(Id,updatedOrder);
		
	}
 // search order remaining.
	
	@DeleteMapping("/orderdetails/{id}")
	public Boolean deleteOrder(@PathVariable Integer id) {
		return orderdetailsservice.deleteOrder(id);
	}

}
