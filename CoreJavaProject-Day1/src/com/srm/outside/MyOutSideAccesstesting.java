package com.srm.outside;

import com.srm.accessmodifiers.PrivateModifier;
import com.srm.accessmodifiers.PublicModifier;

public class MyOutSideAccesstesting {

	public static void main(String[] args) {
		
		PublicModifier obj = new PublicModifier();
		String companyName= obj.getMyCompanyName();
		System.out.println("My Company Name : "+companyName);
		
		//PrivateModifier pboj = new PrivateModifier();
		
		//DefaultModifier dobj = new DefaultModifier();
		
		
	}

}
