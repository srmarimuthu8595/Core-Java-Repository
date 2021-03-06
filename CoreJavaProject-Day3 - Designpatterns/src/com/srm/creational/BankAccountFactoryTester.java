package com.srm.creational;

public class BankAccountFactoryTester {

	public static void main(String[] args) {
		
		Bankaccount savingAccount = BankAccountFactory.getBankAccount("Savings", "SBI2000300400");
		
		System.out.println("Savings Account Banalce : "+savingAccount.bankAccountBalance());
		System.out.println("Savings Account Deposit : "+savingAccount.bankAccountDeposit());
		System.out.println("Savings Account Withdraw : "+savingAccount.bankAccountWithdrawal());
		
		
		Bankaccount curretntAccount = BankAccountFactory.getBankAccount("Current", "CACC400600700");
		
		System.out.println("Current Account Banalce : "+curretntAccount.bankAccountBalance());
		System.out.println("Current Account Deposit : "+curretntAccount.bankAccountDeposit());
		System.out.println("Current Account Withdraw : "+curretntAccount.bankAccountWithdrawal());
		

	}

}
