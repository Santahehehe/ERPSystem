package com.dowell.ERPSystem.OrderSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dowell.ERPSystem.OrderSystem.Object.Order;
import com.dowell.ERPSystem.OrderSystem.Object.OrderItem;
import com.dowell.ERPSystem.OrderSystem.Object.OrderItemRequest;
import com.dowell.ERPSystem.OrderSystem.Object.OrderRequest;
import com.dowell.ERPSystem.OrderSystem.Service.OrderService;

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
	public Order insertOrder(@RequestBody OrderRequest orderrequest) {
		Order order = new Order();
		order.setBarcode(orderrequest.getBarcode());
		order.setOrderNO(orderrequest.getOrderNO());
		order.setClient(orderrequest.getClient());
		order.setRecipient(orderrequest.getRecipient());
		order.setRecipientCompany(orderrequest.getRecipientCompany());
		order.setAddress(orderrequest.getAddress());
		order.setPhoneNO(orderrequest.getPhoneNO());
		order.setNote(orderrequest.getNote());
		order.setLatitude(orderrequest.getLatitude());
		order.setLongitude(orderrequest.getLongitude());
		order.setState(orderrequest.getState());
		order.setShippedDate(orderrequest.getShippedDate());
		order.setInsertionStaff(orderrequest.getInsertionStaff());
		order.setDifficultBit(orderrequest.getDifficultBit());
		order.setCarId(orderrequest.getCarId());
				
		for(OrderItemRequest orderItemRequest : orderrequest.getOrderItems()) {
			OrderItem orderItem = new OrderItem();
			orderItem.setItem(orderItemRequest.getItem());
			orderItem.setQuantity(orderItemRequest.getQuantity());
			
			order.addItem(orderItem);
		}
		
		return orderService.insert_Order(order);
		
	}
	
}
