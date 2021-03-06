package com.srm.creational;

public class BankAccountFactory {
	
	public static Bankaccount getBankAccount(String accountype, String accountNumber){
		
		if(accountype.equals("Savings")){
			return new SavingsAccount(accountype,accountNumber);
		}else if(accountype.equals("Current")){
			return new CurrentAccount(accountype,accountNumber);
		}
		return null;
		
	}

}
