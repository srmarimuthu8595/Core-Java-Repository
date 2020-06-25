package com.srm.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSizeVariationExample {
	

	
	public static void main(String args[]) {
	   

		
		  ArrayList<String> list = new ArrayList<String>();
	      
	       
	      System.out.println("Default Size  :"+list.size());
	      
	      list.add("Savings Account");
	      list.add("Current Account");
	      
	      System.out.println("Size After First Addition :"+list.size());
	
	      
	      list.add("Credit Crad Account");
	      list.add("Corporate Accounts");
	      list.add("Loyalty Point Accounts");
	      list.add("Pre Paid Accounts");
	      
	      System.out.println("Size After Second Addition :"+list.size());
	      
	      
	      
	      list.add("Savings Account");
	      list.add("Current Account");
	      list.add("Credit Crad Account");
	      list.add("Corporate Accounts");
	      list.add("Loyalty Point Accounts");
	      list.add("Pre Paid Accounts");
	      
	      System.out.println("Size After Third Addition : "+list.size());
	     
	      
	      
	      System.out.println("================ Array List Values ==================");
	      
	      for(String value : list){
	    	  
	    	  System.out.println(value);
	    	  
	      }

	      
	}

}
