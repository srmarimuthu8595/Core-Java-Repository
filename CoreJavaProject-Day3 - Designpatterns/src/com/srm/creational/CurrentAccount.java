package com.srm.creational;

public class CurrentAccount extends Bankaccount{
	
	
	public double  bankAccountDeposit=500000;
	public double  bankAccountBalance=600000;
	public double  bankAccountWithdrawal=9000;
	public String accounttype;
	public String accountNumbe;
	

	public CurrentAccount(String accounttype, String accountNumbe) {
		super();
		this.accounttype = accounttype;
		this.accountNumbe = accountNumbe;
	}


	@Override
	public double bankAccountDeposit() {
		return bankAccountDeposit;
	}

	@Override
	public double bankAccountBalance() {
		return bankAccountBalance;
	}

	@Override
	public double bankAccountWithdrawal() {
		return bankAccountWithdrawal;
	}
	
}