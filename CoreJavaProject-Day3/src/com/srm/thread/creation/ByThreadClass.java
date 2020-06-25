package com.srm.thread.creation;

public class ByThreadClass extends Thread{  
	
	public void run(){  
		
		System.out.println("Savings Account Loader Started ======> ");  
		
	}  
	
	public static void main(String args[]){  
		ByThreadClass obj =new ByThreadClass();  
		obj.start();  
	}  

}
