package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class User {
	@Id
	private Integer userId;
	private String userUserName;
	private String UserPassword;
	private String userType;
	
//	@OneToOne
//	@JoinColumn(name="customerId")
//	private Customer customer;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserUserName() {
		return userUserName;
	}

	public void setUserUserName(String userUserName) {
		this.userUserName = userUserName;
	}

	public String getUserPassword() {
		return UserPassword;
	}

	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

//	public Customer getCustomer() {
//		return customer;
//	}
//
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userUserName=" + userUserName + ", UserPassword=" + UserPassword
				+ ", userType=" + userType +  "]";
	}

	public User(Integer userId, String userUserName, String userPassword, String userType, Customer customer) {
		super();
		this.userId = userId;
		this.userUserName = userUserName;
		UserPassword = userPassword;
		this.userType = userType;
//		this.customer = customer;
	}
	
	

}
