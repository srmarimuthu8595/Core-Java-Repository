package com.srm.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializableExample {

	public static void main(String[] args) throws Exception {
		
		  ObjectInputStream in=new ObjectInputStream(new FileInputStream("customer.txt"));  
		  BankCustomerDetails cust1 =(BankCustomerDetails)in.readObject();  
		  System.out.println(cust1.customerId +" "+cust1.customerName+" "+cust1.password);  
		  in.close();  

	}

}
