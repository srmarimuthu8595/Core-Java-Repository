package com.srm.thread.synchronization2;


public class AccountDetailsIntoTextFileWriter {
	   
	
	  public synchronized void textFileWriter(CustomerAccountDetails obj){
		  
		
		  System.out.println(obj.getCustomerId());
		  System.out.println(obj.getCustomerName());
		  System.out.println(obj.getAccountType());
		  System.out.println(obj.getCustomerAddress());
		  
	}

}
