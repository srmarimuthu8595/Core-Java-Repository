package com.srm.exceptionhandling;

public class TryWithMultipleCatchAndFinally {
	
	public static void main(String args[]){  
		try{  
			
			int balacneAmount=1000000;
			int interestRate=2;
			
			int interest =(balacneAmount*interestRate)/0;
			
			int totalAmount = balacneAmount+interest;
			
			System.out.println("Total Amount : "+totalAmount);
			
		}  
		catch(NullPointerException e){
			System.out.println(e);
		} 
		catch(NumberFormatException ex){
			System.out.println(ex);
		}
		catch(ArithmeticException ex){
			System.out.println("Marimuthu R");
			System.out.println(ex);
		} 
		catch(Exception ex){
			System.out.println("Chinnasamy R");
			System.out.println(ex);
		} 
		finally{
			System.out.println("finally block is always executed");
		}  
		System.out.println("rest of the code...");  
	}  

}
