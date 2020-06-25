package com.srm.stringmanipulation;
import java.util.StringTokenizer;

public class StringTokenizerExample {
	
	 public static void main(String args[]){  
		  
		  StringBuilder strbuild = new StringBuilder();
			
		  strbuild.append("Customer Name : Marimuthu R").append("||");
		  strbuild.append("Account Number : SBI100200300400").append("||");
		  strbuild.append("Balance Amount : 30000.00").append("||");
	      strbuild.append("Interest Amount : 300.00").append("||");
	      strbuild.append("Tax Amount : 3000.00");
	      
	      //System.out.println(strbuild.toString());	      
		 
		 StringTokenizer st = new StringTokenizer(strbuild.toString(),"||");
	     
		 while (st.hasMoreTokens()) {
	         System.out.println(st.nextToken());
	     }
		 
		   
	 }  

}
