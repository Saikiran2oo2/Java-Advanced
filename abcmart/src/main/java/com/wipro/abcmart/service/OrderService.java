package com.wipro.abcmart.service;

import java.util.List;

import com.wipro.abcmart.entity.Order;
import com.wipro.abcmart.payload.OrderItemPayload;

public interface OrderService {
	 Order createOrder(int customerId,List<OrderItemPayload>selectedProducts);
	   Order saveOrder(Order order);
	   Order getOrderDetails(int orderId);
	   List<Order>getAllOrders();
	   List<Order>getAllOrdersByCustomer(int customerId);
	}
