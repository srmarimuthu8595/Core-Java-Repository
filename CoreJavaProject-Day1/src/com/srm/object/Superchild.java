package com.srm.object;

public class Superchild extends SuperParent{
	
	public static String bankname="SBI Bank";
	
	public Superchild(){
		super();
		System.out.println("Parent Class Variable value  :"+ super.name);
		super.add(10,10);
		System.out.println("Bank Name :"+this.bankname);
	}
	
	public void ptinrvalues(){
		System.out.println("Parent Class Variable value  :"+ super.name);
		super.add(10,10);
	}
		
	public static void main(String arg[]){
		
	     Superchild obj = new Superchild();
	    		
	}
	
	

}
