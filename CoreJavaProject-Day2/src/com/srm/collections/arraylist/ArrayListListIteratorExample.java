package com.srm.collections.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListListIteratorExample {
	
	public static void main(String arg[]){
		
		
		ArrayList<String> arrlist = new ArrayList<String>();  
		
		arrlist.add("Marimuthu R");  
		arrlist.add("Chinnasamy R");  
		arrlist.add("Senthilkumar R");  
		arrlist.add("Moorthy R");  
		arrlist.add("Ananda Babu G");  
		
		System.out.println("============================ Forward Direction =====================================");   
		  
		ListIterator<String> iterator = arrlist.listIterator();  
		while (iterator.hasNext())  
		{  
			String i = iterator.next();  
			System.out.println(i);  
		}  
		
		
		System.out.println("============================ Backward Direction =====================================");   
		
		while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
		
		
	}
	

}
