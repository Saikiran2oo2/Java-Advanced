package com.wipro.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.task.entity.Customer;


public interface CustomerRepository extends JpaRepository <Customer , Integer> {

}
