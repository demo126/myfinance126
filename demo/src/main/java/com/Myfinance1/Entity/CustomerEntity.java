package com.Myfinance1.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="customer_details")
public class CustomerEntity {
	

	
		@Id
		
		@Column(name = "cust_id")
		private Integer customerID;
		
		@Column(name="cust_name")
		private String customerName;
		
		@Column(name="phone_no")
		private long phoneNo;
		
		@Column(name="aadhar_no")
		private long aadhrNumber;
		public int getCustomerID() {
			return customerID;
		}
		public void setCustomerID(int customerID) {
			this.customerID = customerID;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public long getPhoneNo() {
			return phoneNo;
		}
		public void setPhoneNo(long phoneNo) {
			this.phoneNo = phoneNo;
		}
		public long getAadhrNumber() {
			return aadhrNumber;
		}
		public void setAadhrNumber(long aadhrNumber) {
			this.aadhrNumber = aadhrNumber;
		}

}
