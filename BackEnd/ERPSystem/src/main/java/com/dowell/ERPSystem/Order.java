package com.dowell.ERPSystem;

public class Order {
//	要記錄1.條碼(黑貓產生) 2.訂單編號(資料庫自動產生) 3.客戶名稱 4.收件人姓名 5.收件人公司
//       6.配送地址 7.收件人電話  8.出貨備註 9.地址經度 10.地址緯度
//       11.出貨狀態bit(-1:刪除  0:未出貨 1:已安排出貨 2:已出貨)
//		 12.出貨日期 13.新增日期 14.新增人員 15.最後修改日期 16.最後修改人員
//		 17.刪除日期 18.刪除人員 19.難送bit(0:不難送, 1:難送)
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
//		9.地址經度
		private Float latitude;
//		10.地址緯度
		private Float longitude;
//		11.出貨狀態bit(-1:刪除  0:未出貨 1:已安排出貨 2:已出貨)
		private Integer state;
//		12.出貨日期(可為空)
		private String shippingDate;
//		13.新增日期 (可為空)
		private String insertionDate;
//		14.新增人員 (可為空)
		private String insertionStaff;
//		15.最後修改日期 (可為空)
		private String lastReviseDate;
//		16.最後修改人員 (可為空)
		private String lastReviseStaff;
//		 17.刪除日期 (可為空)
		private String deleteDate;
//		18.刪除人員 (可為空)
		private String deleteStaff;
//		19.難送bit(0:不難送, 1:難送)
		private Integer difficultBit;
		
		
		
		
		//1.設定和取得barcode變數function
		public void setBarcode(String barcode) {
			this.barcode = barcode;
		}
		public String getBarcode() {
			return barcode;
		}
		
		//2.設定和取得orderNO變數function
		public void setOrderNO(Integer orderNO) {
			this.orderNO = orderNO;
		}
		public Integer getOrderNO() {
			return orderNO;
		}		
		
		//3.設定和取得client變數function
		public void setClient(String client) {
			this.client = client;
		}
		public String getClient() {
			return client;
		}
		
		//4.設定和取得 recipient 變數function
		public void setRecipient(String recipient) {
			this.recipient = recipient;
		}
		public String getRecipient() {
			return recipient;
		}
		
		//5.設定和取得recipientCompany變數function
		public void setRecipientCompany(String recipientCompany) {
			this.recipientCompany = recipientCompany;
		}
		public String getRecipientCompany() {
			return recipientCompany;
		}
		
		//6.設定和取得address變數function
		public void setAddress(String address) {
			this.address = address;
		}
		public String getAddress() {
			return address;
		}
		
		//7.設定和取得phoneNO變數function
		public void setPhoneNO(String phoneNO) {
			this.phoneNO = phoneNO;
		}
		public String getphoneNO() {
			return phoneNO;
		}
		
		//8.出貨備註
		public void setNote(String note) {
			this.note = note;
		}
		public String getNote() {
			return note;
		}
		
		//9.地址經度
		public void setLatitude(Float latitude) {
			this.latitude = latitude;
		}
		public Float get() {
			return latitude;
		}
		//10.地址緯度		
		public void setLongitude(Float longitude) {
			this.longitude = longitude;
		}
		public Float getLongitude() {
			return longitude;
		}
		//11.出貨狀態(-1:刪除  0:未出貨 1:已安排出貨 2:已出貨)
		public void setState(Integer state) {
			this.state = state;
		}
		public Integer getState() {
			return state;
		}
		//12.出貨日期(一開始可為空)		
		public void setShippingDate(String shippingDate) {
			this.shippingDate = shippingDate;
		}
		public String getShippingDate() {
			return shippingDate;
		}
		
		//13.新增日期		
		public void setInsertionDate(String insertionDate) {
			this.insertionDate = insertionDate;
		}
		public String getInsertionDate() {
			return insertionDate;
		}
		//14.新增人員		
		public void setInsertionStaff(String insertionStaff) {
			this.insertionStaff = insertionStaff;
		}
		public String getInsertionStaff() {
			return insertionStaff;
		}
		//15.最後修改日期(可為空)
		public void setLastReviseDate(String lastReviseDate) {
			this.lastReviseDate = lastReviseDate;
		}
		public String getLastReviseDate() {
			return lastReviseDate;
		}
		//16.最後修改人員(可為空)		
		public void setLastReviseStaff(String lastReviseStaff) {
			this.lastReviseStaff = lastReviseStaff;
		}
		public String getLastReviseStaff() {
			return lastReviseStaff;
		}
		//17.刪除日期(可為空)
		public void setDeleteDate(String deleteDate) {
			this.deleteDate = deleteDate;
		}
		public String getdeleteDate() {
			return deleteDate;
		}
		//18.刪除人員(可為空)
		public void setDeleteStaff(String deleteStaff) {
			this.deleteStaff = deleteStaff;
		}
		public String getdeleteStaff() {
			return deleteStaff;
		}
		//19.難送bit
		public void setDifficultBit(Integer difficultBit) {
			this.difficultBit = difficultBit;
		}
		public Integer getdifficultBit() {
			return difficultBit;
		}
}
