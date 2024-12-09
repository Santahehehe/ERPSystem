package com.dowell.ERPSystem.OrderSystem.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dowell.ERPSystem.OrderSystem.DAO.OrderDao;
import com.dowell.ERPSystem.OrderSystem.Object.Order;

import jakarta.transaction.Transactional;

@Component
public class OrderService {
	//用來處理order與資料庫連線的變數
	@Autowired
	private OrderDao orderDao;
	
	@Transactional
	//新增訂單
	public Order insert_Order(Order order) {
		return orderDao.insert_Order(order);
	}
}