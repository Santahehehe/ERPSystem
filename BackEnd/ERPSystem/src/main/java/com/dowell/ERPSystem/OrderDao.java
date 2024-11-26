package com.dowell.ERPSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderDao {
	
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private OrderItemRepository orderItemRepository;
	
	//新增訂單
	public Order insert_Order(Order order) {
		return orderRepository.save(order);
	}
	//新增訂單品項
	public OrderItem insert_OrderItem(OrderItem orderItem) {
		return orderItemRepository.save(orderItem);
	}
}
