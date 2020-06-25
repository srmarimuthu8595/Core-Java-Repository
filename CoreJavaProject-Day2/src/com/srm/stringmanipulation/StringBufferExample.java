package com.srm.stringmanipulation;

public class StringBufferExample {
	
     public static void main(String[] args) {
		
		StringBuffer strbuff = new StringBuffer();
	
		strbuff.append("Customer Name : Marimuthu R").append("||");
		strbuff.append("Account Number : SBI100200300400").append("||");
		strbuff.append("Balance Amount : 30000.00").append("||");
		strbuff.append("Interest Amount : 300.00").append("||");
				
		System.out.println(" StringBuffer Result======>"+strbuff.toString());
		
		
		
		
	}
}
