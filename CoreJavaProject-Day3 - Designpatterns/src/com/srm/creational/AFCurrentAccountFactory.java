package com.srm.creational;

public class AFCurrentAccountFactory implements AbstractBankAccounFactory{

	@Override
	public AbstractBankAccountOpening createBankAccount() {
	
		return new AFSavingsAccount();
	}

}
