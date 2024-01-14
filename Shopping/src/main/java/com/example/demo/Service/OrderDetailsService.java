package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Customer;
import com.example.demo.Entity.OrderDetails;
import com.example.demo.Repository.CustomerRepository;
import com.example.demo.Repository.OrderDetailsRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class OrderDetailsService {
	
	@Autowired
	private CustomerRepository customerRepo;
	
	@Autowired
	private OrderDetailsRepository orderDetailsRepo;
	
	
	//add order
			public OrderDetails addOrder(OrderDetails orderdetails) {
				return orderDetailsRepo.save(orderdetails);
			}
			

			//update Order
			@Transactional
			public Optional<OrderDetails> updateOrderById(Integer orderId, OrderDetails updatedOrder)
			{
				Optional<OrderDetails> OptionalOrderDetails=orderDetailsRepo.findById(orderId);
				if(OptionalOrderDetails.isPresent()){
					OrderDetails existingOrder= OptionalOrderDetails.get();
					
					existingOrder.setOrderTotal(updatedOrder.getOrderTotal());
					existingOrder.setOrderPaymentMode(updatedOrder.getOrderPaymentMode());
					
				}
				return orderDetailsRepo.findById(orderId);
			}
			
			//Search order
			public OrderDetails searchOrdeById(Integer orderId) {
		        Optional<OrderDetails> optionalOrderDetails = orderDetailsRepo.findById(orderId);
		        return optionalOrderDetails.orElse(null);
		    }
			
			
			//delete order
			public Boolean deleteOrder(Integer orderId) {
				 if(orderDetailsRepo.existsById(orderId)) {
				 orderDetailsRepo.deleteById(orderId);
				 return true;
				 }
				return false; 
			 }
		

}
