package com.wipro.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.wipro.task.entity.Customer;
import com.wipro.task.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	
	@GetMapping("/all")
	public List<Customer> fetchAllCustomers(){
		List<Customer> customer=customerService.getAllCustomers();
		return customer;
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Customer> fetchCustomerDetails(@PathVariable("id")int customerId) {
		Customer customer=customerService.getById(customerId);
		if(customer == null) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(customer, HttpStatus.OK);
		
	}
	@PostMapping("/add")
	public ResponseEntity<Customer> addProduct(@RequestBody Customer customer){
		customerService.saveCustomer(customer);
		ResponseEntity<Customer> responseEntity = new ResponseEntity<>(customer, HttpStatus.CREATED);
		return responseEntity;
		
	}
	@PutMapping("/update")
	public ResponseEntity<Customer> editProduct(@RequestBody Customer customer){
		customerService.updateCustomer(customer);
		ResponseEntity<Customer> responseEntity = new ResponseEntity<>(customer, HttpStatus.OK);
		return responseEntity;
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Customer> deleteProduct(@PathVariable("id") int customerId){
		customerService.deleteCustomer(customerId);
		ResponseEntity<Customer> responseEntity = new ResponseEntity<>(HttpStatus.OK);
		return responseEntity;
	}
	
	

}
