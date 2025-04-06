package com.wipro.abcmart.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.wipro.abcmart.entity.Customer;
import com.wipro.abcmart.exception.ProductNotFoundException;
import com.wipro.abcmart.repository.CustomerRepository;
@SpringBootTest
public class CustomerServiceTest {
	@InjectMocks
	private CustomerServiceImpl customerService;
	@Mock
	private CustomerRepository customerRepository;
	@Test
	public void testGetCustomerById() {
		Customer customer=new Customer();
		customer.setCustomerId(111);
		customer.setFirstName("king");
		customer.setLastName("cobra");
		customer.setEmail("lakanavarapusaikiran@gmail.com");
		customer.setMobile("6309490829");
		when(customerRepository.findById(111)).thenReturn(Optional.of(customer));
		Customer actualObj=customerService.getCustomerById(111);
		assertEquals("lakanavarapusaikiran@gmail.com",actualObj.getEmail());
	}
/*@Test
	public void testGetCustomerByIdException() {
		when(customerRepository.findById(100)).thenThrow(new ProductNotFoundException("customer is not existing with id:100"));
		assertEquals(ProductNotFoundException.class,()->customerService.getCustomerId(100));
	}*/
	@Test
	public void testGetAllCustomers() {
		Customer customer=new Customer();
		customer.setCustomerId(111);
		customer.setFirstName("king");
		customer.setLastName("cobra");
		customer.setEmail("lakanavarapusaikiran@gmail.com");
		customer.setMobile("6309490829");
		
		Customer customer1=new Customer();
		customer1.setCustomerId(112);
		customer1.setFirstName("Queen");
		customer1.setLastName("cobra");
		customer1.setEmail("saikiranlakanavarapu@gmail.com");
		customer1.setMobile("8096082927");
		
		List<Customer> customers=new ArrayList<>();
		customers.add(customer);
		customers.add(customer1);
		
		when(customerRepository.findAll()).thenReturn(customers);
		List<Customer> customerList=customerService.getAllCustomers();
		assertEquals(2,customerList.size());
		
		
		
	}
	

}
