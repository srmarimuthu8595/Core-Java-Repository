package com.srm.thread.lifecycle;


public class ThreadLifeCycle implements Runnable {
	
	   private Thread thread;
	   
	   private String threadName;
	   
	   ThreadLifeCycle( String name) {
	      threadName = name;
	      System.out.println("Creating " +  threadName );
	   }
	   
	   public void run() {
	      System.out.println("Running " +  threadName );
	      try {
	         
	    	  for(int i = 4; i > 0; i--) {
	            
	    		  System.out.println("Thread: " + threadName + ", " + i);
	           
	              Thread.sleep(5000);
	             
	         }
	      
	      } catch (InterruptedException e) {
	         System.out.println("Thread " +  threadName + " interrupted.");
	      }
	      System.out.println("Thread " +  threadName + " exiting.");
	   }
	   
	   public void threaterStartMethod () {
	      System.out.println("Starting " +  threadName );
	      if (thread == null) {
	    	  thread = new Thread (this, threadName);
	    	  thread.start ();
	      }
	   }
}



	  

