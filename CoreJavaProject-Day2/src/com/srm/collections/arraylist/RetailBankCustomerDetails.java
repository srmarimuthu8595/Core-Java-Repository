package com.srm.collections.arraylist;

import java.util.Date;
import java.util.List;

public class RetailBankCustomerDetails {
	
	private double customerId;
	
	private String customerName;
	
	private String custDOB;
	
	private String accountType;
	
	private String accountNo;
	
	private String contactNo;
	
	private List<CustomerAddressDetails> custAddressDtl;

	public double getCustomerId() {
		return customerId;
	}

	public void setCustomerId(double customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustDOB() {
		return custDOB;
	}

	public void setCustDOB(String custDOB) {
		this.custDOB = custDOB;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public List<CustomerAddressDetails> getCustAddressDtl() {
		return custAddressDtl;
	}

	public void setCustAddressDtl(List<CustomerAddressDetails> custAddressDtl) {
		this.custAddressDtl = custAddressDtl;
	}

}
