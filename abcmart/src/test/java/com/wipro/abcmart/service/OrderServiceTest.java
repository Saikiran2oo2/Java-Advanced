package com.wipro.abcmart.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.wipro.abcmart.entity.Order;
import com.wipro.abcmart.repository.OrderRepository;

@SpringBootTest
public class OrderServiceTest {
	@InjectMocks
	private OrderServiceImpl orderService;
	@Mock
	private OrderRepository orderRepository;
	@Test
	public void testGetOrderDetailById() {
		
		Order order=new Order();
		order.setOrderId(111);
		order.setOrderTotal(10000);
		order.setOrderDate(LocalDate.of(2023,06, 27));
		order.setOrderStatus("pending");
		
		Order order1=new Order();
		order1.setOrderId(112);
		order1.setOrderTotal(20000);
		order1.setOrderDate(LocalDate.of(2022,06, 27));
		order1.setOrderStatus("pending");
		
		List<Order> orders=new ArrayList<>();
		orders.add(order);
		orders.add(order1);
		when(orderRepository.findAll()).thenReturn(orders);
		List<Order> orderlist=orderService.getAllOrders();
		assertEquals(2,orderlist.size());
		
		
	}
	

}
