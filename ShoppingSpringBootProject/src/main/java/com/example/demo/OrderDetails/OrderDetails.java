package com.example.demo.OrderDetails;

import java.util.List;

import com.example.demo.entity.CustomerEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class OrderDetails {
	@Id
	private Integer orderId;
	private float total;
	private String payment_mode;
	
	
	//ASSOCIATION
	@ManyToOne
	@JoinColumn(name="cus_Id")
	@JsonIgnore
	private CustomerEntity customerentity;
	
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public CustomerEntity getCus_id() {
		return customerentity;
	}
	public void setCus_id(CustomerEntity cus_id) {
		this.customerentity = cus_id;
	}
	public String getPayment_mode() {
		return payment_mode;
	}
	public void setPayment_mode(String payment_mode) {
		this.payment_mode = payment_mode;
	}
	@Override
	public String toString() {
		return "OrderDetails [orderId=" + orderId + ", total=" + total + ", cus_id=" + customerentity + ", payment_mode="
				+ payment_mode + "]";
	}
	public OrderDetails(Integer orderId, float total, CustomerEntity customerentity, String payment_mode) {
		super();
		this.orderId = orderId;
		this.total = total;
		this.customerentity= customerentity;
		this.payment_mode = payment_mode;
	} 

	
	
}
