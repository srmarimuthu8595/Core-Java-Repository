package com.srm.thread.lifecycle;

public class ThreadLifeCycleTester {
	
	 public static void main(String args[]) {
		
		 ThreadLifeCycle thread1 = new ThreadLifeCycle( "Savings Account Loader Thread");
		 thread1.threaterStartMethod();
	      
	      ThreadLifeCycle thread2 = new ThreadLifeCycle( "Current Account Loader Thread");
	      thread2.threaterStartMethod();
	  
	 }   

}
