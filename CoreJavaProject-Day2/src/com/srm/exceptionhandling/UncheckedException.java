package com.srm.exceptionhandling;

public class UncheckedException {
	
	public static void main(String args[])
	   {
		
		try{
			UncheckedException obj = new UncheckedException();
			obj.calculate();
			
		}catch(ArithmeticException ex){
			
			System.out.println(ex);
			
		}
		
	 }
	
	
	
	  public void calculate() throws ArithmeticException{
		  
		  int customerBalace=10000;
			int interrestRate=2;
			
			int interest= (customerBalace*interrestRate)/0;
			
			System.out.println(interest);
		  
	  }
	

}
