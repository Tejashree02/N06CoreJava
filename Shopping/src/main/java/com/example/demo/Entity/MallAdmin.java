package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MallAdmin {
	@Id
	private Integer MallAdminId;
	private String MallAdminName;
	private String MallAdminPassword;
	private String MallAdminPhone;
	

}
