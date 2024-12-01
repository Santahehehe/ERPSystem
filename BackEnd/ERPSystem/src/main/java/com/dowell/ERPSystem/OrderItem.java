package com.dowell.ERPSystem;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
	//關聯主控方(多的一方:學生記老師名字較容易)，關聯方式為ALL
	@ManyToOne(cascade = CascadeType.ALL)
	//跟Order的關係是要找Order物件中的orderNO變數
	//對應到自己這個資料表(order_item)name是order_order_no的欄位	
	@JoinColumn(name="order_order_no", referencedColumnName="orderNO")
	//@JsonManagedReference與@JsonBackReference為了解決物件中存在雙向引用導致的無限遞迴問題，
	//在處理數據之間的雙向鏈接，一個用於父級角色，另一個用於子級角色。
	//＠JsonManagedReference被序列化的數據，而@JsonBackReference標註，不會被序列化。
	@JsonBackReference
	//因為是要跟Order物件關聯，所以這邊宣告一個Order物件(來取他的order_no)
	private Order order;
	
	
	//紀錄該筆訂單的品項
	@Column(name = "product_product_id")
	private Integer item;
	//紀錄該品項數量
	@Column(name = "quantity")
	private Integer quantity;
	
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
