package com.srm.java8.lambda;

public class LambdaExpressionwithMultipleParameter {
	
	public static void main(String args[]) {
		MyFunctionalInterfaceP2 strconact = (str1, str2) -> str1 + str2;
        System.out.println("Result: "+strconact.strConcat("SBI ", "Banklimited"));
    }

}
