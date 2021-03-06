package com.srm.junit.testcase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.srm.junit.logic.BankDeposit;

public class BankDepositTest {
	
	String accountNumber="3452345234";
	String status;
	int totalBalance;
	
	
	BankDeposit obj;
	
	
	@Before
	public void testValidateCustomerDetails() throws Exception {
		obj= new BankDeposit();
		status=obj.validateCustomerDetails(accountNumber);
	}
	
	@Test
	public void testFindMax(){
		obj= new BankDeposit();
		totalBalance=obj.doDeposit(200);
	}
	
	@After
	public void testStatus() throws Exception {
		System.out.println("Customer Validation Status :"+status);
		System.out.println("Total Balance :"+totalBalance);
		
	}

}
