package com.srm.thread.synchronization2;

public class AccountDetailsIntoTextFileWritingTester {
	
	public static void main(String args[]){  
		
		AccountDetailsIntoTextFileWriter obj = new AccountDetailsIntoTextFileWriter();
		
		SavingsAccountThread sbaccThread = new SavingsAccountThread(obj);
		CurrentAccountThread curraccThread = new CurrentAccountThread(obj);
		
		
		sbaccThread.start();
		curraccThread.start();
		
		
	}

}
