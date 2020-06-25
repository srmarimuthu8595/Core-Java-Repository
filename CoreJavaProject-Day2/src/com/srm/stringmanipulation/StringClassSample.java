package com.srm.stringmanipulation;

public class StringClassSample {
	
	public static void main(String[] args) {
		
		String s1="Mari";
		String s2="Muthu";
		String s3 ="Mari"+"Muthu";
		String s4="Mari";
		String s5="Muthu";
		String s6=null;
		String s7="Mari"+"Muthu"+"Erode";
		
		String str1 = new String("Mari");
		
		String str2 = new String("Mari");
		
		
		if(s1==s2){
			System.out.println("s1==s2 Equal===>");
		}{
			System.out.println("Not Equal===>");
		}
		
		if(str1==str2){
			System.out.println("str1==str2 Equal===>");
		}else{
			System.out.println("str1==str2 Not Equal===>");
		}
		
		if(s3==s7){
			System.out.println("s3==s7 Equal===>");
		}else{
			System.out.println("s3==s7 Not Equal===>");
		}
		
		
		/*if(s1==s4){
			System.out.println("s1==s4 Equal===>");	
		}else{
			System.out.println("Not Equal===>");
		}
		
				
		try{
			
			System.out.println("Length ========>"+s6.length());
			
		}catch(Exception ex){
			
			System.out.println("Exception =========>"+ex.getCause());
			
		}
		*/
	
		

	}


}
