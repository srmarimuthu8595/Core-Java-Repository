package com.srm.thread.creation;

public class ByRunnableInterface implements Runnable {  
	
	
	    public void run(){ 
	    	
	    	System.out.println("Current Account Loader Starded");  
		}  
		  
		public static void main(String args[]){  
			
			ByRunnableInterface obj = new ByRunnableInterface();  
		    Thread t1 =new Thread(obj);  
		    t1.start();  
		
		}  

}  