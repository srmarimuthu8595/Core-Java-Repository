package com.srm.useofinterface;

public class SavingsAccount implements InterestCalculation {

	public int calculateInterest() {
		int amount=10000;
		int rateofinterest=2;
		int mulval = amount*rateofinterest;
		int interest = mulval/100;
		return interest;
	}
	

	public static void main(String[] args) {
	
		
		SavingsAccount obj = new SavingsAccount();
		int interest =obj.calculateInterest();
		System.out.println("Savings Account Interest value = "+obj.calculateInterest());
		
		
		
		
	}

	

}
