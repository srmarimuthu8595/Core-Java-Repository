package com.srm.accessmodifiers;

class DefaultModifier {
	
	
	DefaultModifier(){
		System.out.println("DefaultModifier Constructor");
	}

	int a =10;
	int b =10;
	
	void myResult(){
		int total = a+b;
		System.out.println("Total = "+total);
	}
	
	
	public static void main(String arg[]){
		
		DefaultModifier obj = new DefaultModifier();
		obj.myResult();
		
	}

}
