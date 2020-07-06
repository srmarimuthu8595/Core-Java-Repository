package com.srm.java8.methodreference;

import java.util.function.BiFunction;

public class MethodreferencetoAstaticmethodofAclass {
	
	 public static void main(String[] args) {  
		BiFunction<Integer, Integer, Integer> product = Multiplication::multiply;  
		int pr = product.apply(11, 5);  
		System.out.println("Multiplication value is: "+pr);  
	}  

}
