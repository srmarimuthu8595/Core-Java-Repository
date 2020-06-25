package com.srm.primitiveandwrapper;

import java.util.ArrayList;
import java.util.List;

public class MyWrapper {
	

	

	
	
	public void myMethod(){
		
		int x=10;
		Integer z =(Integer)x; //Autoboxing
		
		int y =z; //Unboxing
		
	   
		Integer a=1;
		Integer b=2;
		Integer c=3;
		Integer d=4;
		Integer e=5;
	
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);
		
		for(int result : list){
		
		  System.out.println("Result ="+result);	
			
		}
				
	}
	
		
	public static void main(String arg[]){
		
		MyWrapper obj = new MyWrapper();
		obj.myMethod();
		
		
	}


}
