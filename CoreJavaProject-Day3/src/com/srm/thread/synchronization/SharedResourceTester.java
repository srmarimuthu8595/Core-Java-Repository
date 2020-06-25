package com.srm.thread.synchronization;

public class SharedResourceTester {
	
	public static void main(String args[]){  
		
		SharedResource shrdResource = new SharedResource();
		
		SavingsAccountExtractor extractorOne =new SavingsAccountExtractor(shrdResource);  
		CurrentAccountExtractor extractorTwo =new CurrentAccountExtractor(shrdResource);  
		
		extractorOne.start();  
		extractorTwo.start();  
	
	}  

}
