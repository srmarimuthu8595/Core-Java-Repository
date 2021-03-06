package com.srm.collections.queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	
	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();
		
		queue.add("Monthly Salary Processing");
		queue.add("Current Account Widthdrawal Processing");
		queue.add("Saving Account Widthdrawal Processing");
		queue.add("Loan Amount Disburse");
		
		queue.poll();    //If header is not available it will not through any exception.
		
		queue.remove();  //If header is not available it will throughJava.util.NoSuchElementException.
		
		System.out.println(queue);
			
		queue.remove("Current Account Widthdrawal Processing");
		
		
		
		System.out.println(queue);
		
		System.out.println("Queue Size: " + queue.size());
		
		System.out.println("Queue Contains element Monthly Salary Processing or not? : " + queue.contains("Monthly Salary Processing"));

		// To empty the queue
	
		queue.clear();
	}

}
