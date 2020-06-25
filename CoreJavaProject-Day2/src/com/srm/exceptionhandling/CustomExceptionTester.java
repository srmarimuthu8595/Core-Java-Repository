package com.srm.exceptionhandling;

public class CustomExceptionTester {
	
	int myBalanceAmount= 10000;

	public static void main(String[] args) {
		
		CustomExceptionTester obj = new CustomExceptionTester();
		try {
			
			int withdrawedamount= obj.cashWithdrawal(1000);
			System.out.println("My Withdrawal Amount : "+withdrawedamount);
			
			
		} catch (CashwithdrawalException exp) {
			
			System.out.println(exp);
			
		}
		

	}
	
	
	
	public int cashWithdrawal(int reqwithdrawalamt ) throws CashwithdrawalException{
	    
		int cashWithdrawedamount = 0;
		try{
			if(myBalanceAmount>reqwithdrawalamt){
				myBalanceAmount =(myBalanceAmount-reqwithdrawalamt);
				cashWithdrawedamount=reqwithdrawalamt;
			}else{
				throw new CashwithdrawalException("There is no enough money to withdraw");
			}
		}catch(CashwithdrawalException ex){
		   throw ex;	
		}
			
		return cashWithdrawedamount;
		
	}
	
	
	
	

}
