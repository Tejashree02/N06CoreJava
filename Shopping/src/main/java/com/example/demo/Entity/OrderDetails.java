package com.example.demo.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderDetails {
	@Id
	private Integer orderId;
	private float orderTotal;
	private String orderPaymentMode;
	
	//ASSOCIATION
	@ManyToOne
	@JoinColumn(name="customerId")
	@JsonIgnore
	private Customer customer;
	
	
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public float getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(float orderTotal) {
		this.orderTotal = orderTotal;
	}
	public String getOrderPaymentMode() {
		return orderPaymentMode;
	}
	public void setOrderPaymentMode(String orderPaymentMode) {
		this.orderPaymentMode = orderPaymentMode;
	}
	@Override
	public String toString() {
		return "OrderDetails [orderId=" + orderId + ", orderTotal=" + orderTotal + ", orderPaymentMode="
				+ orderPaymentMode + ", customer=" +customer+ "]";
	}
	public OrderDetails(Integer orderId, float orderTotal, String orderPaymentMode) {
		super();
		this.orderId = orderId;
		this.orderTotal = orderTotal;
		this.orderPaymentMode = orderPaymentMode;
		this.customer = customer;
	}
	
	
	
	
	

}
