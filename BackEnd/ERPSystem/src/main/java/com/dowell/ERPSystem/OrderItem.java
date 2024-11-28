package com.dowell.ERPSystem;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

//@Data為Lombok提供的註解提供包含@Getter,@Setter,@EqualsAndHashCode,@ToString,
@Data
@Entity
@Table(name = "order_item")
//用來記錄訂單的品項和數量
public class OrderItem {
	//資料庫主key(由資料庫自動產生)
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	
	//紀錄是哪筆訂單	
	@Column(name = "order_no")
	private Integer orderNO;
	//紀錄該筆訂單的品項
	@Column(name = "order_item")
	private String item;
	//紀錄該品項數量
	@Column(name = "amount")
	private Integer amount;
	
//	//設定和取得orderNO
//	public void setOrderNO(Integer orderNO) {
//		this.orderNO = orderNO;
//	};
//	public Integer getOrderNO() {
//		return orderNO;
//	}
//	//設定和取得品項
//	public void setItem(String item) {
//		this.item = item;
//	}
//	public String getItem() {
//		return item;
//	}
//	//設定和取得品項數量
//	public void setAmount(Integer amount) {
//		this.amount = amount;
//	}
//	public Integer getAmount() {
//		return amount;
//	}
	
	
	
}
