package com.srm.primitiveandwrapper;

import java.util.ArrayList;
import java.util.List;

public class MyPrimitives {
	

	
	public void myMethod(){
	   
		int a=1;
	    int b=2;
	    int c=3;
	    int d=4;
	    int e=5;
	
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		list.add(e);
		
		for(int var : list){
			
		}
		
		
	
		
		
		
	}
	
		
	public static void main(String arg[]){
		
		MyPrimitives obj = new MyPrimitives();
		obj.myMethod();
		
		
	}

}
