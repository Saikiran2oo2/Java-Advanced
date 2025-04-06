package com.wipro.abcmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.abcmart.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Integer> {

}
