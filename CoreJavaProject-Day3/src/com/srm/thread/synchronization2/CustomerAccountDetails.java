package com.srm.thread.synchronization2;

import java.io.Serializable;

public class CustomerAccountDetails implements Serializable {
	
	
	 int customerId;  
	 String customerName;  
	 String accountType;
	 String accountNumber;
	 String customerAddress;
	
	 public CustomerAccountDetails(int customerId, String customerName, String accountType, String accountNumber,
			String customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.accountType = accountType;
		this.accountNumber = accountNumber;
		this.customerAddress = customerAddress;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	 	 
}
