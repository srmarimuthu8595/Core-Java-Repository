package com.srm.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String args[]){

	      LinkedList<String> list=new LinkedList<String>();

	      //Adding elements to the Linked list
	      list.add("Silver Credit Card");
	      list.add("Ruby Credit Card");
	      list.add("Dimond Credit Card");
	      list.add("Gold Credit Card");
	      list.add("Platinum Credit Card");

	      //Removing First element
	      //Same as list.remove(0);
	      //list.removeFirst();
	      
	    
	      //Removing Last element
	      //list.removeLast();

	      //Iterating LinkedList
	      Iterator<String> iterator=list.iterator();
	      while(iterator.hasNext()){
	         System.out.println(iterator.next()+" ");
	      }

	     
	   }

}
