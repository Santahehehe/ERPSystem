package com.dowell.ERPSystem;


@Component
public class OrderDao {
	
	
	
	//新增訂單
	public String insert_Order(Order order) {
		return orderDao.insert_Order(order);
	}
	//新增訂單品項
	public String insert_OrderItem(OrderItem orderItem) {
		return orderDao.insert_OrderItem(orderItem);
	}
}
