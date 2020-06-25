package com.srm.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
		
	public static void main(String arg []){
		
		ArrayListExample obj = new ArrayListExample();
		List<RetailBankCustomerDetails> custDetailsList = obj.getRetailBankCustomer();
		
		
		
		for(RetailBankCustomerDetails custDtl:custDetailsList){
		
			System.out.println("============= Customer Address Details===================");
		   
			System.out.println("Customer Id : "+custDtl.getCustomerId());
			System.out.println("Customer Name : "+custDtl.getCustomerName());
			System.out.println("Customer DOB : "+custDtl.getCustDOB());
			System.out.println("Account Type  : "+custDtl.getAccountType());
			System.out.println("Account Number  : "+custDtl.getAccountNo());
			System.out.println("Contact Number  : "+custDtl.getAccountNo());
			
			 System.out.println("============= Customer Address Details===================");
			
			for(CustomerAddressDetails custaddDtl :custDtl.getCustAddressDtl()){
				
				System.out.println("Address Type : "+custaddDtl.getAddressType());
				System.out.println("Address : "+custaddDtl.getAddress());
				System.out.println("Street : "+custaddDtl.getStreet());
				System.out.println("City : "+custaddDtl.getCity());
				System.out.println("State : "+custaddDtl.getState());
				System.out.println("Postal Code : "+custaddDtl.getPostalcode());
				
				
			}
						
		}
	
	
	}
	
	
	
	public List<RetailBankCustomerDetails> getRetailBankCustomer(){
	
		 
		List<RetailBankCustomerDetails> custDetailsList= new ArrayList<RetailBankCustomerDetails>();
		
		RetailBankCustomerDetails cust1 = new RetailBankCustomerDetails();
		
		cust1.setCustomerId(10000);
		cust1.setCustomerName("Marimuthu R");
		cust1.setCustDOB("10-03-1978");
		cust1.setAccountType("Saving Account");
		cust1.setAccountNo("SBIAC100200300400");
		cust1.setContactNo("91 -9840633484");
		
		List<CustomerAddressDetails> cust1addList = new ArrayList<CustomerAddressDetails>();
		
		CustomerAddressDetails cust1add1 = new CustomerAddressDetails();
		cust1add1.setAddressType("Perment");
		cust1add1.setAddress("106,Singanallur");
		cust1add1.setStreet("2nd Cross Street");
		cust1add1.setCity("Erode");
		cust1add1.setState("Tamilnadu");
		cust1add1.setPostalcode("638455");
		cust1addList.add(cust1add1);
		
		CustomerAddressDetails cust1add2 = new CustomerAddressDetails();
		cust1add2.setAddressType("Current Residential");
		cust1add2.setAddress("PlotNo:C5,Anbunagar 2nd Street");
		cust1add2.setStreet("2nd Cross Street");
		cust1add2.setCity("Chennai");
		cust1add2.setState("Tamilnadu");
		cust1add2.setPostalcode("600073");
		cust1addList.add(cust1add2);
		cust1.setCustAddressDtl(cust1addList);
		
        RetailBankCustomerDetails cust2 = new RetailBankCustomerDetails();
		
        cust2.setCustomerId(10001);
        cust2.setCustomerName("Chinnasamy R");
        cust2.setCustDOB("10-03-1980");
        cust2.setAccountType("Saving Account");
        cust2.setAccountNo("SBIAC100200300401");
        cust2.setContactNo("91 -9840633482");
		
		List<CustomerAddressDetails> custaddList2 = new ArrayList<CustomerAddressDetails>();
		
		CustomerAddressDetails cust2add1 = new CustomerAddressDetails();
		cust2add1.setAddressType("Perment");
		cust2add1.setAddress("200,Goundampalayam");
		cust2add1.setStreet("3rd Cross Street");
		cust2add1.setCity("Erode");
		cust2add1.setState("Tamilnadu");
		cust2add1.setPostalcode("638455");
		custaddList2.add(cust2add1);
		
		CustomerAddressDetails cust2add2 = new CustomerAddressDetails();
		cust2add2.setAddressType("Current Residential");
		cust2add2.setAddress("PlotNo:L11,Annanagar 7th Cross Street");
		cust2add2.setStreet("7th Cross Street");
		cust2add2.setCity("Chennai");
		cust2add2.setState("Tamilnadu");
		cust2add2.setPostalcode("600100");
		custaddList2.add(cust2add2);
		cust2.setCustAddressDtl(custaddList2);
        
		custDetailsList.add(cust1);
		custDetailsList.add(cust2);
		
		return custDetailsList;
	
	}
}


