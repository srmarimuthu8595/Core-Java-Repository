package com.srm.thread.synchronization;

public class SavingsAccountExtractor extends Thread {
	

	SharedResource shrdResource;
	
	SavingsAccountExtractor(SharedResource shrdResource){  
		this.shrdResource=shrdResource;  
     }  
	
	
	public void run(){  
		shrdResource.sharedResourceOperation("Savings Account Extractor");  
	}  

}
