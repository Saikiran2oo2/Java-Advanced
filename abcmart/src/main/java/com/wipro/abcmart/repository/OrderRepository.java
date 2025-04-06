package com.wipro.abcmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.abcmart.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer>{

}
