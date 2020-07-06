package com.srm.java8.lambda;


public class LambdaExpressionwithnoparameter {
	
	public static void main(String args[]) {
		MyFunctionalInterfaceLMDA msg = () -> {
    		return "R.Marimuthu,91 Singanallurpost,Kavunthpadi(via)";
    	};
        System.out.println(msg.displayMyDetails());
    }

}
