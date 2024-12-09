package com.dowell.ERPSystem.OrderSystem.Object;
//import來使用@CreatedDate
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.time.LocalDateTime;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.CascadeType;
//
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;
import java.util.ArrayList;


@EntityListeners(AuditingEntityListener.class)
@Data
@Entity
@Table(name = "order_data")
public class Order {
//	要記錄1.條碼(黑貓產生) 2.訂單編號(資料庫自動產生) 3.客戶名稱 4.收件人姓名 5.收件人公司
//       6.配送地址 7.收件人電話  8.出貨備註 9.地址經度 10.地址緯度
//       11.出貨狀態bit(-1:刪除  0:未出貨 1:已安排出貨 2:已出貨)
//		 12.出貨日期 13.新增日期 14.新增人員 15.最後修改日期 16.最後修改人員
//		 17.刪除日期 18.刪除人員 19.難送bit(0:不難送, 1:難送)
		
		@Column(name = "barcode")
		//1.紀錄條碼
		private String barcode;
		
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		//2.紀錄訂單編號
		private Integer orderNO;
		
		@Column(name = "client",nullable = false)
		//3.紀錄客戶名稱
		private Integer client;
		
		@Column(name = "recipient",nullable = false)
		//4.紀錄收件人姓名
		private String recipient;
		
		@Column(name = "recipient_company")
		//5.紀錄收件人公司
		private String recipientCompany;
		
		@Column(name = "address",nullable = false)
		//6.紀錄配送地址
		private String address;
		
		@Column(name = "phone_no")
		//7.收件人電話
		private String phoneNO;

		@Column(name = "note")
		//8.出貨備註
		private String  note;
		
		@Column(name = "latitude",nullable = false)
//		9.地址緯度
		private Float latitude;
		
		@Column(name = "longitude",nullable = false)
//		10.地址經度
		private Float longitude;
		
		@Column(name = "state_state_id",nullable = false)
//		11.出貨狀態bit(-1:刪除  0:未出貨 1:已安排出貨 2:已出貨)
		private Integer state;
		
		@Column(name = "shipped_date")
//		12.出貨日期(可為空)
		private String shippedDate;
		
		//@CreatedDate是JPA提供的註解
		@CreatedDate
		@Column(name = "insertion_date",nullable = false)
//		13.新增日期 (不可為空)
		private LocalDateTime insertionDate;
		
		@Column(name = "insertion_staff_id",nullable = false)
//		14.新增人員 (不可為空)
		private Integer insertionStaff;
		
		@Column(name = "lastrevise_date")
//		15.最後修改日期 (可為空)
		private String lastReviseDate;
		
		@Column(name = "lastrevise_staff_id")
//		16.最後修改人員 (可為空)
		private Integer lastReviseStaff;
		
		@Column(name = "delete_date")
//		 17.刪除日期 (可為空)
		private String deleteDate;
		
		@Column(name = "delete_staff_id")
//		18.刪除人員 (可為空)
		private Integer deleteStaff;
		
		@Column(name = "difficult_bit",nullable = false)
//		19.難送bit(0:不難送, 1:難送)
		private Integer difficultBit;
		
		//20.用哪一台車出貨
		@Column(name="car_id")
		private Integer carId;
		
		//關聯至OrderItem		
		@JsonManagedReference
	    @OneToMany(cascade = CascadeType.ALL, mappedBy = "order")
	    @EqualsAndHashCode.Exclude
	    private List<OrderItem> orderItems = new ArrayList<>();
		
		public void addItem(OrderItem item) {
			orderItems.add(item);
			item.setOrder(this);
		}
		public void removeItem(OrderItem item) {
			orderItems.remove(item);
			item.setOrder(null);
		}
		
//		//1.設定和取得barcode變數function
//		public void setBarcode(String barcode) {
//			this.barcode = barcode;
//		}
//		public String getBarcode() {
//			return barcode;
//		}
//		
//		//2.設定和取得orderNO變數function
//		public void setOrderNO(Integer orderNO) {
//			this.orderNO = orderNO;
//		}
//		public Integer getOrderNO() {
//			return orderNO;
//		}		
//		
//		//3.設定和取得client變數function
//		public void setClient(String client) {
//			this.client = client;
//		}
//		public String getClient() {
//			return client;
//		}
//		
//		//4.設定和取得 recipient 變數function
//		public void setRecipient(String recipient) {
//			this.recipient = recipient;
//		}
//		public String getRecipient() {
//			return recipient;
//		}
//		
//		//5.設定和取得recipientCompany變數function
//		public void setRecipientCompany(String recipientCompany) {
//			this.recipientCompany = recipientCompany;
//		}
//		public String getRecipientCompany() {
//			return recipientCompany;
//		}
//		
//		//6.設定和取得address變數function
//		public void setAddress(String address) {
//			this.address = address;
//		}
//		public String getAddress() {
//			return address;
//		}
//		
//		//7.設定和取得phoneNO變數function
//		public void setPhoneNO(String phoneNO) {
//			this.phoneNO = phoneNO;
//		}
//		public String getphoneNO() {
//			return phoneNO;
//		}
//		
//		//8.出貨備註
//		public void setNote(String note) {
//			this.note = note;
//		}
//		public String getNote() {
//			return note;
//		}
//		
//		//9.地址緯度
//		public void setLatitude(Float latitude) {
//			this.latitude = latitude;
//		}
//		public Float get() {
//			return latitude;
//		}
//		//10.地址經度		
//		public void setLongitude(Float longitude) {
//			this.longitude = longitude;
//		}
//		public Float getLongitude() {
//			return longitude;
//		}
//		//11.出貨狀態(-1:刪除  0:未出貨 1:已安排出貨 2:已出貨)
//		public void setState(Integer state) {
//			this.state = state;
//		}
//		public Integer getState() {
//			return state;
//		}
//		//12.出貨日期(一開始可為空)		
//		public void setShippingDate(String shippingDate) {
//			this.shippingDate = shippingDate;
//		}
//		public String getShippingDate() {
//			return shippingDate;
//		}
//		
//		//13.新增日期		
//		public void setInsertionDate(String insertionDate) {
//			this.insertionDate = insertionDate;
//		}
//		public String getInsertionDate() {
//			return insertionDate;
//		}
//		//14.新增人員		
//		public void setInsertionStaff(String insertionStaff) {
//			this.insertionStaff = insertionStaff;
//		}
//		public String getInsertionStaff() {
//			return insertionStaff;
//		}
//		//15.最後修改日期(可為空)
//		public void setLastReviseDate(String lastReviseDate) {
//			this.lastReviseDate = lastReviseDate;
//		}
//		public String getLastReviseDate() {
//			return lastReviseDate;
//		}
//		//16.最後修改人員(可為空)		
//		public void setLastReviseStaff(String lastReviseStaff) {
//			this.lastReviseStaff = lastReviseStaff;
//		}
//		public String getLastReviseStaff() {
//			return lastReviseStaff;
//		}
//		//17.刪除日期(可為空)
//		public void setDeleteDate(String deleteDate) {
//			this.deleteDate = deleteDate;
//		}
//		public String getdeleteDate() {
//			return deleteDate;
//		}
//		//18.刪除人員(可為空)
//		public void setDeleteStaff(String deleteStaff) {
//			this.deleteStaff = deleteStaff;
//		}
//		public String getdeleteStaff() {
//			return deleteStaff;
//		}
//		//19.難送bit
//		public void setDifficultBit(Integer difficultBit) {
//			this.difficultBit = difficultBit;
//		}
//		public Integer getdifficultBit() {
//			return difficultBit;
//		}
}
