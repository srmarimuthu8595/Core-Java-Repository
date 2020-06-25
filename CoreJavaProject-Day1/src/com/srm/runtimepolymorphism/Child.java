package com.srm.runtimepolymorphism;

public class Child extends Parent{
	
	public void add(int a,int b){
		int result =a+b;
		System.out.println("Child class int + int add result = "+result);
		
	}
	
	public void add(int a,float b){
		float result =a+b;
		System.out.println("Child class int + float  add result = "+result);
		
	}
	
		
	public static void main(String[] args) {
	
		Parent parentobj = new Parent();
		parentobj.add(10,10);
		
		Child childobj = new Child();
		childobj.add(10, 20);
		
		Parent pobj = new Child(); // Up casting
		pobj.add(10, 20.6f);
		
		Child obj = new Parent(); //Down casting Impossible
							
	}

}
