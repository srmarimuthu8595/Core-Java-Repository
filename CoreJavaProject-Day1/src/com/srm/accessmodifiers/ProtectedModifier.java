package com.srm.accessmodifiers;

public class ProtectedModifier {
	
	protected int total =10000;
	
	protected ProtectedModifier(){
		
		System.out.println("Protected Constructor called ");
	}
	
	protected String getCompanyDetails(){
		return "SKM Feeds";
	}
		
	
	public static void main(String arg[]){
		
		ProtectedModifier obj = new ProtectedModifier();
		String companyname = obj.getCompanyDetails();
		System.out.println("My Company Name is :"+companyname);
		
	}
	
	

}
