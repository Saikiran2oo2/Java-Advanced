package com.wipro.task.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.task.entity.Customer;
import com.wipro.task.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer saveCustomer(Customer customer) {
		customerRepository.save(customer);
		return customer;
	}

	@Override
	public Customer getById(int customerId) {
		Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
		if (optionalCustomer.isEmpty()) {
			// exception block
		}
		Customer customer = optionalCustomer.get();
		return customer;
	}

	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> customer=customerRepository.findAll();
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		Optional<Customer> optionalCustomer = customerRepository.findById(customer.getCustomerId());
		if (optionalCustomer.isEmpty()) {
			// exception block
		}
		customerRepository.save(customer);
		return customer;
	}

	@Override
	public void deleteCustomer(int customerId) {
		Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
		if (optionalCustomer.isEmpty()) {
			// exception block
		}
		Customer customer = optionalCustomer.get();
		customerRepository.delete(customer);
	}

}
