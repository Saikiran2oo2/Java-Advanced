package com.wipro.task.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer_tbl")
public class Customer {
	@Id
	@Column(name="cus_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int  customerId;
	
	@Column(name="cus_Name")
	private String Name;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Column(name="cus_Age")
	private int age;
	
	@Column(name="cus_Mobile")
	private long mobile;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	
	

}
