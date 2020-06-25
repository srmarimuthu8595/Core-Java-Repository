package com.srm.runtimepolymorphism;

public class Parent {
	
	public void add(int a,int b){
		int result =a+b;
		System.out.println("Parent class int + int add result = "+result);
		
	}
	
	public void add(int a,float b){
		float result =a+b;
		System.out.println("Parent class integer + float  add result = "+result);
		
	}

}
