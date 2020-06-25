package com.srm.collections.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	
	 public static void main(String args[]) {
         
		 System.out.println("================================== Strings ==================================");
		 
		 // LinkedHashSet of String Type
         LinkedHashSet<String> lhset = new LinkedHashSet<String>();

         // Adding elements to the LinkedHashSet
         lhset.add("Retail Banking");
         lhset.add("Corporate Banking");
         lhset.add("Online Banking");
         lhset.add("Credit Card Division");
         lhset.add("Debit Card Division");
         lhset.add("Cashflow Card Division");
         
         for(String departments :lhset){
        	 System.out.println(departments); 
         }
             
         System.out.println("================================== Numbers==================================");
         // LinkedHashSet of Integer Type
         LinkedHashSet<Integer> lhset2 = new LinkedHashSet<Integer>();

         // Adding elements
         lhset2.add(99);
         lhset2.add(7);
         lhset2.add(0);
         lhset2.add(67);
         lhset2.add(89);
         lhset2.add(66);
        
         
         for(Integer numbers :lhset2){
        	 System.out.println(numbers); 
         }
         
         
         
    }

}
