package com.wipro.abcmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.abcmart.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}