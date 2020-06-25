package com.srm.exceptionhandling;

public class CashwithdrawalException extends Exception {
	
	 private String custommessage;
	
	CashwithdrawalException(String custommessage) {
		this.custommessage=custommessage;
	 }
	 
	 public String toString(){ 
		return ("Cash Withdrawal Exception Occurred : "+custommessage) ;
	 }

}
