package com.srm.junit.logic;

public class BankDeposit {
	
	
	public String validateCustomerDetails(String accountNumber){
		return "Valid Customer";
	}
	
	public int doDeposit(int depositAmount){
		int balance=1000;
		int total=balance+depositAmount;
		return  total;
	}

}
