package com.wipro.task.service;

import java.util.List;

import com.wipro.task.entity.Customer;

public interface CustomerService {
	
	Customer saveCustomer(Customer customer);
	
	Customer getById(int customerId);
	
	List<Customer> getAllCustomers();
	
	Customer updateCustomer(Customer customer);
	
	void deleteCustomer(int customerId);
}
