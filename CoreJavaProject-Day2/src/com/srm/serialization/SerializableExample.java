package com.srm.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableExample {

	public static void main(String[] args) throws Exception{
		
	   BankCustomerDetails cust1 =new BankCustomerDetails(211,"Karuppannan R","Chennai@123");//creating object  
	   
		//writing object into file  
	    FileOutputStream f=new FileOutputStream("customer.txt");  
	    ObjectOutputStream out=new ObjectOutputStream(f);  
	    out.writeObject(cust1);  
	    out.flush();  
		  
	    out.close();  
		f.close();  
	    System.out.println("success");  
	}

}
