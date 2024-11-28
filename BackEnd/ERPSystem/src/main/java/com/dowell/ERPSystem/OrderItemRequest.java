package com.dowell.ERPSystem;

import lombok.Data;

@Data
//用來存放request的內容
public class OrderItemRequest {
	//紀錄該筆訂單的品項
	private String item;
	//紀錄該品項數量
	private Integer amount;
}
