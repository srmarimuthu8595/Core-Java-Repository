package com.srm.collections.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashmapExample {
	
	public static void main(String[] args) {
		
		Map<String,String> mymap = new HashMap<String,String>();
		
		
		//Collections.synchronizedMap(mymap);
		
				
		mymap.put("Key1","Mari");
		mymap.put("Key2","Muthu");
		mymap.put("Key3","Chennai");
		mymap.put("Key4","Erode");
		mymap.put("Key1","Tamaparam");
		
		System.out.println("Ke value====>"+mymap.get("Key2"));
		
		
		  for(Map.Entry m:mymap.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		  }  
		
		 
	}
	
	
	

}
