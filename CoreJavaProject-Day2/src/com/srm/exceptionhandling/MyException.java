package com.srm.exceptionhandling;

public class MyException {

	public static void main(String[] args) {
		
		
		String str="Mari";
		
		try{
			
			System.out.println(str.length());
			
		}catch(Exception ex){
			System.out.println(ex);
		}finally{
			System.out.println("Finally Called");
		}
				
		
		
		

	}

}
