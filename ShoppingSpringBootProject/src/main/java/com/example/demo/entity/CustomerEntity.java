package com.example.demo.entity;

import java.util.List;

import com.example.demo.OrderDetails.OrderDetails;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class CustomerEntity {
@Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cus_id;
	private String cus_name;
	private Integer cus_phone;
	private String cus_email;

	// ASSOCIATION
	@OneToMany(mappedBy="customerEntity", cascade=CascadeType.ALL)
	private List<OrderDetails> orderdetails;
	
	
	
	// getter setter tostring constructor
	
	public Integer getCus_id() {
		return cus_id;
	}

	public void setCus_id(Integer cus_id) {
		this.cus_id = cus_id;
	}

	public String getCus_name() {
		return cus_name;
	}

	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
	}

	public Integer getCus_phone() {
		return cus_phone;
	}

	public void setCus_phone(Integer cus_phone) {
		this.cus_phone = cus_phone;
	}

	public String getCus_email() {
		return cus_email;
	}

	public void setCus_email(String cus_email) {
		this.cus_email = cus_email;
	}
//
	public List<OrderDetails> getOrderdetails() {
		return orderdetails;
	}

	public void setOrderdetails(List<OrderDetails> orderdetails) {
		this.orderdetails = orderdetails;
	}

	@Override
	public String toString() {
		return "CustomerEntity [cus_id=" + cus_id + ", cus_name=" + cus_name + ", cus_phone=" + cus_phone
				+ ", cus_email=" + cus_email + ", orderdetails=" + orderdetails + "]";
	}

	public CustomerEntity(Integer cus_id, String cus_name, Integer cus_phone, String cus_email,
			List<OrderDetails> orderdetails, OrderDetails orderdetail) {
		super();
		this.cus_id = cus_id;
		this.cus_name = cus_name;
		this.cus_phone = cus_phone;
		this.cus_email = cus_email;
		this.orderdetails = orderdetails;

	}
	
	
	
	
}
