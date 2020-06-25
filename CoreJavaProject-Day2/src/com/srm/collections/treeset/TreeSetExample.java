package com.srm.collections.treeset;

import java.util.TreeSet;

public class TreeSetExample {
	
    public static void main(String args[]) {
    	
    	
    	 System.out.println("================================== Strings ==================================");
    	
        // TreeSet of String Type
        TreeSet<String> customers = new TreeSet<String>();

        // Adding elements to TreeSet<String>
        customers.add("Marimuthu R");
        customers.add("Zerald N");
        customers.add("Duraisamy N");
        customers.add("Sengottaiyan S");
        customers.add("Ponnusamy R");
        customers.add("Anandakumar K");

        for(String customer:customers){
        	
        	System.out.println(customer);
        	
        }
        
        System.out.println("================================== Numbers==================================");
        
        // TreeSet of Integer Type
        TreeSet<Integer> amounts = new TreeSet<Integer>();

        // Adding elements to TreeSet<Integer>
        amounts.add(3000000);
        amounts.add(900000);
        amounts.add(800000);
        amounts.add(700000);
        amounts.add(600000);
        amounts.add(500000);
        amounts.add(400000);
        amounts.add(300000);
        amounts.add(200000);
        amounts.add(100000);
       
        
        for(Integer amount:amounts){
        	
        	System.out.println(amount);
        	
        }
        
   }

}
