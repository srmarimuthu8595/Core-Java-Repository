package com.srm.synchronised;

public class Main {
	
	public static void main(String args[]) 
    {
       
		final SynchronizeExample obj = new SynchronizeExample();
		 
        //first thread
        Runnable r = new Runnable() 
        {
        	
        	
            public void run() 
            {
                try {
                	obj.printNumbers1(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
       
        Thread obj1 =  new Thread(r, "ONE");
        obj1.start();
       
        
        new Thread(r, "TWO").start();
    }
	
}


