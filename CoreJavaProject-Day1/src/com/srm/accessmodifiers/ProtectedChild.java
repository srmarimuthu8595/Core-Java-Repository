package com.srm.accessmodifiers;

public class ProtectedChild extends ProtectedModifier{

	public static void main(String[] args) {
		
		ProtectedChild obj = new ProtectedChild();
		String companyname = obj.getCompanyDetails();
		
		System.out.println("My Company Name is :"+companyname);

	}

}
