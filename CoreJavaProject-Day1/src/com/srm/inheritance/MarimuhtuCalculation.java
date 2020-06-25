package com.srm.inheritance;

public class MarimuhtuCalculation extends Calculation {
	
	public void multiplication(int a, int b){
      int result =a*b;
      System.out.println("Multiplication Result ="+result);
	}

	public static void main(String[] args) {
      
		MarimuhtuCalculation obj = new MarimuhtuCalculation();
		obj.addition(10, 10);
		obj.substraction(10, 10);
		obj.multiplication(10, 10);
		

	}

}
