package com.srm.thread.synchronization;

public class SharedResource {
	
	
	  public synchronized void sharedResourceOperation(String threadName){  
		  
		for(int i=1;i<=5;i++){  
		    
			System.out.println("Thread "+threadName+" : "+i);
			
		     try{  
		      Thread.sleep(400);  
		     }catch(Exception e){System.out.println(e);}  
		   }  
		  
	 }  

}
