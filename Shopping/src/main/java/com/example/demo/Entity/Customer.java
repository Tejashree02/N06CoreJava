package com.example.demo.Entity;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customerId;
	private String customerName;
	private Integer customerPhone;
	private String customeremail;
	
//	@OneToOne(mappedBy= "user" )
//	private User user;
	
	// ASSOCIATION
		@OneToMany(mappedBy="customer", cascade=CascadeType.ALL)
		private List<OrderDetails> orderdetails;
		

	public List<OrderDetails> getOrderdetails() {
			return orderdetails;
		}

		public void setOrderdetails(List<OrderDetails> orderdetails) {
			this.orderdetails = orderdetails;
		}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Integer getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(Integer customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCustomeremail() {
		return customeremail;
	}

	public void setCustomeremail(String customeremail) {
		this.customeremail = customeremail;
	}
//
//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}

	@Override
	public String toString() {
		return "Customer [cutomerId=" + customerId + ", customerName=" + customerName + ", customerPhone="
				+ customerPhone + ", customeremail=" + customeremail +  " , orderdetails= " +orderdetails+ "]";
	}

	public Customer(Integer cutomerId, String customerName, Integer customerPhone, String customeremail, User user, Integer customerId, List<OrderDetails> orderdetails) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPhone = customerPhone;
		this.customeremail = customeremail;
//		this.user = user;
		this.orderdetails = orderdetails;
		
		
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
}
