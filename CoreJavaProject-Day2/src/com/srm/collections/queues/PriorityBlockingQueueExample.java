package com.srm.collections.queues;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueExample {
	
	public static void main(String arg[]){
		BlockingQueue<String> queue = new PriorityBlockingQueue<>();
		 
		try {
			
			/*queue.put("A Salary Processing");
			queue.put("B Savinga Account NFT");
			queue.put("C Current Account NFT");
			queue.put("D Loan Account NFT");*/
			
			/*queue.put("Salary Processing");
			queue.put("Savinga Account NFT");
			queue.put("Current Account NFT");
			queue.put("Loan Account NFT");*/
			
			queue.put("1");
			queue.put("5");
			queue.put("2");
			queue.put("4");
			
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
		String element = queue.poll();
		 
		while (element != null) {
		   
			System.out.println(element);
			 element = queue.poll();
		   
		}
	}
	
	
	

}
