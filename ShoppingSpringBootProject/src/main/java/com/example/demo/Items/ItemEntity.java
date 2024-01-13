package com.example.demo.Items;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ItemEntity {
@Id
	private Long ItemId;
	private String Itemname;
	
}
