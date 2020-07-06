package com.srm.java8.methodreference;

public class Methodreferencetoaninstancemethodofanobject {
	
	 public void printMyDetails(){  
			System.out.println("R.Marimuthu , 91 Singanallur(Po)");  
	 }
	 
	 public static void main(String[] args) {  
		 Methodreferencetoaninstancemethodofanobject obj = new Methodreferencetoaninstancemethodofanobject();   
		
		 MyFunctionalInterface ref = obj::printMyDetails;  
		  
		ref.displayMyDetails();  
	}  

}
