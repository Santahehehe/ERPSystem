package com.dowell.ERPSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	//用來處理order商業邏輯的變數	
	@Autowired
	private OrderService orderService;
	
	
//	//僅接受post請求做新增訂單的動作	
//	//新增訂單資料表資料
//	@PostMapping("/insertOrder")
//	public Order insertOrder(@RequestBody Order order) {
//		return orderService.insert_Order(order);
//	}
//	//新增訂單品項資料表 資料
//	@PostMapping("/insertOrderItem")
//	public OrderItem insertOrderItem(@RequestBody OrderItem orderItem) {
//		return orderService.insert_OrderItem(orderItem);
//	}
	@PostMapping("/insertOrder")
	public Order insertOrder(@RequestBody Order order) {
		Order neworder = new Order();
		
	}
	
}
