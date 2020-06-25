package com.srm.useofinterface;

public class LoanAccount implements InterestCalculation{

	public int calculateInterest() {
		int amount=400000;
		int rateofinterest=8;
		int mulval = amount*rateofinterest;
		int interest = mulval/100;
		return interest;
	}
	
	
	public static void main(String arg[]){
		
		LoanAccount obj = new LoanAccount();
		
		System.out.println("Loan Account Interest = "+obj.calculateInterest());
		
	}
	

}
