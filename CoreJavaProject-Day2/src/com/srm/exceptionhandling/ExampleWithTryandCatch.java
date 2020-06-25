package com.srm.exceptionhandling;

public class ExampleWithTryandCatch {
	
	public static void main(String args[])
	   {
		int x = 0;
		int y = 10;
		try{
		   
		   int num= y/x;
		   System.out.println("next-statement: Inside try block");
		
		}catch(ArithmeticException ex){
			System.out.println("Arithametic Exception Occurred"+ex);
		}catch(Exception ex){
			System.out.println("General Exception Occurred"+ex);
		}  
		
	  
		System.out.println("next-statement: Outside of try-catch");
	 }

}
