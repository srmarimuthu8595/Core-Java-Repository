package com.srm.thread.synchronization;

public class CurrentAccountExtractor  extends Thread{ 
	
	SharedResource shrdResource;
	
	CurrentAccountExtractor(SharedResource shrdResource){  
		this.shrdResource=shrdResource;  
     }  
	
	
	public void run(){  
		shrdResource.sharedResourceOperation("Current Account Extractor");  
	}  

}
