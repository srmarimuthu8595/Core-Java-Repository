package com.srm.accessmodifiers;

import java.util.ArrayList;
import java.util.List;

public class PrivateModifier {
	
	private int a=10000;
	private static PrivateModifier obj;
	
	private PrivateModifier(){
	   System.out.println("Private Modifier Constructor");	
	}
	
	
	public static PrivateModifier createObject(){
		if (obj!=null){
			obj= new PrivateModifier();
		}
		return obj;
	}
	
	
	public Integer myOneyearTotalWithdrawAmount(String accno){
		
		Integer sumofamount=0;
		
		// Say here some functionality is there to check customer backgroud detail
		
		List<Integer> myoneyeartotalwithdrawamount = customerExistingWithdrawDetails(accno);
		
		sumofamount=calculateAmount(myoneyeartotalwithdrawamount);
		
		// Say here some functions are there to update the audit details 
		
		return sumofamount;
		
	}
	
	
	private List<Integer> customerExistingWithdrawDetails(String accno){
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(1000));
		list.add(new Integer(2000));
		list.add(new Integer(3000));
		list.add(new Integer(4000));
		list.add(new Integer(5000));
		return list;
	}
	
	
	
	private Integer calculateAmount(List<Integer> list){
		
		Integer total = 0;
		for(Integer value:list){
		   total= total+value;
		}
	   return total;
	}
	
	public static void main(String arg[]){
		
		PrivateModifier obj = new PrivateModifier();
		
		Integer amount = obj.myOneyearTotalWithdrawAmount("AB20304040");
		
		System.out.println("Amount = "+amount);
		
		
	}
	
	
	private class brach{
		
		
		
		
		
		
	}
	
	

}
