package com.srm.java8.methodreference;

public class MethodreferencetoInstanceMethodofanobject {
	
	 public void printMyDetails(){  
			System.out.println("R.Marimuthu , 91 Singanallur(Po)");  
	 }
	 
	 public static void main(String[] args) {  
		 MethodreferencetoInstanceMethodofanobject obj = new MethodreferencetoInstanceMethodofanobject();   
		
		 MyFunctionalInterface ref = obj::printMyDetails;  
		  
		ref.displayMyDetails();  
	}  

}
