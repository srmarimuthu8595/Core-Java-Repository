package com.srm.creational;

public class SavingsAccount extends Bankaccount{
	
	
	public double  bankAccountDeposit=100000;
	public double  bankAccountBalance=200000;
	public double  bankAccountWithdrawal=2000;
	public String accounttype;
	public String accountNumbe;
	

	public SavingsAccount(String accounttype, String accountNumbe) {
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
