package com.srm.stringmanipulation;

public class MyToken {
	
	 public static void main(String args[]){  
		  
		 String str = "Satebank of India,Tambaram Branch,Chennai";
		 
		 System.out.println("String Length : "+str.length());
		 
		 String [] strarray =  str.split(",");
		 for(String token :strarray){
			 System.out.println(token);
		 }

			
		   
	 }  

}
