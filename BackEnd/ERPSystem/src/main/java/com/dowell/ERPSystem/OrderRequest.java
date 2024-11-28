package com.dowell.ERPSystem;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;


@Data
public class OrderRequest {
	//1.紀錄條碼
	private String barcode;
	
	//2.紀錄訂單編號
	private Integer orderNO;
	
	//3.紀錄客戶名稱
	private String client;
	
	//4.紀錄收件人姓名
	private String recipient;
	
	//5.紀錄收件人公司
	private String recipientCompany;
	
	//6.紀錄配送地址
	private String address;
	
	//7.收件人電話
	private String phoneNO;

	//8.出貨備註
	private String  note;
	
//	9.地址緯度
	private Float latitude;
	
//	10.地址經度
	private Float longitude;
	
//	11.出貨狀態bit(-1:刪除  0:未出貨 1:已安排出貨 2:已出貨)
	private Integer state;
	
//	12.出貨日期(可為空)
	private String shippingDate;
	
//	13.新增日期 (不可為空)
	private LocalDateTime insertionDate;
	
//	14.新增人員 (不可為空)
	private String insertionStaff;
	
//	15.最後修改日期 (可為空)
	private String lastReviseDate;
	
//	16.最後修改人員 (可為空)
	private String lastReviseStaff;
	
//	 17.刪除日期 (可為空)
	private String deleteDate;
	
//	18.刪除人員 (可為空)
	private String deleteStaff;
	
//	19.難送bit(0:不難送, 1:難送)
	private Integer difficultBit;
	
//	用來記訂單品項的
    private List<OrderItemRequest> orderItems;
}
