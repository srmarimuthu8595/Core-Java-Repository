package com.srm.stringmanipulation;

public class StringBuilderExample {
	
	public static void main(String[] args) {
		
		StringBuilder strbuild = new StringBuilder();
	
		strbuild.append("Customer Name : Marimuthu R").append("||");
		strbuild.append("Account Number : SBI100200300400").append("||");
		strbuild.append("Balance Amount : 30000.00").append("||");
		strbuild.append("Interest Amount : 300.00").append("||");
				
		System.out.println(" StringBuffer Result======>"+strbuild.toString());
			
		
	}
	

}
