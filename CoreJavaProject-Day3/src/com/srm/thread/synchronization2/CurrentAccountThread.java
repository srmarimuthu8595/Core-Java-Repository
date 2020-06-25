package com.srm.thread.synchronization2;


public class CurrentAccountThread extends Thread{ 
	
	AccountDetailsIntoTextFileWriter txtWriter;
	
	CurrentAccountThread(AccountDetailsIntoTextFileWriter txtWriter){  
		this.txtWriter=txtWriter;  
     }  
	
	
	public void run(){  
		CustomerAccountDetails currDetails =new CustomerAccountDetails(1000,"Karuppannan R","Current Account","CCA3300400500","112,Arachalur,Erode-1");
		txtWriter.textFileWriter(currDetails);  
	}  
	
}