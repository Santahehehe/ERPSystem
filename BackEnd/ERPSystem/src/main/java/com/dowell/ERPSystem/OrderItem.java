package com.dowell.ERPSystem;

//用來記錄訂單的品項和數量
public class OrderItem {
	//紀錄是哪筆訂單	
	private Integer orderNO;
	//紀錄該筆訂單的品項
	private String item;
	//紀錄該品項數量
	private Integer amount;
	
	//設定和取得orderNO
	public void setOrderNO(Integer orderNO) {
		this.orderNO = orderNO;
	};
	public Integer getOrderNO() {
		return orderNO;
	}
	//設定和取得品項
	public void setItem(String item) {
		this.item = item;
	}
	public String getItem() {
		return item;
	}
	//設定和取得品項數量
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Integer getAmount() {
		return amount;
	}
	
	
	
}
