package com.srm.collections.queues;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	 public static void main(String args[]) 
	    { 

	        PriorityQueue<String> sbiBankPQ = new PriorityQueue<String>(); 
	  
	       
	        
	        sbiBankPQ.add("A Monthly Corporate Employees Salary Processing"); 
	        sbiBankPQ.add("Saving Accouynts NFT Funtransfer Processing"); 
	        sbiBankPQ.add("Current Accouynts NFT Funtransfer Processing"); 
	        sbiBankPQ.add("Loan Account NFT Funtransfer Processing"); 
	  
	   
	        System.out.println("Head value using peek function:"
	                           + sbiBankPQ.peek()); 
	  
	        
	        System.out.println("===================== PriorityQueue ===============================");
	        
	        System.out.println("The queue elements:"); 
	        Iterator itr = sbiBankPQ.iterator(); 
	        while (itr.hasNext()) 
	            System.out.println(itr.next()); 
	        

	        System.out.println("===================== PriorityQueue ===============================");
	  
	        sbiBankPQ.poll(); 
	        
	        
	        System.out.println("After removing an element"
	                           + "with poll function:"); 
	        
	        System.out.println("===================== After Firts Poll PriorityQueue ===============================");
	        
	        
	        
	        
	        Iterator<String> itr2 = sbiBankPQ.iterator(); 
	        while (itr2.hasNext()) 
	            System.out.println(itr2.next()); 
	  
	      
	        System.out.println("===================== After Firts Poll PriorityQueue ===============================");
	        
	        
	        sbiBankPQ.remove("A Monthly Corporate Employees Salary Processing"); 
	        
	        
	        

	        System.out.println("===================== After Firts Remove PriorityQueue ===============================");
	               
		                
	        Iterator<String> itr3 = sbiBankPQ.iterator(); 
	        while (itr3.hasNext()) 
	            System.out.println(itr3.next());
	        

	        System.out.println("===================== After Firts Remove PriorityQueue ===============================");
	  
	  
	        boolean b = sbiBankPQ.contains("A Monthly Corporate Employees Salary Processing"); 
	        System.out.println("Priority queue contains Monthly Corporate Employees Salary Processing "
	                           + "or not?: " + b); 
	  	  
	        Object[] arr = sbiBankPQ.toArray(); 
	        
	        System.out.println("Value in array: "); 
	        
	        for (int i = 0; i < arr.length; i++) 
	            System.out.println("Value: " + arr[i].toString()); 
	  } 
} 

