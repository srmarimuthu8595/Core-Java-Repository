package com.srm.java8.methodreference;

public class MethodreferencetoAconstructor {
	
	public static void main(String[] args) {  
		MyInterface2 obj = MyMessage::new;  
		obj.getMessage("State Bank of India");  
    }  

}
