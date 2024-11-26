package com.dowell.ERPSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
	//用來處理order與資料庫連線的變數
	@Autowired
	private OrderDao orderDao;
	
	//新增訂單
	public String insert_Order(Order order) {
		return orderDao.insert_Order(order);
	}
	//新增訂單品項
	public String insert_OrderItem(OrderItem orderItem) {
		return orderDao.insert_OrderItem(orderItem);
	}
}
