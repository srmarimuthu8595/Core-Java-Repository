package com.srm.java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionWithForeachLoop {
	
	public static void main(String[] args) {       
	       List<String> list=new ArrayList<String>();  
	       list.add("Current Account");         
	       list.add("Savins Account");       
	       list.add("Loan Account");         
	       list.add("Credit Card Account");         
	       list.add("Corporate Account");                
	       list.forEach(          
	            (account)->System.out.println(account)         
	       );     
	    }  

}
