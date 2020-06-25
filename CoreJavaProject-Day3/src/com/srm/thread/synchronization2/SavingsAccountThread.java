package com.srm.thread.synchronization2;

public class SavingsAccountThread extends Thread {
	
     AccountDetailsIntoTextFileWriter txtWriter;
	
     SavingsAccountThread(AccountDetailsIntoTextFileWriter txtWriter){  
		this.txtWriter=txtWriter;  
     }  
	
	
	public void run(){  
		CustomerAccountDetails sbaccDetails =new CustomerAccountDetails(1000,"Karuppannan R","Saving Account","SBA888899900","112,Arachalur,Erode-1");
		txtWriter.textFileWriter(sbaccDetails);  
	}  
	

}
