package com.srm.object;

public class ClassAndMethods {
	
	
	public ClassAndMethods(){
		
	}
	
	public void  savingsAccount(){
		
		System.out.println("The savings account which will be used to save our  amount with monthly intrest");		
	}
	
	public void savingsAccount1(String str){
		
		System.out.println(str);
	}
	
	
	
	public String savingsAccount2(){
		
		String str="The savings account which will be used to save our  amount with monthly intrest";
		return str;
	}
	
	
	
		
	public static void main(String arg[]){
		
		ClassAndMethods obj = new ClassAndMethods();
		obj.savingsAccount();
		
		String str="The savings account which will be used to save our  amount with monthly intrest";
		obj.savingsAccount1(str);
		
		String str2 = obj.savingsAccount2();
		System.out.println(str2);
			
		
	}

}
