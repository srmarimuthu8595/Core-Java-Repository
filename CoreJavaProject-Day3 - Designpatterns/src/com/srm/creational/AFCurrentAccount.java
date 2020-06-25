package com.srm.creational;

public class AFCurrentAccount extends AbstractBankAccountOpening{

	public double interestDetails=4;
	public double taxBenifitDetails=2;
	public double loyaltyPointDetails=1;
	
		
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
