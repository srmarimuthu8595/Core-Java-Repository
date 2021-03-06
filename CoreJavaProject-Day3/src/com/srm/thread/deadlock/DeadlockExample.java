package com.srm.thread.deadlock;

public class DeadlockExample {
	
	
	 public static void main(String[] args) {  
		    
		 	final String pdfPrinter = "PDF Printer";  
		    final String excelPrinter = "Excel Printer";  
		    
		    // T1 tries to lock pdfPrinter then excelPrinter  
		    Thread t1 = new Thread() {  
		      public void run() {  
		         
		    	  synchronized (pdfPrinter) { 
		        	  
		           System.out.println("Thread 1: locked : "+pdfPrinter);  
		  
		           try { Thread.sleep(100);} catch (Exception e) {}  
		  
		           synchronized (excelPrinter) {  
		        	   
		        	   System.out.println("Thread 1: locked :"+excelPrinter);  
		          
		           }  
		         }  
		      }  
		    };  
		  
		    // T2 tries to lock excelPrinter then pdfPrinter  
		    Thread t2 = new Thread() {  
		      public void run() {  
		        synchronized (excelPrinter) {  
		          System.out.println("Thread 2: locked : "+excelPrinter);  
		  
		          try { Thread.sleep(100);} catch (Exception e) {}  
		  
		          synchronized (pdfPrinter) {  
		        	  System.out.println("Thread 2: locked : "+pdfPrinter);
		          }  
		        }  
		      }  
		    };  
		  
		      
		    t1.start();  
		    t2.start();  
		  }  
	
	
	
	
	

}
