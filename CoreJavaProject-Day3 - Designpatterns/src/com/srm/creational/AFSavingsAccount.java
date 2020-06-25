package com.srm.creational;

public class AFSavingsAccount extends AbstractBankAccountOpening {

	public double interestDetails=6;
	public double taxBenifitDetails=4;
	public double loyaltyPointDetails=2;
	
		
	@Override
	public double interestDetails() {
		return interestDetails;
	}

	@Override
	public double taxBenifitDetails() {
		return taxBenifitDetails;
	}

	@Override
	public double loyaltyPointDetails() {
		return loyaltyPointDetails;
	}
	
	

}
