package com.srm.stringmanipulation;

public class SubsStringExamples {
	
	public static void main(String args[]){  
		
		String s1="Saving Account";  
		
		System.out.println(s1.substring(2,4));//returns vi 
		System.out.println(s1.substring(2));//returns vingAccount  
				
		System.out.println("Character at position 1 in this string : "+s1.charAt(1));
		
		System.out.println("Total Length of this string : "+s1.length());
		
		String s2 = s1.concat("||").concat("Current Account");
		
		System.out.println("Concatination Result : "+s2);
   }

}
