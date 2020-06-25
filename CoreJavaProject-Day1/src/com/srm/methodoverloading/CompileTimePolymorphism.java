package com.srm.methodoverloading;

public class CompileTimePolymorphism {

	  public void add(int a, int b){
		  int result =a+b;
		  System.out.println("The sum of two numbers = "+result);
	  }
	  
	  public void add(int a,int b,int c){
		  int result =a+b+c;
		  System.out.println("The sum of three numbers = "+result);
	  }
	
	  public void add(int a, int b,int c,int d){
		  int result =a+b+c+d;
		  System.out.println("The sum of four numbers = "+result);
	  }
	
	public static void main(String[] args) {
		
		CompileTimePolymorphism obj = new CompileTimePolymorphism();
		
		obj.add(10, 10);
		obj.add(10, 20, 30);
		obj.add(10, 20, 30, 40);
		

	}

}
