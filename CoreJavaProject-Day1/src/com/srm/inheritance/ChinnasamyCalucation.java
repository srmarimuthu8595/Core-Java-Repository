package com.srm.inheritance;

public class ChinnasamyCalucation extends Calculation{
	
	public void division(int a,int b){
		int result = a/b;
		System.out.println("Division Result ="+result);
		
	}
	
	
     public static void main(String arg[]){
		
		ChinnasamyCalucation obj = new ChinnasamyCalucation();
		obj.addition(20, 20);
		obj.substraction(20, 20);
		obj.division(30, 30);
	}
	

}
