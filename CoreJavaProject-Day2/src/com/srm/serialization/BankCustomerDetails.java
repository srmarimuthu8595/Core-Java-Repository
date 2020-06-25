package com.srm.serialization;

import java.io.Serializable;

public class BankCustomerDetails implements Serializable{  
	
	 int customerId;  
	 String customerName;  
	 transient String password;//Now it will not be serialized  
	
	 public BankCustomerDetails(int customerId, String customerName,String password) {  
	  this.customerId = customerId;  
	  this.customerName = customerName;  
	  this.password=password;  
	 }  

}
