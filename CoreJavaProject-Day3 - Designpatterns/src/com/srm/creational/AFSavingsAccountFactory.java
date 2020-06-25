package com.srm.creational;

public class AFSavingsAccountFactory implements AbstractBankAccounFactory{

	@Override
	public AbstractBankAccountOpening createBankAccount() {
	
		return new AFCurrentAccount();
	}
	
}
