package com.srm.outside;

import com.srm.accessmodifiers.ProtectedModifier;

public class ProtectedOutSide extends ProtectedModifier{
	
	
	public static void main(String str[]){
		
		ProtectedOutSide obj = new ProtectedOutSide();
		
		String companyname = obj.getCompanyDetails();
		System.out.println(" My Company Name is :"+companyname);
		
		//ProtectedModifier obj2 = new ProtectedModifier();  // We have to change the access to public then only we can create object here
		
	}
	

}
