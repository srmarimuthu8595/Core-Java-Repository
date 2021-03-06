package com.srm.collections.queues;

public class BankCustomerDetails implements Comparable<BankCustomerDetails>{  
	
	 	private String name;
	    private int age;
	    private int income;
	 
	    public BankCustomerDetails(String name, int age, int income) {
	        this.name = name;
	        this.age = age;
	        this.income = income;
	    }

	 
	    public int compareTo(BankCustomerDetails another) {
	      int value = 0;
			// return this.name.compareTo(another.name);
	    	
	    	if(this.age>age){
	    		value=1;
	    	}
	    	return value; 
	    }
	 
	    public String toString() {
	        return this.name + "\t" + this.age + "\t" + this.income;
	    }

}
