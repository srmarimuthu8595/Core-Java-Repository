package com.srm.java8.stream;

import java.util.StringJoiner;

public class MyStringJoiner {
	
	
	public static void main(String[] args)
     {
		 StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter   
         
	        // Adding values to StringJoiner  
	        joinNames.add("R.Marimuthu");  
	        joinNames.add("B.Tech");  
	        joinNames.add("Information Technology");  
	        joinNames.add("Computer Science");  
	                  
	        System.out.println(joinNames);  
	        
	        
	        
	        
	        StringJoiner address = new StringJoiner(",", "[", "]");   // passing comma(,) and square-brackets as delimiter   
	          
	        // Adding values to StringJoiner  
	        address.add("Marimuthu R");  
	        address.add("Singanallur(Post)");  
	        address.add("Kaunthpadi(Via)");  
	        address.add("Erode");  
	                  
	        System.out.println(address);  
		 
     }

}
