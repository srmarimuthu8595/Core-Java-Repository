package com.srm.inheritance;

public class MyResult {

	public static void main(String arg[]){
		
		ChinnasamyCalucation obj = new ChinnasamyCalucation();
		obj.addition(20, 20);
		obj.substraction(20, 20);
		obj.division(30, 30);
		
		//Down Casting
		//ChinnasamyCalucation obj = new Calculation();
		 
		//Up Casting
		
		Calculation upobj = new ChinnasamyCalucation();
		upobj.addition(40, 40);
		upobj.substraction(20, 20);
		
		
	}

}
