package com.srm.collections.queues;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class CustomPriorityBlockingQueueTester {

	public static void main(String[] args) {
	
		BlockingQueue<BankCustomerDetails> queue = new PriorityBlockingQueue<BankCustomerDetails>();
		 
		try {
			queue.put(new BankCustomerDetails("Marimuthu R", 30, 50000));
			queue.put(new BankCustomerDetails("Chinnasamy R", 25, 60000));
			queue.put(new BankCustomerDetails("Anand Babu G", 35, 80000));
			queue.put(new BankCustomerDetails("Senthilkumar R", 23, 99000));
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			 
		BankCustomerDetails customer = queue.poll();
		 
		while (customer != null) {
		    System.out.println(customer);
		    customer = queue.poll();
		}
		
		
		

	}

}
