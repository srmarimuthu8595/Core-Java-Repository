package com.srm.accessmodifiers;

public class PublicModifier {
	
	public String name="Chinnasamy R";
	
	public PublicModifier(){
		
	}
	
	public String getMyCompanyName(){

		return "S.K.M Feeds";
		
	}
	
	public static void main(String arg[]){
		
		PublicModifier obj = new PublicModifier();
		String companyname =obj.getMyCompanyName();
		System.out.println("My Company Name :"+companyname);
		
	}
	

}
