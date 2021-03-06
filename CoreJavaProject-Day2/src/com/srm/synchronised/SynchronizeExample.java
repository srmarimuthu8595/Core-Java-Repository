package com.srm.synchronised;

public class SynchronizeExample {
	
	void printNumbers1(int n) throws InterruptedException 
    {
        synchronized (this) 
        {
            for (int i = 1; i <= n; i++) 
            {
                System.out.println(Thread.currentThread().getName() + " :: "+  i);
                Thread.sleep(500);
               // Thread obj = new Thread();
               // obj.wait(5000);
            }
        }
		
		/*for (int i = 1; i <= n; i++) 
        {
            System.out.println(Thread.currentThread().getName() + " :: "+  i);
            Thread.sleep(500);
           
           
        }*/
		
    }
	
	
	public synchronized void printNumbers2(int n) throws InterruptedException 
    {
          for (int i = 1; i <= n; i++) 
            {
                System.out.println(Thread.currentThread().getName() + " :: "+  i);
                Thread.sleep(500);
            }
        
    }
		

}
