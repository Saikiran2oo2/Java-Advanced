package com.wipro.abcmart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.abcmart.entity.Customer;
import com.wipro.abcmart.exception.ResourceNotFoundException;
import com.wipro.abcmart.repository.CustomerRepository;



@Service
public class CustomerServiceImpl implements CustomerService{
 
	@Autowired
	  private CustomerRepository customerRepository;

	  @Override
	  public Customer saveCustomer(Customer customer) {
	    customerRepository.save(customer);
	    return customer;
	  }

	  @Override
	  public Customer getCustomerById(int customerId) {
	    Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
	    if (optionalCustomer.isEmpty()) {
	      throw new ResourceNotFoundException("Customer is not existing with id:"+customerId);
	    }
	    Customer customer = optionalCustomer.get();
	    return customer;
	  }

	  @Override
	  public List<Customer> getAllCustomers() {
	    List<Customer> customers=customerRepository.findAll();
	    return customers;
	  }

}

