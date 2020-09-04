package com.Myfinance1.Modal;

public class Customer {

	private int customerID;
	private String cutomerName;
	private long customerPhoneNo;
	private long aadharNumber;
	public long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCutomerName() {
		return cutomerName;
	}
	public void setCutomerName(String cutomerName) {
		this.cutomerName = cutomerName;
	}
	public long getCustomerPhoneNo() {
		return customerPhoneNo;
	}
	public void setCustomerPhoneNo(long customerPhoneNo) {
		this.customerPhoneNo = customerPhoneNo;
	}
	@Override
	public String  toString() {
		
		return "Customer ID:"+this.customerID+"/t"+"Customer Name: "+this.cutomerName;
	}
}
