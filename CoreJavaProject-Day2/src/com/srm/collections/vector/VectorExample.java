package com.srm.collections.vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {
	
	public static void main(String args[]) {
	   
	      Vector<String> vec = new Vector<String>();
	      
	      System.out.println("Default capacity is: "+vec.capacity());
	      System.out.println("Default Size  :"+vec.size());
	      
	      vec.addElement("Savings Account");
	      vec.addElement("Current Account");
	      
	      System.out.println("Size After First Addition :"+vec.size());
	      System.out.println("Capacity After first Increment is: "+vec.capacity());
	      
	      vec.addElement("Credit Crad Account");
	      vec.addElement("Corporate Accounts");
	      vec.addElement("Loyalty Point Accounts");
	      vec.addElement("Pre Paid Accounts");
	      
	      System.out.println("Size After Second Addition :"+vec.size());
	      System.out.println("Capacity After 2nd Increment is: "+vec.capacity());
	      
	      
	      
	      vec.addElement("Savings Account");
	      vec.addElement("Current Account");
	      vec.addElement("Credit Crad Account");
	      vec.addElement("Corporate Accounts");
	      vec.addElement("Loyalty Point Accounts");
	      vec.addElement("Pre Paid Accounts");
	      
	      System.out.println("Size After Third Addition : "+vec.size());
	      System.out.println("Capacity After Third Increment is: "+vec.capacity());

	      Enumeration en = vec.elements();
	      System.out.println("\nElements are:");
	      System.out.println("\n");
	      while(en.hasMoreElements())
	         System.out.println(en.nextElement() + " ");
	   }

}
